/*
Michael Vecchio
1/29/2018
Mathematics Expression Solver
*/

public class Term implements TermInterface
{
	//----- data
	public int coefficient;
	public int power;

	//---- constructors

	//default constructor
	public Term()
	{
		coefficient = 2;
		power = 3;
	}

	//parameterized constructor
	public Term(int receivedCoefficient, int receivedPower)
	{
		this.coefficient = receivedCoefficient;
		this.power = receivedPower;
	}

	//copy constructor
	public Term(Term another)
	{
		if(another == null)
			throw new IllegalArgumentException("Illegal Entry, Null is Not accepted.");
		else
		{
			this.coefficient = another.coefficient;
			this.power = another.power;
		}
	}

	//------- methods

	// toString() - returns its representation as a String   3x^2   for example,
	// But to make it look better, follow this logic in order...
	//		-	if coefficient is 0, return "0"
	//		-	else if the power is 0, return the coefficient (as a String, concatenate with "")
	//		-	else if the coefficient is 1 and the power is 1, return "x"
	//		-	else if the coefficient is -1 and the power is 1, return "-x"
	//		-	else if the power is 1, return coefficient and "x"
	//		-	else if coefficient is 1, return "x^" and the power
	//		-	else if the coefficient is -1, return "-x^" and the power
	//		-	else return coefficient and "x^" and power
	public String toString()
	{
		if(coefficient == 0)
			return "0";
		else if(power == 0)
			return "" + coefficient;
		else if(coefficient ==  1 && power == 1)
			return "x";
		else if(coefficient == -1 && power == 1)
			return "-x";
		else if(power == 1)
			return coefficient + "x";
		else if(coefficient == 1)
			return "x^" + power;
		else if(coefficient == -1)
			return "-x^" + power;
		else
			return coefficient + "x^" + power;
	}

	//evaluate - evalutes with whatever double is received
	public double evaluate(double value)
	{
		double variable = value;
		double solveToPower = Math.pow(variable, (double)power);
		double solveEquation = solveToPower * coefficient;

		return solveEquation;
	}

	//degree - 	if coefficient is 0, then (it is a constant so) returns 0.
	//					else returns the power
	public int degree()
	{
		if(this.coefficient == 0)
			return 0;
		else
			return this.power;
	}

	//derivative - 	return a new Term that is the derivative.   The derivative
	//						is calculated by:
	//							the coefficient of the derivative is the original coefficient times the power
	//							the power of the derivative is the original power minus 1
	public Term derivative()
	{
		int derivativeCoeff = this.coefficient * this.power;
		int derivativePower = this.power - 1;
		Term derivative = new Term(derivativeCoeff, derivativePower);

		return derivative;
	}

	//addIn: add another Term to itself.
	//The Term that is received is not changed.
	//	if the Term that is received is null, throw a new IllegalArgumentException(<your descriptive String here>)
	//  if the powers are not the same, throw a new IllegalArgumentException(<your descriptive String here>)
	public void addIn(Term anotherTerm)
	{
		if(anotherTerm == null)
		{
			throw new IllegalArgumentException("It Is Null");
		}
		if(power != anotherTerm.power)
		{
			throw new IllegalArgumentException("Powers Are Not The Same");
		}
		this.coefficient = this.coefficient + anotherTerm.coefficient;
	}

	//multiplyBy: multiply itself by anotherTerm - result is a new Term that is created and returned.
	//The original Term and the Term that is received are not changed.
	//	if the Term that is received is null, throw a new IllegalArgumentException(<your descriptive String here>)
	public Term multiplyBy(Term anotherTerm)
	{
		if(anotherTerm == null)
			throw new IllegalArgumentException("Term Can't Be Null");

		int	multipliedCoefficient = this.coefficient * anotherTerm.coefficient;
		int multipliedPower = this.power + anotherTerm.power;
		Term multiplyBy = new Term(multipliedCoefficient, multipliedPower);

		return multiplyBy;
	}

	//equals: returns true if it is the same as what is received.
	//      If both coefficients are 0, they are automatically equal
	//      otherwise, both coefficients AND both exponents must be the same
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;

		Term objTerm = (Term)obj;

		if(this.coefficient == 0 && objTerm.coefficient == 0)
			return true;

		return (this.coefficient == objTerm.coefficient &&
				this.power == objTerm.power);
	}

	//isZero: returns true if this instance of a Term is 0 (has a 0 coefficient) public boolean isZero()
	public boolean isZero()
	{
		if(this.coefficient == 0)
			return true;
		else
			return false;
	}
}