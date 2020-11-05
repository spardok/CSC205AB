//This will run test cases for the Point class.   It will not prompt for input,
//but is expecting input of the form "testing <what to test>"

public class PointTesterHG
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
				int[ ] xArray = { -1, 0, 6};
				int[ ] yArray = { -3, 4 };

				for (int xCoeffIndex=0; xCoeffIndex<xArray.length; xCoeffIndex++)
					for (int yCoeffIndex=0; yCoeffIndex<yArray.length; yCoeffIndex++)
					{
						if (printDescription)
							System.out.println("==>Testing parameterized constructor/toString(): passing in " + xArray[xCoeffIndex] + "  and  " + yArray[yCoeffIndex]);
						Point thePoint = new Point(xArray[xCoeffIndex], yArray[yCoeffIndex]);
						System.out.println(thePoint);
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
				Point thePoint = new Point();
				System.out.println(thePoint);
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
			Point[ ] pointArray = { null, new Point(5,6) };
			Point thePoint = null;
			String origToString = "<empty>";
			Point argPoint = null;
			String argOrigToString = "<empty>";

			for (int i=0; i<pointArray.length; i++)
			{
				try
				{
					argPoint = pointArray[i];
					if (argPoint != null)
						argOrigToString = argPoint.toString();
					if (printDescription)
						System.out.println("==>Testing copy constructor (translate must work), passing in " + argPoint);
					thePoint = new Point(argPoint);
					System.out.println("Point that was created is:  " + thePoint);
				}
				catch (Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();         //in case the user wants more information on the exception
				}
				finally
				{
					if (checkChanges && argPoint != null && !argPoint.toString().equals(argOrigToString))
						System.out.println("...but the argument Point CHANGED during the operation");
					if (argPoint != null)
					{
						origToString = thePoint.toString();
						argPoint.translate(1, 1);     //change the argPoint to see if thePoint changes too (shallow)
						if (checkChanges && !origToString.equals(thePoint.toString()))
							System.out.println("...but the copy was a SHALLOW copy");
					}
				}
			}

		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing translate") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = false;

			int[ ] xArray = { 0, 5 };
			int[ ] yArray = { 0, 7 };
			Point thePoint = null;
			String origToString = "<empty>";
			Point argPoint = null;
			String argOrigToString = "<empty>";
			for (int xIndex=0; xIndex<xArray.length; xIndex++)
				for (int yIndex=0; yIndex<yArray.length; yIndex++)
				{
					try
					{
						thePoint = new Point(-3, 4);
						origToString = thePoint.toString();
						if (printDescription)
							System.out.println("==>Testing " + thePoint + " 's .translate(" + xArray[xIndex] + ", " + yArray[yIndex] + ")");
						thePoint.translate(xArray[xIndex], yArray[yIndex]);
						System.out.println(thePoint);
					}
					catch (Throwable ex)
					{
						System.out.println(ex.getClass().getName());
						//ex.printStackTrace();         //in case the user wants more information on the exception
					}
					finally
					{
						if (checkChanges && !thePoint.toString().equals(origToString))
							System.out.println("...but the original Point CHANGED during the operation");
						if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
							System.out.println("...but the argument Point CHANGED during the operation");
					}
				}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing onXAxis") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = false;

			int[ ] xArray = { 0, -3, 5 };
			int[ ] yArray = { 0, 6, -2 };
			Point thePoint = null;
			String origToString = "<empty>";
			Point argPoint = null;
			String argOrigToString = "<empty>";
			for (int xIndex=0; xIndex<xArray.length; xIndex++)
				for (int yIndex=0; yIndex<yArray.length; yIndex++)
				{
					try
					{
						thePoint = new Point(xArray[xIndex], yArray[yIndex]);
						origToString = thePoint.toString();
						if (printDescription)
							System.out.println("==>Testing " + thePoint + " 's .onXAxis()");
						boolean answer = thePoint.onXAxis();
						System.out.println(answer);
					}
					catch (Throwable ex)
					{
						System.out.println(ex.getClass().getName());
						//ex.printStackTrace();         //in case the user wants more information on the exception
					}
					finally
					{
						if (checkChanges && !thePoint.toString().equals(origToString))
							System.out.println("...but the original Point CHANGED during the operation");
						//if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
						//	System.out.println("...but the argument Point CHANGED during the operation");
					}
				}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing inQuadrant") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = false;

			int[ ] quadrant = { 0, 1, 2, 3, 4, 8};
			int[ ] xArray = { 0, -3, 5 };
			int[ ] yArray = { 0, 6, -2 };
			Point thePoint = null;
			String origToString = "<empty>";
			Point argPoint = null;
			String argOrigToString = "<empty>";
			for (int quadIndex=0; quadIndex<quadrant.length; quadIndex++)
				for (int xIndex=0; xIndex<xArray.length; xIndex++)
					for (int yIndex=0; yIndex<yArray.length; yIndex++)
					{
						try
						{
							int theQuadrant = quadrant[quadIndex];
							thePoint = new Point(xArray[xIndex], yArray[yIndex]);
							origToString = thePoint.toString();
							if (printDescription)
								System.out.println("==>Testing " + thePoint + " 's .inQuadrant(" + theQuadrant + ")");
							boolean answer = thePoint.inQuadrant(theQuadrant);
							System.out.println(answer);
						}
						catch (Throwable ex)
						{
							System.out.println(ex.getClass().getName());
							//ex.printStackTrace();         //in case the user wants more information on the exception
						}
						finally
						{
							if (checkChanges && !thePoint.toString().equals(origToString))
								System.out.println("...but the original Point CHANGED during the operation");
							//if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
							//	System.out.println("...but the argument Point CHANGED during the operation");
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

			int argX = 4;
			int argY = -2;

			Point thePoint = new Point(argX, argY);
			String origToString = "<empty>";
			Point argPoint = null;
			String argOrigToString = "<empty>";

			Object[ ] argList = { 	null,
												thePoint.toString(),
												new Point(argX, argY+3),
												new Point(argX+5, argY),
												new Point(argX+7, argY+2),
												new Point(argX, argY)
											};

			for (int argIndex=0; argIndex<argList.length; argIndex++)
			{
				try
				{
					thePoint = new Point(argX, argY);
					Object theArgument = argList[argIndex];
					System.out.print("==>Testing whether " + thePoint + " .equals " + theArgument);
					if (theArgument != null && theArgument.getClass() == "".getClass())     //String
						System.out.println(" (as a STRING)");
					else
						System.out.println();

					origToString = thePoint.toString();
					if (theArgument != null)
					{
						if (theArgument.getClass() == thePoint.getClass())   //its really a Point
							argPoint = (Point)argList[argIndex];					//so we can typecast it from Object to Point
						argOrigToString = theArgument.toString();
					}

					boolean result = thePoint.equals(argPoint);
					System.out.println(result);
				}
				catch (Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();         //in case the user wants more information on the exception
				}
				finally
				{
					if (checkChanges && !thePoint.toString().equals(origToString))
						System.out.println("...but the original Point CHANGED during the operation");
					if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
						System.out.println("...but the argument Point CHANGED during the operation");
				}
			}
		}

/*		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing halfwayTo") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			//values used in these tests
			Point thePoint = null;
			String origToString = "<empty>";
			Point argPoint = null;
			String argOrigToString = "<empty>";

			//first test to see if it handles null as an argument
			try
			{
				thePoint = new Point(6, 9);
				origToString = thePoint.toString();
				argPoint = null;
				argOrigToString = "<empty>";

				if (printDescription)
					System.out.println("==>Testing " + thePoint + " 's .halfwayTo " + argPoint);
				Point result = thePoint.halfwayTo(argPoint);
				System.out.println(result);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (checkChanges && !thePoint.toString().equals(origToString))
					System.out.println("...but the original Point CHANGED during the operation");
				if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
					System.out.println("...but the argument Point CHANGED during the operation");
			}

			//now go through the arrays, generating new Points to use in non-null tests
			int[ ] xArray = { 4, 0 };
			int[ ] yArray = { -2, 6 };
			for (int argXIndex=0; argXIndex<xArray.length; argXIndex++)
				for (int argYIndex=0; argYIndex<yArray.length; argYIndex++)
				{
					try
					{
						thePoint = new Point(0, -4);
						origToString = thePoint.toString();
						argPoint = new Point(xArray[argXIndex], yArray[argYIndex]);
						argOrigToString = argPoint.toString();
						if (printDescription)
							System.out.println("==>Testing " + thePoint + " 's .halfwayTo " + argPoint);
						Point result = thePoint.halfwayTo(argPoint);
						System.out.println(result);
					}
					catch (Throwable ex)
					{
						System.out.println(ex.getClass().getName());
						//ex.printStackTrace();         //in case the user wants more information on the exception
					}
					finally
					{
						if (checkChanges && !thePoint.toString().equals(origToString))
							System.out.println("...but the original Point CHANGED during the operation");
						if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
							System.out.println("...but the argument Point CHANGED during the operation");
					}
				}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing halfwayTo vague requirement") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			int[ ] xArray = { 9 };
			int[ ] yArray = { 13 };
			Point thePoint = null;
			String origToString = "<empty>";
			Point argPoint = null;
			String argOrigToString = "<empty>";
			for (int argXIndex=0; argXIndex<xArray.length; argXIndex++)
				for (int argYIndex=0; argYIndex<yArray.length; argYIndex++)
				{
					try
					{
						thePoint = new Point(0, -4);
						origToString = thePoint.toString();
						argPoint = new Point(xArray[argXIndex], yArray[argYIndex]);
						argOrigToString = argPoint.toString();
						if (printDescription)
							//System.out.println("==>Testing " + thePoint + " 's .halfwayTo " + argPoint);
							System.out.println("==>See if you can figure out what the vague requirements is!");
						Point result = thePoint.halfwayTo(argPoint);
						//System.out.println(result);
					}
					catch (Throwable ex)
					{
						System.out.println(ex.getClass().getName());
						//ex.printStackTrace();         //in case the user wants more information on the exception
					}
					finally
					{
						if (checkChanges && !thePoint.toString().equals(origToString))
							System.out.println("...but the original Point CHANGED during the operation");
						if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
							System.out.println("...but the argument Point CHANGED during the operation");
					}
				}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing distanceTo") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			//values used in these tests
			Point thePoint = null;
			String origToString = "<empty>";
			Point argPoint = null;
			String argOrigToString = "<empty>";

			//first test to see if it handles null as an argument
			try
			{
				thePoint = new Point(6, 9);
				origToString = thePoint.toString();
				argPoint = null;
				argOrigToString = "<empty>";

				if (printDescription)
					System.out.println("==>Testing " + thePoint + " 's .distanceTo " + argPoint);
				double result = thePoint.distanceTo(argPoint);
				java.text.DecimalFormat df = new java.text.DecimalFormat("#.###");
				System.out.println(df.format(result));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (checkChanges && !thePoint.toString().equals(origToString))
					System.out.println("...but the original Point CHANGED during the operation");
				if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
					System.out.println("...but the argument Point CHANGED during the operation");
			}

			//now go through the arrays, generating new Points to use in non-null tests
			int[ ] xArray = { -1, 5 };
			int[ ] yArray = { 5, -1 };
			for (int pointXIndex=0; pointXIndex<xArray.length; pointXIndex++)
				for (int pointYIndex=0; pointYIndex<yArray.length; pointYIndex++)
					for (int argXIndex=0; argXIndex<xArray.length; argXIndex++)
						for (int argYIndex=0; argYIndex<yArray.length; argYIndex++)
						{
							try
							{
								thePoint = new Point(xArray[pointXIndex], yArray[pointYIndex]);
								origToString = thePoint.toString();
								argPoint = new Point(xArray[argXIndex], yArray[argYIndex]);
								argOrigToString = argPoint.toString();
								if (printDescription)
									System.out.println("==>Testing " + thePoint + " 's .distanceTo " + argPoint);
								double result = thePoint.distanceTo(argPoint);
								java.text.DecimalFormat df = new java.text.DecimalFormat("#.###");
								System.out.println(df.format(result));
							}
							catch (Throwable ex)
							{
								System.out.println(ex.getClass().getName());
								//ex.printStackTrace();         //in case the user wants more information on the exception
							}
							finally
							{
								if (checkChanges && !thePoint.toString().equals(origToString))
									System.out.println("...but the original Point CHANGED during the operation");
								if (checkChanges && argPoint!=null && !argPoint.toString().equals(argOrigToString))
									System.out.println("...but the argument Point CHANGED during the operation");
							}
						}
		}
*/

	}
}
