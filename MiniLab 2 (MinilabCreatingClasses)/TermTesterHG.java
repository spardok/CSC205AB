//This will run test cases for the Term class.   It will not prompt for input,
//but is expecting input of the form "testing <what to test>"

public class TermTesterHG
{
	public static void main(String[ ] args)
	{
		//get the arguments for the test - note no prompt!
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String test = kb.nextLine();

		if (test.equalsIgnoreCase("testing parameterized constructor") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			try
			{
				int[ ] coeffArray = { -1, 0, 1, 2 };
				int[ ] powerArray = { -1, 0, 1, 3 };

				for (int coeffIndex=0; coeffIndex<coeffArray.length; coeffIndex++)
					for (int powerIndex=0; powerIndex<powerArray.length; powerIndex++)
					{
						if (printDescription)
							System.out.println("==>Testing parameterized constructor/toString(): passing in " + coeffArray[coeffIndex] + "  and  " + powerArray[powerIndex]);
						Term theTerm = new Term(coeffArray[coeffIndex], powerArray[powerIndex]);
						System.out.println(theTerm);
					}
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception

			}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing default constructor") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			try
			{
				if (printDescription)
					System.out.println("==>Testing default constructor/toString()");
				Term theTerm = new Term();
				System.out.println(theTerm);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception

			}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing copy constructor") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			//-------------------------------------------------------------
			Term[ ] termArray = { null, new Term(5,6) };
			Term theTerm = null;
			String origToString = "<empty>";
			Term argTerm = null;
			String argOrigToString = "<empty>";

			for (int i=0; i<termArray.length; i++)
			{
				try
				{
					argTerm = termArray[i];
					if (argTerm != null)
						argOrigToString = argTerm.toString();
					if (printDescription)
						System.out.println("==>Testing copy constructor, passing in " + argTerm);
					theTerm = new Term(argTerm);
					System.out.println("Term that was created is:  " + theTerm);
				}
				catch (Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();         //in case the user wants more information on the exception

				}
				finally
				{
					if (checkChanges && argTerm != null && !argTerm.toString().equals(argOrigToString))
						System.out.println("...but the argument Term CHANGED during the operation");
					if (argTerm != null)
					{
						origToString = theTerm.toString();
						argTerm = argTerm.derivative();     //change the argTerm to see if theTerm changes too (shallow)
						if (checkChanges && !origToString.equals(theTerm.toString()))
							System.out.println("...but the copy was a SHALLOW copy");
					}
				}
			}

		}


		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing degree") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			int[ ] coeffArray = { -1, 0, 1, 2 };
			int[ ] powerArray = { -1, 0, 1, 3 };
			Term theTerm = null;
			String origToString = "<empty>";
			Term argTerm = null;
			String argOrigToString = "<empty>";
			for (int coeffIndex=0; coeffIndex<coeffArray.length; coeffIndex++)
				for (int powerIndex=0; powerIndex<powerArray.length; powerIndex++)
				{
					try
					{
						int termCoeff = coeffArray[coeffIndex];
						int termPower = powerArray[powerIndex];
						String completeTermString = termCoeff + "x^" + termPower;
						theTerm = new Term(termCoeff, termPower);
						origToString = theTerm.toString();
						if (printDescription)
							System.out.println("==>Testing degree of " + theTerm);
						int result = theTerm.degree();
						System.out.println(result);
					}
					catch (Throwable ex)
					{
						System.out.println(ex.getClass().getName());
						//ex.printStackTrace();         //in case the user wants more information on the exception
					}
					finally
					{
						if (checkChanges && !theTerm.toString().equals(origToString))
							System.out.println("...but the original Term CHANGED during the operation");
						if (checkChanges && argTerm!=null && !argTerm.toString().equals(argOrigToString))
							System.out.println("...but the argument Term CHANGED during the operation");
					}
				}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing derivative") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			int[ ] coeffArray = { -1, 0, 1, 2 };
			int[ ] powerArray = { -1, 0, 1, 3 };
			Term theTerm = null;
			String origToString = "<empty>";
			Term argTerm = null;
			String argOrigToString = "<empty>";
			for (int coeffIndex=0; coeffIndex<coeffArray.length; coeffIndex++)
				for (int powerIndex=0; powerIndex<powerArray.length; powerIndex++)
				{
					try
					{
						theTerm = new Term(coeffArray[coeffIndex], powerArray[powerIndex]);
						origToString = theTerm.toString();
						if (printDescription)
							System.out.println("==>Testing derivative of " + theTerm);
						Term result = theTerm.derivative();
						System.out.println(result);
					}
					catch (Throwable ex)
					{
						System.out.println(ex.getClass().getName());
						//ex.printStackTrace();         //in case the user wants more information on the exception
					}
					finally
					{
						if (checkChanges && !theTerm.toString().equals(origToString))
							System.out.println("...but the original Term CHANGED during the operation");
						if (checkChanges && argTerm!=null && !argTerm.toString().equals(argOrigToString))
							System.out.println("...but the argument Term CHANGED during the operation");
					}
				}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing addIn") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			//data that are used for the tests
			Term theTerm = null;
			String origToString = "<empty>";
			Term argTerm = null;
			String argOrigToString = "<empty>";

			//first, test to see that it handles when null is passed as an argument
			try
			{
				theTerm = new Term(2, 4);
				origToString = theTerm.toString();
				argTerm = null;
				argOrigToString = "<empty>";
				if (printDescription)
				System.out.println("==>Telling " + theTerm + " to addIn " + argTerm);
				theTerm.addIn(argTerm);
				System.out.println(theTerm);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (checkChanges && argTerm!=null && !argTerm.toString().equals(argOrigToString))
					System.out.println("...but the argument Term CHANGED during the operation");
			}

			//now declare and go through these arrays, generating Terms to test
			int[ ] origCoeffArray = { 2 };
			int[ ] origPowerArray = { 3 };
			int[ ] argCoeffArray = { 4, -6, 7 };
			int[ ] argPowerArray = { 5, 3 };
			for (int origCoeffIndex=0; origCoeffIndex<origCoeffArray.length; origCoeffIndex++)
				for (int origPowerIndex=0; origPowerIndex<origPowerArray.length; origPowerIndex++)
					for (int argCoeffIndex=0; argCoeffIndex<argCoeffArray.length; argCoeffIndex++)
						for (int argPowerIndex=0; argPowerIndex<argPowerArray.length; argPowerIndex++)
						{
							try
							{
								theTerm = new Term(origCoeffArray[origCoeffIndex], origPowerArray[origPowerIndex]);
								origToString = theTerm.toString();
								argTerm = new Term(argCoeffArray[argCoeffIndex], argPowerArray[argPowerIndex]);
								argOrigToString = argTerm.toString();
								if (printDescription)
									System.out.println("==>Telling " + theTerm + " to addIn " + argTerm);
								theTerm.addIn(argTerm);
								System.out.println(theTerm);
							}
							catch (Throwable ex)
							{
								System.out.println(ex.getClass().getName());
								//ex.printStackTrace();         //in case the user wants more information on the exception

							}
							finally
							{
								if (checkChanges && argTerm!=null && !argTerm.toString().equals(argOrigToString))
									System.out.println("...but the argument Term CHANGED during the operation");
							}
						}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing multiplyBy") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			int[ ] origCoeffArray = { 2 };
			int[ ] origPowerArray = { 3 };
			int[ ] argCoeffArray = { 4, -6, 7 };
			int[ ] argPowerArray = { 5, 3 };
			Term theTerm = null;
			String origToString = "<empty>";
			Term argTerm = null;
			String argOrigToString = "<empty>";

			//first, test to see that it handles when null is passed as an argument
			try
			{
				theTerm = new Term(2, 4);
				origToString = theTerm.toString();
				argTerm = null;
				argOrigToString = "<empty>";
				if (printDescription)
				System.out.println("==>Telling " + theTerm + " to return a new Term that is itself multiplied by " + argTerm);
				Term resultTerm = theTerm.multiplyBy(argTerm);
				System.out.println(resultTerm);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception

			}
			finally
			{
				if (checkChanges && !theTerm.toString().equals(origToString))
					System.out.println("...but the original Term CHANGED during the operation");
				if (checkChanges && argTerm!=null && !argTerm.toString().equals(argOrigToString))
					System.out.println("...but the argument Term CHANGED during the operation");
			}

			//now declare and go through the arrays, generating Terms to test
			for (int origCoeffIndex=0; origCoeffIndex<origCoeffArray.length; origCoeffIndex++)
				for (int origPowerIndex=0; origPowerIndex<origPowerArray.length; origPowerIndex++)
					for (int argCoeffIndex=0; argCoeffIndex<argCoeffArray.length; argCoeffIndex++)
						for (int argPowerIndex=0; argPowerIndex<argPowerArray.length; argPowerIndex++)
						{
							try
							{
								theTerm = new Term(origCoeffArray[origCoeffIndex], origPowerArray[origPowerIndex]);
								origToString = theTerm.toString();
								argTerm = new Term(argCoeffArray[argCoeffIndex], argPowerArray[argPowerIndex]);
								argOrigToString = argTerm.toString();
								if (printDescription)
									System.out.println("==>Telling " + theTerm + " to return a new Term that is itself multiplied by to " + argTerm);
								Term resultTerm = theTerm.multiplyBy(argTerm);
								System.out.println(resultTerm);
							}
							catch (Throwable ex)
							{
								System.out.println(ex.getClass().getName());
								//ex.printStackTrace();         //in case the user wants more information on the exception

							}
							finally
							{
								if (checkChanges && !theTerm.toString().equals(origToString))
									System.out.println("...but the original Term CHANGED during the operation");
								if (checkChanges && argTerm!=null && !argTerm.toString().equals(argOrigToString))
									System.out.println("...but the argument Term CHANGED during the operation");
							}
						}
		}


