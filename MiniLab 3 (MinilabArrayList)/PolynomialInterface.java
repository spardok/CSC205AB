// This interface will define the methods that must be present in any class that implements it
// The comments will serve as the requirements for the methods.

// The requirements for the extra credit are also listed in the comments, but the actual
// interface for those methods have been commented out.

public interface PolynomialInterface
{
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
	public void insert(Term aTerm);


	//toString -	returns its representation as a String
	//					Each term should use its own toString() when building up the String to return
	//					Terms in the toString() should be separated by  " + "   (OK to have 4x^3 + -2x^2)
//	public String toString();      //EXTRA CREDIT


	//toALString - returns its representation as a String by returning it's ArrayList's toString().
	public String toALString();


	//multiplyBy - 	receives another Polynomial and finds the product of itself and the Polynomial that is received.
	//						It the Polynomial that is received is null, it should
	//    							throw new IllegalArgumentException("your String");
	//						Creates and returns a new Polynomial that holds the answer.   Neither itself nor the
	//						Polynomial that is received are changed.
//	public Polynomial multiplyBy(Polynomial anotherPoly);      //EXTRA CREDIT


	//contains -	returns true if it contains the Term that is received.
	//					If the received Term is null, it should
	//    						throw new IllegalArgumentException("your String");
	//					(Term must have a correct .equals for it to work)
	public boolean contains(Term aTerm);


	//numTerms - returns the number of Terms in this Polynomial
	public int numTerms();


	//evaluate - returns what the entire Polynomial evaluates to, using the received value of x
	public double evaluate(double x);

}
