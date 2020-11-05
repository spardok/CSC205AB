/*
Michael Vecchio
1/29/2018
Graph Point Creator
*/

public class Point
{
	// -------- data
	private int x;
	private int y;

	// -------- constructors
	//default constructor - sets the x,y to 1,1
	public Point()
	{
		this.x = 3;
		this.y = -5;
	}

	//parameterized constructor - sets the x,y to whatever is received
	public Point(int xValue, int yValue)
	{
		this.x = xValue;
		this.y = yValue;
	}

	//copy constructor
	public Point(Point another)
	{
		if(another == null)
			throw new IllegalArgumentException("Illegal Entry, Null is Not accepted.");
		else
		{
			this.x = another.x;
			this.y = another.y;
		}
	}

	// -------- methods

	//toString - returns its representation as a String
	public String toString()
	{
		return "(" + this.x + ", " + this.y + ")";
	}

	//inQuadrant - checks to see what point the quadrant is in
	public boolean inQuadrant(int theQuadrant)
	{
		if(theQuadrant <= 0 || theQuadrant >= 5)
			throw new IllegalArgumentException("The axes are not in any of the four quadrants");
		if(this.x == 0 && this.y == 0)
			return false;
		if(this.x == 0 && this.y >= 1)
			return false;
		if(this.x == 0 && this.y <= -1)
			return false;
		if(this.x >= 1 && this.y == 0)
			return false;
		if(this.x <= -1 && this.y == 0)
			return false;
		if(this.x > 0 && this.y > 0 && theQuadrant == 1)
			return true;
		if(this.x < 0 && this.y > 0 && theQuadrant == 2)
			return true;
		if(this.x < 0 && this.y < 0 && theQuadrant == 3)
			return true;
		if(this.x > 0 && this.y < 0 && theQuadrant == 4)
			return true;
		else
			return false;
	}

	//onXAxis - checks to see if the line runs across the X-Axis
	public boolean onXAxis()
	{
		if(this.y == 0)
			return true;
		else
			return false;
	}

	//translate - "moves" this Point by whatever xdistance and ydistance are received
	//					it does not return anything - just changes the x and y
	public void translate(int xdistance, int ydistance)
	{
		this.x = this.x + xdistance;
		this.y = this.y + ydistance;
	}

	//equals - returns true if this instance equals what is recived
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;

		Point objPoint = (Point)obj;

		return (this.x == objPoint.x &&
				this.y == objPoint.y);
	}

}
