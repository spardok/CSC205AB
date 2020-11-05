/*
Michael Vecchio
2/28/2018
Polynomial Creator
*/

import java.util.*;

public class Polynomial implements PolynomialInterface
{
	//---------- data
	private ArrayList<Term> myArray;

	//---------- constructors
	public Polynomial()
	{
			this.myArray = new ArrayList<Term>();
	}

	//----------- methods

	//insert - 	updates itself by inserting the Term that is received so that Terms in the resulting
	//						Polynomial are in descending order.
	//				if the received Term is null, it should
	//    					throw new IllegalArgumentException("your String");
	//				If the received Term isZero(), it should not be inserted
	//				If the received Term's degree is already present,
	//						then existing Term with the same degree just adds in the received Term.
	//				Otherwise, the received Term should be put into the correct place in the Polynomial
	//						so that the degrees are in descending order.   (just like a Math Polynomial).
	//				If the insertion results in a 0 Term in the Polynomial then the 0 Term should be removed.
	public void insert(Term aTerm)
	{
		if (aTerm == null) //checks to see if it is null, if so throws out an exception
		{
			throw new IllegalArgumentException("The received Term is null. Use a different Term.");
		}

		else if(aTerm.isZero()) //If the received Term isZero(), it should not be inserted
		{
			;
		}

		else if (myArray.isEmpty()) //if myArray is empty, add aTerm
		{
			myArray.add(aTerm);
		}
		//logic to check for proper polynomial placement
		else
		{
			int termDegree = aTerm.degree();
			int smallestDegree = myArray.get(myArray.size() - 1).degree();

			if (termDegree < smallestDegree)
			{
				myArray.add(aTerm);
			}
			else
			{
				for (int i=0; i<myArray.size(); i++)
				{
					int currentDegree = myArray.get(i).degree();

					if (termDegree == currentDegree)
					{
						myArray.get(i).addIn(aTerm);
						break;
					}
					else if (termDegree > currentDegree)
					{
						myArray.add(i, aTerm);
						break;
					}
				}
			}
			//end placement logic

			for (int i=0; i<myArray.size(); i++)
			{
				if(myArray.get(i).isZero()) //Remove Poly If Equal addIn Equals 0
				{
					myArray.remove(i);
				}
			}
		}
	}

	//toString -	returns its representation as a String
	//					Each term should use its own toString() when building up the String to return
	//					Terms in the toString() should be separated by  " + "   (OK to have 4x^3 + -2x^2)
	public String toString()      //EXTRA CREDIT
	{
		Object myArrayObject = myArray.toString();
		String myArrayAsString = "" + myArrayObject;
		myArrayAsString = myArrayAsString.replace(",", " +");
		myArrayAsString = myArrayAsString.replace("]", "");
		myArrayAsString = myArrayAsString.replace("[", "");

		return myArrayAsString;
	}

	//toALString - returns its representation as a String by returning it's ArrayList's toString().
	public String toALString()
	{
		return myArray.toString();
	}


	//multiplyBy - 	receives another Polynomial and finds the product of itself and the Polynomial that is received.
	//						It the Polynomial that is received is null, it should
	//    							throw new IllegalArgumentException("your String");
	//						Creates and returns a new Polynomial that holds the answer.   Neither itself nor the
	//						Polynomial that is received are changed.
	public Polynomial multiplyBy(Polynomial anotherPoly)     //EXTRA CREDIT
	{
		ArrayList<Term> multipliedArrays = new ArrayList<Term>();
		Polynomial answerMultiplyBy = new Polynomial ();
		Term firstPoly = new Term (0, 0);
		Term secondPoly = new Term (0, 0);
		Term multipliedTerm = new Term(0, 0);

		if (anotherPoly == null)
		{
			throw new IllegalArgumentException("The Polynomial Entered Is Null");
		}
		else
		{
			for (int i=0; i < myArray.size(); i++)
			{
				firstPoly = myArray.get(i);
				for (int j=0; j < anotherPoly.myArray.size(); j++)
				{
					secondPoly = anotherPoly.myArray.get(j);
					multipliedTerm = firstPoly.multiplyBy(secondPoly);
					answerMultiplyBy.insert(multipliedTerm);
				}
			}
		}
		return answerMultiplyBy;
	}

	//contains -	returns true if it contains the Term that is received.
	//					If the received Term is null, it should
	//    						throw new IllegalArgumentException("your String");
	//					(Term must have a correct .equals for it to work)
	public boolean contains(Term aTerm)
	{
		return myArray.contains(aTerm);
	}

	//numTerms - returns the number of Terms in this Polynomial
	public int numTerms()
	{
		return myArray.size();
	}

	//evaluate - returns what the entire Polynomial evaluates to, using the received value of x
	public double evaluate(double x)
	{
		double evaluatedPolynomial = 0;

		for (int i=0; i<myArray.size(); i++)
		{
			evaluatedPolynomial = myArray.get(i).evaluate(x) + evaluatedPolynomial;
		}
		return evaluatedPolynomial;
	}
}
