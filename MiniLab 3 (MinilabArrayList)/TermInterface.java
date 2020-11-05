public interface TermInterface
{
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
	public String toString();

	//evaluate - evalutes with whatever double is received
	public double evaluate(double value);

	//degree - 	if coefficient is 0, then (it is a constant so) returns 0.
	//					else returns the power
	public int degree();

	//derivative - 	return a new Term that is the derivative.   The derivative
	//						is calculated by:
	//							the coefficient of the derivative is the original coefficient times the power
	//							the power of the derivative is the original power minus 1
	public Term derivative();

	//addIn: add another Term to itself.
	//The Term that is received is not changed.
	//	if the Term that is received is null, throw a new IllegalArgumentException(<your descriptive String here>)
	//  if the powers are not the same, throw a new IllegalArgumentException(<your descriptive String here>)
	public void addIn(Term anotherTerm);

	//multiplyBy: multiply itself by anotherTerm - result is a new Term that is created and returned.
	//The original Term and the Term that is received are not changed.
	//	if the Term that is received is null, throw a new IllegalArgumentException(<your descriptive String here>)
	public Term multiplyBy(Term anotherTerm);

	//equals: returns true if it is the same as what is received.
	//      If both coefficients are 0, they are automatically equal
	//      otherwise, both coefficients AND both exponents must be the same
	public boolean equals(Object obj);
}
