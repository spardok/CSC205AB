//This program demonstrates a StringTokenizer, which is a class used to
//break up a String into "tokens."    There are actually 2 demos
//   - one which treats "white space" as delimiters and finds tokens
//   - one which defines its own delimiters and also returns them as tokens.
//      Specifically, the second example breaks up mathematical expressions.
//You can comment out a test if you want to see them one at a time...

import java.io.*;
import java.util.*;
import java.util.StringTokenizer;   //needed for StringTokenizer

public class TokenizerDemo extends DLList<Integer>
{
	public static void main(String args[]) throws IOException
	{
	    //read in a String that we will tokenize
	    Scanner kb = new Scanner(System.in);
	    String inputLine;
	    System.out.println("Please enter input line: ");
	    String input = kb.nextLine();

	    StringTokenizer tokenizer;
/*
	    //=============================================
	    //DEMO1:  a regular StringTokenizer breaking it up into words ("tokens")
	    System.out.println("\nThis demo breaks up a String into tokens");

	    tokenizer = new StringTokenizer(input);   //create a new StringTokenizer for that line

		System.out.println("The number of tokens will be: " + tokenizer.countTokens());

	    while(tokenizer.hasMoreTokens())
	    {
		    String token = tokenizer.nextToken();
		    System.out.println("Next token is to be processed is: " + token);
	    }

*/
		//==========================================================
	    //DEMO2:  a regular StringTokenizer setting a comma as the delimiter
	    System.out.println("\nThis demo breaks up a number into tokens");

	    tokenizer = new StringTokenizer(input, ",");   //create a new StringTokenizer for that line

		System.out.println("The number of tokens will be: " + tokenizer.countTokens());
	    while(tokenizer.hasMoreTokens())
	    {
		    String token = tokenizer.nextToken();
		    System.out.println("Next token is to be processed is: " + token);
		    System.out.println("as an int, the next token is: " + Integer.parseInt(token));
	    }
/*
		//==================================================
	    //DEMO3: using math symbols as tokens ------------------------------
	    System.out.println("\nThis demo3 breaks up a math expression into tokens");
	    tokenizer = new StringTokenizer(input, "()+-/*%", true);

	    while(tokenizer.hasMoreTokens())
	    {
		    String token = tokenizer.nextToken();
		    System.out.println("Next token is to be processed is: " + token);
	    }
*/
		//MY DEMO
		String numbers = "666,055,444,333";

		DLList<Integer> infiniteList = new DLList<Integer>();

		//create a tokenizer that will seperate the list by commas
		StringTokenizer tokenInt = new StringTokenizer(numbers, ",");

		String token;
		int finalResult;

		while (tokenInt.hasMoreTokens())
		{
			token = tokenInt.nextToken();
			int result = Integer.parseInt(token);
			infiniteList.addLast(finalResult);
		}


		System.out.println(infiniteList);

		//if (numbers.matches("[0-9,]+") == true)
		//{
			System.out.println("Hee Hee");
		//}

		//String d = 0005;
		//int i = d;
	}
}
