/*
Michael Vecchio
CSC205AB 13608
Custom Numerical Array Counter and Modifier
*/
import java.util.*;

public class MinilabReview
{
	public static void main(String[]args)
	{
		//constants
		final int MAXELEMENTINT = 9; //sets upper limit to 8 on elements (1-8)
		final int COUNTEE = 3; //for option 3

		//declares a scanner
		Scanner kb = new Scanner(System.in);

		//asks user for a seed
		System.out.print("Please enter a seed: ");
		int seed = kb.nextInt();

		//asks user for an array size
		System.out.print("\nPlease enter the size of the array: ");
		int arraySize = kb.nextInt();

		//limits user input for the array size to 2 or greater
		while(arraySize <= 1)
		{
			System.out.print("\nArray size must be greater than 1.  Please reenter: ");
			arraySize = kb.nextInt();
		}

		//generates random number based on seed entered by user
		Random randGen = new Random(seed);

		//creates the array
		int[] myArray = new int[arraySize];
		for(int i=0; i<myArray.length; i++)
		{
			myArray[i] = randGen.nextInt(MAXELEMENTINT);

		}

		//user menu choices
		int menuChoice;

		do
		{
			//prints menu choice to user
			System.out.println("\nPlease choose an option:");
			System.out.println("\t1\t Print the array");
			System.out.println("\t2\t Find the average");
			System.out.println("\t3\t Find the largest element");
			System.out.println("\t4\t Count how many times 3 occurred");
			System.out.println("\t5\t Swap the first and last elements");
			System.out.println("\t6\t Circular shift to the left");
			System.out.println("\t7\t Exit");

			//asks user for menu input
			menuChoice = kb.nextInt();

			//switch to hold choices
			switch(menuChoice)
			{
				case 1: //prints the array
					System.out.print("\nArray: ");
					for (int i=0; i<myArray.length; i++)
					{
						System.out.print(myArray[i] + "  ");
					}
					System.out.println("");
					break;
				case 2: //prints the avg of the array
					int arraySum = 0;
					double arrayAvg = 0;
					for (int i=0; i<myArray.length; i++)
					{
						arraySum = arraySum + myArray[i];
					}
					arrayAvg = (double)arraySum / arraySize;
					System.out.println("\nAverage: " + arrayAvg);
					break;
				case 3: //prints the largest element of the array
					int arrayLargestElement = 0;
					for (int i=0; i<myArray.length; i++)
					{
						if (myArray[i] > arrayLargestElement)
						{
							arrayLargestElement = myArray[i];
						}
					}
					System.out.println("\nLargest: " + arrayLargestElement);
					break;
				case 4: //prints the amount of reaccuring times COUNTEE appears as a numeral
					int ArrayReaccuringCountee = 0;
					for (int i=0; i<myArray.length; i++)
					{
						if (myArray[i] == COUNTEE)
						{
							ArrayReaccuringCountee = ArrayReaccuringCountee + 1;
						}
					}
					System.out.println("\n3 Count: " + ArrayReaccuringCountee);
					break;
				case 5: //swaps the first and last elements
					//stores first and last element as a temp int
					int tempFirstElementO5 = myArray[0];
					int tempLastElementO5 = myArray[arraySize - 1];

					//swaps the first and last element in the array
					myArray[0] = tempLastElementO5;
					myArray[arraySize - 1] = tempFirstElementO5;
					break;
				case 6: //shifts all elements to the left and then prints the array
					//stores first element as a temp int
					int tempFirstElementO6 = myArray[0];

					//swaps all elements in the array except the last
					for (int i=0; i<myArray.length - 1; i++)
					{
						myArray[i] = myArray[i + 1];
					}

					//swaps the last element in the array
					myArray[arraySize - 1] = tempFirstElementO6;
					break;
				case 7: //exits the program
					//System.out.println("\nProgram ending.\n");
					break;
				default:	System.out.println("\nIllegal option, try again");
			}
		}while(menuChoice != 7);
	}
}
