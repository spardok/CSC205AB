public class TesterMinilabExpTreeNumPlusHG
{
	public static void main(String[ ] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String testInput= kb.nextLine();
		System.out.println("Testing with:  " + testInput + "\n");

		//===============================================

		try
		{
			ExpTree myExpTree = new ExpTree(testInput);
//			System.out.println("evaluate() returned:\t" + myExpTree.evaluate());
			System.out.println("numPlus() returned:\t" + myExpTree.numPlus());
		}
		catch(Throwable ex)
		{
			System.out.println(ex.getClass().getName());
			//ex.printStackTrace();     //uncomment this to see the call stack if runtime exception
		}

	}

}
