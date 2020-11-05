/*
Michael Vecchio
Maze Solver Resumer
CSC205AB 13608
*/

import java.io.*;
import java.util.*;

public class ResumeSolvingMaze
{
	public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//creates keyboard input
		Scanner kb = new Scanner(System.in);

		//variables
		String fileName;

		//asks user for the file name
		System.out.println("Please Enter the File Name To Continue Solving the Maze");
		System.out.println("!!! THE NAME IS CASE SENSITIVE. The File Must Be in the Same Folder. You Must Include The File Type !!!");
		System.out.println("Example: MyAmazingMaze.dat");
		System.out.println("\n?Waiting For User Input?");
		fileName = kb.nextLine();
		System.out.println("");

		//reads in the user defined file and solves the maze
		ObjectInputStream oisVar = new ObjectInputStream(new FileInputStream(fileName));
		MazeSolver resumedMaze = (MazeSolver)oisVar.readObject();    //reads it in as an Object; we must typecast
		oisVar.close();
		resumedMaze.solve();
	}
}
