/*
Michael Vecchio
CSC205AB 13608
2/5/2018
Text Styler for Rays
*/
public class StyleRay extends Ray
{
	//------ data
	private String style;

	//------- constructors

	//Default Constructor
	public StyleRay()
	{
		super();
		this.style = new String ("double");
	}

	//Parameterized Constructor
	public StyleRay(Point styleEndPointInput, int styleDirectionInput, String styleInput)
	{
		if(styleEndPointInput == null || styleInput == null )
			throw new IllegalArgumentException("The EndPoint or the Style is Null.");
		if(styleDirectionInput < 0  || styleDirectionInput > 359)
			throw new IllegalArgumentException("Direction can't be less than zero, or greater than 359.");
		if(!(styleInput.equals("double") || styleInput.equals("dashed") || styleInput.equals("dotted")))
			throw new IllegalArgumentException("Your style must be set as: double, dashed, or dotted.");
		this.endPoint = new Point(styleEndPointInput); //deep copy
		this.direction = styleDirectionInput; //deep copy
		this.style = new String(styleInput); //deep copy
	}

	//Copy Constructor
	public StyleRay(StyleRay another)
	{
		if(another == null)
			throw new IllegalArgumentException("Ray is Null.");
		this.direction = another.direction; //deep copy
		this.endPoint = new Point(another.endPoint); //deep copy
		this.style = new String(another.style); //deep copy
	}

	//------ methods

	//toString - returns its representation as a String
	public String toString()
	{
	if(style.equals("double"))
		return this.endPoint + "=====>" + this.direction;
	if(style.equals("dotted"))
		return this.endPoint + ".....>" + this.direction;
	if(style.equals("dashed"))
		return this.endPoint + "- - ->" + this.direction;
	else
		throw new IllegalStateException("Your Ray does not have a Style.");
	}

	//equals - returns true if this instance equals what is recived
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;

		StyleRay objStyleRay = (StyleRay)obj;

		return (this.endPoint.equals(objStyleRay.endPoint) &&
			this.direction == objStyleRay.direction);
	}
}



