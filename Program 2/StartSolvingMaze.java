/*
Michael Vecchio
Maze Solver Starter
CSC205AB 13608
*/

import java.io.*;
import java.util.*;

public class StartSolvingMaze implements java.io.Serializable
{
	public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//creates keyboard input
		Scanner kb = new Scanner(System.in);

		//variables
		int numRowChoice;
		int numColChoice;

		//asks user for # of Rows
		System.out.print("Please Enter the Number of Rows: ");
		numRowChoice = kb.nextInt();

		//asks user for # of Columns
		System.out.print("Please Enter the Number of Columns: ");
		numColChoice = kb.nextInt();

		//System.out.println("\n" + numRowChoice + ", " + numColChoice); //debug

		//starts the maze solver
		MazeSolver yourMaze = new MazeSolver(numRowChoice,numColChoice);
		yourMaze.solve();
	}
}