		//***************************************************
		//***************************************************
		if (test.equals("testing evaluate") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			int[ ] origCoeffArray = { 3 };
			int[ ] origPowerArray = { 0, 1, 2 };
			double[ ] evalArray = { -2, 0, 1.5, 3 };
			Term theTerm = null;
			String origToString = "<empty>";
			Term argTerm = null;
			String argOrigToString = "<empty>";

			for (int origCoeffIndex=0; origCoeffIndex<origCoeffArray.length; origCoeffIndex++)
				for (int origPowerIndex=0; origPowerIndex<origPowerArray.length; origPowerIndex++)
					for (int evalIndex=0; evalIndex<evalArray.length; evalIndex++)
						{
							try
							{
								int termCoeff = origCoeffArray[origCoeffIndex];
								int termPower = origPowerArray[origPowerIndex];
								String completeTermString = termCoeff + "x^" + termPower;
								theTerm = new Term(termCoeff, termPower);
								origToString = theTerm.toString();
								double theArg = evalArray[evalIndex];
								if (printDescription)
									System.out.println("==>Telling " + completeTermString + " to evaluate, passing in: " + theArg);
								double result = theTerm.evaluate(theArg);
								System.out.println(result);
							}
							catch (Throwable ex)
							{
								System.out.println(ex.getClass().getName());
								//ex.printStackTrace();         //in case the user wants more information on the exception

							}
							finally
							{
								if (checkChanges && !theTerm.toString().equals(origToString))
									System.out.println("...but the original Term CHANGED during the operation");
								if (checkChanges && argTerm!=null && !argTerm.toString().equals(argOrigToString))
									System.out.println("...but the argument Term CHANGED during the operation");
							}
						}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing equals") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			Term theTerm = null;
			Term argTerm = null;
			String origToString = "<empty>";
			String argToString = "<empty>";

			try   //first test: does it .equal(null)
			{
				theTerm = new Term(2, 5);
				origToString = theTerm.toString();
				System.out.println("==>Testing whether " + theTerm + " .equals null");
				boolean result = theTerm.equals(null);
				System.out.println(result);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (checkChanges && !theTerm.toString().equals(origToString))
					System.out.println("...but the original Term CHANGED during the operation");
			}

			try   //second test: does it .equal(something from another class)
			{
				theTerm = new Term(2, 5);
				origToString = theTerm.toString();
				System.out.println("==>Testing whether " + theTerm + " .equals " + origToString + " (as a STRING)");
				boolean result = theTerm.equals(origToString);
				System.out.println(result);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (checkChanges && !theTerm.toString().equals(origToString))
					System.out.println("...but the original Term CHANGED during the operation");
			}

			//other tests - testing actual Terms (including ones where the coefficients are 0)
			int[ ] coeffArray = { 0, -3};
			int[ ] powerArray = { 0, 6 };

			for (int thisCoeffIndex=0; thisCoeffIndex<coeffArray.length; thisCoeffIndex++)
				for (int thisPowerIndex=0; thisPowerIndex<powerArray.length; thisPowerIndex++)
					for (int argCoeffIndex=0; argCoeffIndex<coeffArray.length; argCoeffIndex++)
						for (int argPowerIndex=0; argPowerIndex<powerArray.length; argPowerIndex++)
						{
							try
							{
								int origCoeff = coeffArray[thisCoeffIndex];
								int origPower = powerArray[thisPowerIndex];
								theTerm = new Term(origCoeff, origPower);
								origToString = theTerm.toString();
								String origCompleteString = origCoeff + "x^" + origPower;

								int argCoeff = coeffArray[argCoeffIndex];
								int argPower = powerArray[argPowerIndex];
								argTerm = new Term(argCoeff, argPower);
								argToString = argTerm.toString();
								String argCompleteString = argCoeff + "x^" + argPower;

								System.out.println("==>Testing whether " + origCompleteString + " .equals " + argCompleteString);
								boolean result = theTerm.equals(argTerm);
								System.out.println(result);
							}
							catch (Throwable ex)
							{
								System.out.println(ex.getClass().getName());
								//ex.printStackTrace();         //in case the user wants more information on the exception
							}
							finally
							{
								if (checkChanges && !theTerm.toString().equals(origToString))
									System.out.println("...but the original Term CHANGED during the operation");
								if (checkChanges && !argTerm.toString().equals(argToString))
									System.out.println("...but the argument Term CHANGED during the operation");							}
							}
		}

	}
}
