//This will run test cases for the Polynomial class.   It will not prompt for input,
//but is expecting input of the form "testing <what to test>"

public class PolynomialTesterNoMultiplyByHG
{
	public static void main(String[ ] args)
	{
		//get the arguments for the test - note no prompt!
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String test = kb.nextLine();
		System.out.println(test);

		if (test.equalsIgnoreCase("testing insert null") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			try
			{
				Term term1 = null;
				if (printDescription)
				{
					System.out.println("Starting with an empty Polynomial");
					System.out.println("\n===>Telling it to insert " + term1);
				}
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);

				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing insert new degree") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				if (printDescription)
				{
					System.out.println("Starting with an empty Polynomial");
					System.out.println("\n===>Telling it to insert " + term1 + " then " + term2 + " then " + term3);
					System.out.println("===>(all new degrees not yet in the Polynomial; all go at the end)");
				}
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				if (printDescription)
				{
					System.out.println("\nStarting with an empty Polynomial");
					System.out.println("\n===>Telling it to insert " + term3 + " then " + term2 + " then " + term1);
					System.out.println("===>(all new degrees not yet in the Polynomial; all go at the front)");
				}
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term3);
				thePoly.insert(term2);
				thePoly.insert(term1);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				if (printDescription)
				{
					System.out.println("\nStarting with an empty Polynomial");
					System.out.println("\n===>Telling it to insert " + term1 + " then " + term3 + " then " + term2);
					System.out.println("===>(all new degrees not yet in the Polynomial; last one goes in the middle)");
				}
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term3);
				thePoly.insert(term2);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing insert existing degree") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;
			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				Term existTerm = new Term(5, 6);

				//break up the SOP in case their insert does not work yet
				System.out.print("Starting with this Polynomial:  ");
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());

				System.out.println("\n===>Telling it to insert " + existTerm);
				System.out.println("===>(matches degree of first term)");

				thePoly.insert(existTerm);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				Term existTerm = new Term(9, 3);

				//break up the SOP in case their insert does not work yet
				System.out.print("\nStarting with this Polynomial:  ");
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());

				System.out.println("\n===>Telling it to insert " + existTerm);
				System.out.println("===>(matches degree of second term)");

				thePoly.insert(existTerm);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				Term existTerm = new Term(2, 2);

				//break up the SOP in case their insert does not work yet
				System.out.print("\nStarting with this Polynomial:  ");
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());

				System.out.println("\n===>Telling it to insert " + existTerm);
				System.out.println("===>(matches degree of last term)");

				thePoly.insert(existTerm);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing insert get zeros") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;
			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(0, 3);
				Term term3 = new Term(5, 2);

				System.out.println("Starting with an empty Polynomial");
				System.out.println("\n===>Telling it to insert " + term1 + " then " + term2 + " then " + term3);
				System.out.println("===>(second term has 0 coefficient)");

				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);

				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				Term makeZeroTerm = new Term(-3, 6);

				//break up the SOP in case their insert does not work yet
				System.out.print("\nStarting with this Polynomial:  ");
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());

				System.out.println("\n===>Telling it to insert " + makeZeroTerm);
				System.out.println("===>(turns first Term into 0)");

				thePoly.insert(makeZeroTerm);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				Term makeZeroTerm = new Term(-2, 3);

				//break up the SOP in case their insert does not work yet
				System.out.print("\n===>Starting with this Polynomial:  ");
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());

				System.out.println("\n===>Telling it to insert " + makeZeroTerm);
				System.out.println("===>(turns second Term into 0)");

				thePoly.insert(makeZeroTerm);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				Term makeZeroTerm = new Term(-5, 2);

				//break up the SOP in case their insert does not work yet
				System.out.print("\nStarting with this Polynomial:  ");
				Polynomial thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());

				System.out.println("\n===>Telling it to insert " + makeZeroTerm);
				System.out.println("===>(turns last Term into 0)");

				thePoly.insert(makeZeroTerm);
				System.out.println(thePoly.toALString());
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing evaluate") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;
			Polynomial thePoly = null;
			String origToString = "(empty)";

			try
			{
				Term term1 = new Term(2, 3);
				Term term2 = new Term(5, 2);
				Term term3 = new Term(4, 1);

				//break up the SOP in case their insert does not work yet
				System.out.print("Starting with this Polynomial:  ");
				thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());
				origToString = thePoly.toString();

				double x1 = 2;
				double x2 = 0;
				double x3 = -1.5;

				System.out.println("\n===>tell it to evaluate(" + x1 + ")");
				double answer = thePoly.evaluate(x1);
				System.out.print(answer);

				System.out.println("\n===>tell it to evaluate(" + x2 + ")");
				answer = thePoly.evaluate(x2);
				System.out.print(answer);

				System.out.println("\n===>tell it to evaluate(" + x3 + ")");
				answer = thePoly.evaluate(x3);
				System.out.print(answer);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (!origToString.equals(thePoly.toString()))
					System.out.println( "...BUT the original Polynomial changed during one of the operations");
				else
					System.out.println();
			}


		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing contains") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;
			Polynomial thePoly = null;
			String origToString = "(empty)";

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);
				Term lookForTerm0 = new Term(3,6);
				Term lookForTerm1 = new Term(2,3);
				Term lookForTerm2 = new Term(5,3);
				Term lookForTerm3 = new Term(2, 6);
				Term lookForTerm4 = new Term(5,2);

				//break up the SOP in case their insert does not work yet
				System.out.print("Starting with this Polynomial:  ");
				thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());
				origToString = thePoly.toALString();

				System.out.println("\n===>asking it if it contains " + lookForTerm0);
				boolean answer = thePoly.contains(lookForTerm0);
				System.out.println(answer);
			//	System.out.println(containsaTerm);

				System.out.println("===>asking it if it contains " + lookForTerm1);
				answer = thePoly.contains(lookForTerm1);
				System.out.println(answer);

				System.out.println("===>asking it if it contains " + lookForTerm2);
				answer = thePoly.contains(lookForTerm2);
				System.out.println(answer);

				System.out.println("===>asking it if it contains " + lookForTerm3);
				answer = thePoly.contains(lookForTerm3);
				System.out.println(answer);

				System.out.println("===>asking it if it contains " + lookForTerm4);
				answer = thePoly.contains(lookForTerm4);
				System.out.println(answer);

				System.out.println("===>asking it if it contains " + null);
				answer = thePoly.contains(null);
				System.out.println(answer);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (!origToString.equals(thePoly.toALString()))
					System.out.println( "...BUT the original Polynomial changed during one of the operations");
				else
					System.out.println();
			}
		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing numTerms") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;
			Polynomial thePoly = null;
			String origToString = "(empty)";

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 3);
				Term term3 = new Term(5, 2);

				//break up the SOP in case their insert does not work yet
				System.out.print("Starting with this Polynomial:  ");
				thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				System.out.println(thePoly.toALString());
				origToString = thePoly.toALString();

				System.out.println("\n===>asking it for numTerms()");
				int answer = thePoly.numTerms();
				System.out.println(answer);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (!origToString.equals(thePoly.toALString()))
					System.out.println( "...BUT the original Polynomial changed during the operation");
				else
					System.out.println();
			}

			try
			{
				Term term1 = new Term(3, 6);

				//break up the SOP in case their insert does not work yet
				System.out.print("Starting with this Polynomial:  ");
				thePoly = new Polynomial();
				thePoly.insert(term1);
				System.out.println(thePoly.toALString());
				origToString = thePoly.toALString();

				System.out.println("\n===>asking it for numTerms()");
				int answer = thePoly.numTerms();
				System.out.println(answer);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (!origToString.equals(thePoly.toALString()))
					System.out.println( "...BUT the original Polynomial changed during the operation");
				else
					System.out.println();
			}

			try
			{
				Term term1 = new Term(3, 6);
				Term term2 = new Term(2, 5);
				Term term3 = new Term(7, 4);
				Term term4 = new Term(-2, 3);
				Term term5 = new Term(5, 2);
				Term term6 = new Term(-3, 1);


				//break up the SOP in case their insert does not work yet
				System.out.print("Starting with this Polynomial:  ");
				thePoly = new Polynomial();
				thePoly.insert(term1);
				thePoly.insert(term2);
				thePoly.insert(term3);
				thePoly.insert(term4);
				thePoly.insert(term5);
				thePoly.insert(term6);
				System.out.println(thePoly.toALString());
				origToString = thePoly.toALString();

				System.out.println("\n===>asking it for numTerms()");
				int answer = thePoly.numTerms();
				System.out.println(answer);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (!origToString.equals(thePoly.toALString()))
					System.out.println( "...BUT the original Polynomial changed during the operation");
				else
					System.out.println();
			}
		}

		//***************************************************
		//***************************************************
