public class InfiniteIntTesterHGNO_EC
{
	public static void main(String[ ] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String test = kb.nextLine();

		//===============================================

		if (test.equalsIgnoreCase("testing default constructor") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				System.out.println("testing default constructor, then toString()");
				InfiniteInt int1 = new InfiniteInt();
				System.out.println(int1);
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
		}

		//=====================================

		if (test.equalsIgnoreCase("testing parameterized constructor") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				String[ ] parmArray = 	{	"0543",
														"5,435,341",
														"120,010,001,000",
														"11,1a1"
													};

				for (int i=0; i<parmArray.length; i++)
				{
					String parmString = parmArray[i];
					System.out.println("\ntesting parameterized constructor:   new InfiniteInt(\"" + parmString + "\") then toString()");

					InfiniteInt int1 = new InfiniteInt(parmString);
					System.out.println(int1);
				}
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
		}

		//===============================================
/*
		if (test.equalsIgnoreCase("testing isDivisibleBy6") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				String[ ] parmArray = 	{	"0",
														"27",
														"14",
														"24",
														"111,012",
														"2,582,718",
														"32,517"
													};

				for (int i=0; i<parmArray.length; i++)
				{
					String parmString = parmArray[i];
					System.out.println("\nAsking a new InfiniteInt(\"" + parmString + "\") if it .isDivisibleBy6()");
					InfiniteInt int1 = new InfiniteInt(parmString);

					String origInt1ToString = int1.toString();

					boolean ans = int1.isDivisibleBy6();
					System.out.println("returned: " + ans);

					if (!origInt1ToString.equals(int1.toString()))
						System.out.println("...BUT the original InfiniteInt changed during the operation");
				}
			}
			catch(Throwable ex)
			{
				System.out.println("Got:      " + ex);
				//ex.printStackTrace();
			}
		}
*/
		//===============================================

		if (test.equalsIgnoreCase("testing isEven") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				String[ ] parmArray = 	{	"5,234,500",
														"5,234,567",
														"58",
														"0",
														"2,100,011,101,001,372,163,582,718",
														"2,100,011,101,001,372,163,582,713",
													};

				for (int i=0; i<parmArray.length; i++)
				{
					String parmString = parmArray[i];
					System.out.println("\nAsking a new InfiniteInt(\"" + parmString + "\") if it .isEven()");
					InfiniteInt int1 = new InfiniteInt(parmString);

					String origInt1ToString = int1.toString();

					boolean ans = int1.isEven();
					System.out.println("returned: " + ans);

					if (!origInt1ToString.equals(int1.toString()))
						System.out.println("...BUT the original InfiniteInt changed during the operation");
				}
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
		}


		//===============================================

		if (test.equalsIgnoreCase("testing isDivisibleBy1000") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				String[ ] parmArray = 	{	"2,018",
														"7,156,400",
														"5,200,000",
														"5,234,000",
														"0",
														"2,100,011,101,001,372,163,582,718",
														"2,100,011,101,001,372,163,582,713",
													};

				for (int i=0; i<parmArray.length; i++)
				{
					String parmString = parmArray[i];
					System.out.println("\nAsking a new InfiniteInt(\"" + parmString + "\") if it .isDivisibleBy1000()");
					InfiniteInt int1 = new InfiniteInt(parmString);

					String origInt1ToString = int1.toString();

					boolean ans = int1.isDivisibleBy1000();
					System.out.println("returned: " + ans);

					if (!origInt1ToString.equals(int1.toString()))
						System.out.println("...BUT the original InfiniteInt changed during the operation");
				}
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
		}


		//===============================================

		if (test.equalsIgnoreCase("testing isDivisibleBy10") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				String[ ] parmArray = 	{	"2,010",
														"7,156,400",
														"5,200,001",
														"0",
														"2,100,011,101,001,372,163,582,710",
														"2,100,011,101,001,372,163,582,713",
													};

				for (int i=0; i<parmArray.length; i++)
				{
					String parmString = parmArray[i];
					System.out.println("\nAsking a new InfiniteInt(\"" + parmString + "\") if it .isDivisibleBy10()");
					InfiniteInt int1 = new InfiniteInt(parmString);

					String origInt1ToString = int1.toString();

					boolean ans = int1.isDivisibleBy10();
					System.out.println("returned: " + ans);

					if (!origInt1ToString.equals(int1.toString()))
						System.out.println("...BUT the original InfiniteInt changed during the operation");
				}
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("testing equals") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				Object[ ] parmArray = { 	null,
															"Hello",
															new InfiniteInt("5,234,567"),
															new InfiniteInt("234,567")
														};

				for (int i=0; i<parmArray.length; i++)
				{
					String int1String = "5,234,567";
					InfiniteInt int1 = new InfiniteInt(int1String);

					System.out.print("\nAsking a new InfiniteInt(\"" + int1String + "\") if it .equals ");  //to be finished
					if (parmArray[i] != null && int1.getClass() == parmArray[i].getClass())    //its also an InfiniteInt
						System.out.println("an InfiniteInt whose toString is: " + parmArray[i].toString());
					else
						System.out.println(parmArray[i]);

					String origInt1ToString = int1.toString();
					String parmToString = "<empty>";
					if (parmArray[i] != null)
						parmToString = parmArray[i].toString();

					boolean ans = int1.equals(parmArray[i]);
					System.out.println("returned: " + ans);

					if (!origInt1ToString.equals(int1.toString()))
						System.out.println("...BUT the original InfiniteInt changed during the operation");
					if (parmArray[i] != null && !parmToString.equals(parmArray[i].toString()))
						System.out.println("...BUT the argument changed during the operation");
				}
			}
			catch(Throwable ex)
			{
				System.out.println("Got:      " + ex);
				ex.printStackTrace();
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("testing compareTo") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				String int1Str = "889,001";
				String int2Str = "999,000";
				System.out.println("\nTelling a new InfiniteInt(\"" + int1Str + "\") to .compareTo a new InfiniteInt(\"" + int2Str + "\")");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				int ans = int1.compareTo(int2);
				if (ans < 0)
					System.out.println("returned a negative number");
				else if (ans > 0)
					System.out.println("returned a positive number");
				else
					System.out.println("returned 0");

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the original InfiniteInt changed during the compareTo");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the argument InfiniteInt changed during the compareTo");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//--------------------------------------------
			try
			{
				String int1Str = "1,234,567";
				String int2Str = "234,567";
				System.out.println("\nTelling a new InfiniteInt(\"" + int1Str + "\") to .compareTo a new InfiniteInt(\"" + int2Str + "\")");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				int ans = int1.compareTo(int2);
				if (ans < 0)
					System.out.println("returned a negative number");
				else if (ans > 0)
					System.out.println("returned a positive number");
				else
					System.out.println("returned 0");

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the original InfiniteInt changed during the compareTo");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the argument InfiniteInt changed during the compareTo");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//--------------------------------------------
			try
			{
				String int1Str = "234,567";
				String int2Str = "1,234,567";
				System.out.println("\nTelling a new InfiniteInt(\"" + int1Str + "\") to .compareTo a new InfiniteInt(\"" + int2Str + "\")");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				int ans = int1.compareTo(int2);
				if (ans < 0)
					System.out.println("returned a negative number");
				else if (ans > 0)
					System.out.println("returned a positive number");
				else
					System.out.println("returned 0");

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the original InfiniteInt changed during the compareTo");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the argument InfiniteInt changed during the compareTo");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//--------------------------------------------
			try
			{
				String int1Str = "9,342";
				String int2Str = "10,342";
				System.out.println("\nTelling a new InfiniteInt(\"" + int1Str + "\") to .compareTo a new InfiniteInt(\"" + int2Str + "\")");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				int ans = int1.compareTo(int2);
				if (ans < 0)
					System.out.println("returned a negative number");
				else if (ans > 0)
					System.out.println("returned a positive number");
				else
					System.out.println("returned 0");

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the original InfiniteInt changed during the compareTo");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the argument InfiniteInt changed during the compareTo");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//--------------------------------------------
			try
			{
				String int1Str = "10,342";
				String int2Str = "9,342";
				System.out.println("\nTelling a new InfiniteInt(\"" + int1Str + "\") to .compareTo a new InfiniteInt(\"" + int2Str + "\")");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				int ans = int1.compareTo(int2);
				if (ans < 0)
					System.out.println("returned a negative number");
				else if (ans > 0)
					System.out.println("returned a positive number");
				else
					System.out.println("returned 0");

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the original InfiniteInt changed during the compareTo");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the argument InfiniteInt changed during the compareTo");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------
			try
			{
				String int1Str = "1,342";
				String int2Str = "90,342";
				System.out.println("\nTelling a new InfiniteInt(\"" + int1Str + "\") to .compareTo a new InfiniteInt(\"" + int2Str + "\")");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				int ans = int1.compareTo(int2);
				if (ans < 0)
					System.out.println("returned a negative number");
				else if (ans > 0)
					System.out.println("returned a positive number");
				else
					System.out.println("returned 0");

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the original InfiniteInt changed during the compareTo");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the argument InfiniteInt changed during the compareTo");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------
			try
			{
				String int1Str = "90,342";
				String int2Str = "1,342";
				System.out.println("\nTelling a new InfiniteInt(\"" + int1Str + "\") to .compareTo a new InfiniteInt(\"" + int2Str + "\")");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				int ans = int1.compareTo(int2);
				if (ans < 0)
					System.out.println("returned a negative number");
				else if (ans > 0)
					System.out.println("returned a positive number");
				else
					System.out.println("returned 0");

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the original InfiniteInt changed during the compareTo");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the argument InfiniteInt changed during the compareTo");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("testing add") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			try
			{
				String int1Str = "23";
				String int2Str = "15";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(Simple add)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int1Str = "646,746,734";
				String int2Str = "543,534";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(Requirements example)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int2Str = "646,746,734";
				String int1Str = "543,534";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(Requirements example, backwards)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int1Str = "646,746,734";
				String int2Str = "127";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(first one has 2 more nodes)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int2Str = "646,746,734";
				String int1Str = "127";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(second one has 2 more nodes)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int1Str = "230";
				String int2Str = "140";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(simple add with no final carry)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int1Str = "230";
				String int2Str = "940";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(simple add with final carry)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int1Str = "998,999,999,999,999";
				String int2Str = "1";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(size1 > size2.  Lots of carries but no final carry)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int2Str = "998,999,999,999,999";
				String int1Str = "1";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(size2 > size1.  Lots of carries but no final carry)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int1Str = "997,998,998,998,999";
				String int2Str =     "1,001,001,001,001";
				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(size1==size2; lots of carries but no final one)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}
			//---------------------------------------------------------------------------
			try
			{
				String int1Str = "1,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111";
		 		String int2Str = "2,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222,222";

				System.out.println("\nTelling InfiniteInt to add: a new InfiniteInt(\"" + int1Str + "\") plus a new InfiniteInt(\"" + int2Str + "\")");
				System.out.println("(so many digits that it HAS to be an InfiniteInt to work)");

				InfiniteInt int1 = new InfiniteInt(int1Str);
				InfiniteInt int2 = new InfiniteInt(int2Str);

				String int1OrigToString = int1.toString();
				String int2OrigToString = int2.toString();

				InfiniteInt ans = InfiniteInt.add(int1, int2);
				System.out.println("returned an InfiniteInt whose toString() is: " + ans);

				if (!int1OrigToString.equals(int1.toString()))
					System.out.println("...BUT the first InfiniteInt changed during the add");
				if (!int2OrigToString.equals(int2.toString()))
					System.out.println("...BUT the second InfiniteInt changed during the add");
			}
			catch(Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();
			}

		}

	}

}
