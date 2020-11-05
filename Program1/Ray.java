/*
Michael Vecchio
CSC205AB 13608
2/5/2018
Custom Ray Creator
*/
public class Ray
{
	//------ data
	protected Point endPoint;
	protected int direction;

	//------ constructors

	//Default Constructor
	public Ray()
	{
		this.endPoint = new Point(3,4);
		this.direction = 135;
	}

	//Parameterized Constructor - receives an endpoint and the direction as ints
	public Ray(Point rayEndPointInput, int rayDirectionInput)
	{
		if(rayEndPointInput == null)
			throw new IllegalArgumentException("The EndPoint is Null.");
		if(rayDirectionInput < 0  || rayDirectionInput > 359)
			throw new IllegalArgumentException("Direction can't be less than zero, or greater than 359.");
		this.endPoint = new Point(rayEndPointInput); //deep copy
		this.direction = rayDirectionInput;
	}

	//Copy Constructor
	public Ray(Ray another)
	{
		if(another == null)
			throw new IllegalArgumentException("Ray is null.");
		this.direction = another.direction; //deep copy
		this.endPoint = new Point(another.endPoint); //deep copy
	}

	//------ methods

	//toString - returns its representation as a String
	public String toString()
	{
		return endPoint + "----->" + direction;
	}

	//translate - translates or shifts itself by the distances passed in
	public void translate(int xmove, int ymove)
	{
		this.endPoint.translate(xmove, ymove);
	}

	//rotate - changes the direction of the angle
	public void rotate(int angle)
	{
		int directionTimesPassed360 = 0;
		int directionTimesPassedMultiplied;
		int directionNewAngle;

		if(angle < 0)
			throw new IllegalArgumentException("Angle can't be negative!");

		this.direction = this.direction + angle;

		//Calculations for how many times 360 was passed, creating the new angle
		if(this.direction >= 360)
		{
			directionTimesPassed360 = this.direction / 360;
			directionTimesPassedMultiplied = directionTimesPassed360 * 360;
			directionNewAngle = this.direction - directionTimesPassedMultiplied;
			this.direction = directionNewAngle;
		}
	}

	//equals - returns true if this instance equals what is recived
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;

		Ray objRay = (Ray)obj;

		return (this.endPoint.equals(objRay.endPoint) &&
				this.direction == objRay.direction);
	}

	//isOpposite - returns true if the instance and the Ray that is received are opposites.
	public boolean isOpposite(Ray another)
	{
		if(another == null)
			throw new IllegalArgumentException("The second array is null");

		int is180Dir = this.direction - another.direction;
		int is180DirAnoth = another.direction - this.direction;
		if(this.endPoint.equals(another.endPoint) && is180Dir == 180)
			return true;
		if(this.endPoint.equals(another.endPoint) && is180DirAnoth == 180)
			return true;
		else
			return false;
	}

	//aboveXAxis - true if any part of the Ray extends to above the x-axis.
	public boolean aboveXAxis()
	{
		if(this.endPoint.inQuadrant(1) || this.endPoint.inQuadrant(2) == true || (this.direction > 0 && this.direction < 180))
			return true;
		else
			return false;
	}
}