/*
		if (test.equalsIgnoreCase("testing multiplyBy") ||
			test.equalsIgnoreCase("testing all"))
		{
			boolean printDescription = true;
			boolean checkChanges = true;
			Polynomial thePoly = null;
			String origToString = "(empty)";
			Polynomial argPoly = null;
			String argToString = "(empty)";
			System.out.println("(insert and toString must also work)");

			try
			{
				thePoly = new Polynomial();
				thePoly.insert(new Term(-6,1));
				thePoly.insert(new Term(2,0));
				thePoly.insert(new Term(4,2));   //add to empty
				origToString = thePoly.toString();

				argPoly = new Polynomial();
				argPoly.insert(new Term(2,1));
				argPoly.insert(new Term(-5,0));
				argToString = argPoly.toString();

				System.out.println("\n===> telling (" + thePoly + ") to multiplyBy(" + argPoly + ")");
				System.out.println(thePoly.multiplyBy(argPoly));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (!origToString.equals(thePoly.toString()) || !argToString.equals(argPoly.toString()))
					System.out.println( "...BUT the original Polynomial and/or argument Polynomial changed during the operation");
			}

			try
			{
				thePoly = new Polynomial();
				thePoly.insert(new Term(2,1));
				thePoly.insert(new Term(-5,0));
				origToString = thePoly.toString();

				argPoly = new Polynomial();
				argPoly.insert(new Term(1,1));
				argPoly.insert(new Term(3,0));
				argToString = argPoly.toString();

				System.out.println("\n===> telling (" + thePoly + ") to multiplyBy(" + argPoly + ")");
				System.out.println(thePoly.multiplyBy(argPoly));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (!origToString.equals(thePoly.toString()) || !argToString.equals(argPoly.toString()))
					System.out.println( "...BUT the original Polynomial and/or argument Polynomial changed during the operation");
			}

			try
			{
				thePoly = new Polynomial();
				thePoly.insert(new Term(1,1));
				thePoly.insert(new Term(3,0));
				origToString = thePoly.toString();

				argPoly = new Polynomial();
				argPoly.insert(new Term(1,1));
				argPoly.insert(new Term(-3,0));
				argToString = argPoly.toString();

				System.out.println("\n===> telling (" + thePoly + ") to multiplyBy(" + argPoly + ")");
				System.out.println(thePoly.multiplyBy(argPoly));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (!origToString.equals(thePoly.toString()) || !argToString.equals(argPoly.toString()))
					System.out.println( "...BUT the original Polynomial and/or argument Polynomial changed during the operation");
			}

		}
*/
	}
}
