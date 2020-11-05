/*
Michael Vecchio
CSC205AB
Potentially Infinite Number Generator
*/

import java.util.*;

public class InfiniteInt extends DLList<Integer> implements Comparable<InfiniteInt>
{
	//---- data

	//---- constructors

	//default constructor
	public InfiniteInt()
	{
		//call parent's data
		super();
	}

	//parameterized constructor
	public InfiniteInt(String someData)
	{
		//calls parent's super
		super();

		//checks if InfiniteInt has anything but numbers and commas
		if (someData.matches("[0-9,]+") == false)
			throw new IllegalArgumentException("InfiniteInt can't contain anything but commas and numbers");
		else
		{
			//create a tokenizer that will seperate the list by commas
			StringTokenizer tokenInt = new StringTokenizer(someData, ",");

			//variable to hold the token
			String token;

			//seperates up to 3 integers into each node
			while (tokenInt.hasMoreTokens())
			{
				token = tokenInt.nextToken();
				int result = Integer.parseInt(token);
				this.addLast(result);
			}
		}
	}

	//---- methods

	//equals
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;

		InfiniteInt objInfiniteInt = (InfiniteInt)obj;

		if(this.toString().equals(objInfiniteInt.toString()))
			return true;

		return (this.toString().equals(objInfiniteInt.toString()));
	}

	//toString
	public String toString()
	{
		//checks to see if InfiniteInt is empty
		if (this.isEmpty())
			throw new IllegalStateException("The Linked List is Empty");
		else
		{
			DLLNode<Integer> cursor = tail;
			String result = "";
			while (cursor != null)
			{
				//checks both sides of the node for null so it doesn't need a comma
				if ((cursor.prev == null) && (cursor.next == null))
					result = cursor.data + "";
				//checks the previous node for null and adds the last node (head) entered so it adds a comma with no leading zeroes
				else if (cursor.prev == null)
					result = cursor.data + "," + result;
				//checks the next node for null and adds the first node (the tail) entered so it needs leading zeroes without a comma
				else if (cursor.next == null)
					result = String.format ("%03d", cursor.data) + result;
				//if none of the above is true adds nodes between the head and tail so it needs leading zeroes and a comma
				else
					result = String.format ("%03d", cursor.data) + "," + result;
				cursor = cursor.prev;
			}
			return result;
		}
	}

	//isEven - checks to see if InfiniteInt is even (divisable by 2)
	public boolean isEven()
	{
		//checks to see if InfiniteInt is empty
		if (this.isEmpty())
			throw new IllegalStateException("The Linked List is Empty");
		//logic to check if divisable by 2, aka it's even
		else if (this.tail.data % 2 == 0)
			return true;
		else
			return false;
	}

	//isDivisibleBy10 - checks to see if InfiniteInt is divisable by 10
	public boolean isDivisibleBy10()
	{
		//checks to see if InfiniteInt is empty
		if (this.isEmpty())
			throw new IllegalStateException("The Linked List is Empty");
		//logic to check if divisable by 10
		else if ((this.tail.data % 10) == 0)
			return true;
		else
			return false;
	}

	//isDivisibleBy1000 - checks to see if InfiniteInt is divisable by 1000
	public boolean isDivisibleBy1000()
	{
		//checks to see if InfiniteInt is empty
		if (this.isEmpty())
			throw new IllegalStateException("The Linked List is Empty");
		//logic to check if it's divisable by 1000
		else if ((this.size() == 1) && (this.tail.data == 0))
			return true;
		else if ((this.size() > 1) && (this.tail.data == 000))
			return true;
		else
			return false;
	}

	//compareTo
	public int compareTo(InfiniteInt o)
	{
		//int to hold result
		int result = 0;

		//cursors to transverse both InfiniteInts
		DLLNode<Integer> cursor1 = null; //CAN CHANGE TO THIS.TAIL?
		cursor1 = this.tail;
		DLLNode<Integer> cursor2 = null; //CAN CHANGE TO O.TAIL?
		cursor2 = o.tail;

		//first, checks if they are equal via toString
		if (this.toString().equals(o.toString()))
			result = 0;
		//second, checks to see if the sizes are the same
		else if (this.size() == o.size())
		{
			//if sizes are the same it checks to see if it's larger or smaller with dual transversal
			//it doesn't need to check if it's equal here, we already took care of that with the very first check
			while (cursor1 != null)
			{
				//System.out.println("Cursor1: " + cursor1 + " Cursor2: " + cursor2); //DEBUG
				if (cursor1.data > cursor2.data)
					result = 1;
				if (cursor1.data < cursor2.data)
					result = -1;
				//System.out.println("result: " + result); //DEBUG
				cursor1 = cursor1.prev;
				cursor2 = cursor2.prev;
			}
		}
		//third, checks to see if it's larger or smaller simply based on size.
		else if (this.size() < o.size())
			return -1;
		else if (this.size() > o.size())
			return 1;

		return result;
	}

	//add - adds two InfiniteInts together
	public static InfiniteInt add(InfiniteInt firstInfiniteInt, InfiniteInt secondInfiniteInt)
	{
		//creates a new empty list
		InfiniteInt myList = new InfiniteInt();

		//creates cursor for first InfiniteInt
		DLLNode<Integer> cursor1 = null;
		int result1 = 0;

		//creates cursor for second InfiniteInt
		DLLNode<Integer> cursor2 = null;
		int result2 = 0;

		//logic to handle larger vs smaller InfiniteInt
		if (firstInfiniteInt.size() > secondInfiniteInt.size())
		{
			cursor1 = firstInfiniteInt.tail;
			cursor2 = secondInfiniteInt.tail;
		}
		else
		{
			cursor1 = secondInfiniteInt.tail;
			cursor2 = firstInfiniteInt.tail;
		}

		//defined variables for while loop below
		int total = 0;
		int totalLeftOvers = 0;
		int lastThreeDigits = 0;

		//logic for adding
		while (cursor1 != null)
		{
			//sets and controls the cursor
			result1 = cursor1.data;
			cursor1 = cursor1.prev;

			//logic to handle when smaller InfiniteInt becomes null so program doesn't error
			if (cursor2 == null)
				result2 = 0;
			else
				result2 = cursor2.data;
			if (cursor2 != null)
				cursor2 = cursor2.prev;

			//adds up variables
			total = result1 + result2 + totalLeftOvers;

			//System.out.println("Result1: " + result1 + ", " + "Result2: " + result2 + "Total Left Overs " + totalLeftOvers); //DEBUG
			//System.out.println("Total :" + total); //DEBUG

			//logic to handle when the total is over 999 soft cap
			if (total > 999)
			{
				//gets the remaining digits if total is greater than 999
				totalLeftOvers = total / 1000;

				//System.out.println("totalLeftOvers: " + totalLeftOvers); //DEBUG

				//saves the last three digits
				lastThreeDigits = total % 1000;

				//System.out.println("lastThreeDigits: " + lastThreeDigits); //DEBUG

				//adds last three digits of the total into the LinkedList in first position
				myList.addFirst(lastThreeDigits);

				//logic to handle when cursor reaches end and it needs a carry over
				if (cursor1 == null)
					myList.addFirst(totalLeftOvers);
			}
			//logic to handle when there is no carry over
			else
			{
				myList.addFirst(total);
			}
		}
		return myList;
	}

	//isDivisibleBy6
	public boolean isDivisibleBy6()
	{
		//holds booleans for divisable by 2 and 3
		//if the number is divisable by both of these then it is divisable by 6
		boolean divisableBy2 = false;
		boolean divisableBy3 = false;

		//checks to see if the number is divisable by 2
		if (this.isEven() == true)
			divisableBy2 = true;

		//variables for divisable by 3 while loop
		InfiniteInt tempInfiniteInt = this; //variable to allow the loop to repeat geting the number smaller and smaller
		int intSumPerNode = 0; //holds the sum of a single node
		int intCursorData = 0; //holds data of a single node
		InfiniteInt infIntPerNode = new InfiniteInt(); //InfiniteInt that holds single nodes from intCursorData
		InfiniteInt infIntSum = new InfiniteInt("0"); //another InfiniteInt that allows you to add infIntPerNode to it which holds the sum of all individual digits

		//sets the cursor
		DLLNode<Integer> cursor = null;
		cursor = tempInfiniteInt.tail;

		//transverses the InfiniteInt and repeats till the sum of all single digits is =< 999
		while (tempInfiniteInt.size() != 1)
		{
			while (cursor != null)
			{

				//goes through each node's data and adds each digit to another int
				intCursorData = cursor.data;
				while (intCursorData > 0)
				{
					intSumPerNode = intCursorData % 10 + intSumPerNode;
					intCursorData = intCursorData / 10;
				}

				//adds each node's sum into a new infinite int
				infIntPerNode.addFirst(intSumPerNode);

				//creates a second InfiniteInt so you can use the InfinteInt.add method
				infIntSum.add(infIntPerNode, infIntSum);

				//clears the InfiniteInt that only holds each node
				infIntPerNode = new InfiniteInt(); //infIntPerNode.remove();

				cursor = cursor.prev;
			}
			//changes this to the new sum, so it may repeat till it is =< 999
			tempInfiniteInt = infIntSum;
		}

		//mods the InfiniteInt by 3 and checks if it is equal to zero
		if (tempInfiniteInt.head.data % 3 == 0)
		{
			divisableBy3 = true;
		}

		if ((divisableBy2 && divisableBy3) == true)
			return true;
		else
			return false;
	}

}
