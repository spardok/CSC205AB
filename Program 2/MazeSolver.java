/*
Michael Vecchio
Maze Solver
CSC205AB 13608
*/

import java.io.*;
import java.util.*;
import java.awt.*;

public class MazeSolver implements java.io.Serializable
{
	//------ data
	protected Maze theMaze;
	protected ArrayList<Point> mazeArrayListTracker;
	protected Stack mazeStackTracker = new Stack();

	//------ constructors

	//public constructor - holds the rows and columns of a maze
	public MazeSolver(int numRows, int numCols)
	{
		this.theMaze = new Maze(numRows, numCols);
		this.theMaze.buildMaze(0);
		this.theMaze.setSolveAnimationDelay(1);
		this.mazeArrayListTracker = new ArrayList<Point>();
		this.mazeArrayListTracker.add(new Point());
		this.mazeStackTracker = new Stack();
	}

	//------ methods

	//solve - solves the given maze
	public void solve() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//creates keyboard input
		Scanner kb = new Scanner(System.in);

		//variable for option selection
		String menuOption;

		//creates theMaze in the MazeDisplay
		MazeDisplay theMazeDisplay = new MazeDisplay(this.theMaze);

		//loop for menu choices and solver
		do
		{
			System.out.println("Welcome to Maze Solver! Your All-In-One Maze Solving Solution!");
			System.out.println("\nYour Menu Choices Are:");
			System.out.println("1) Press Enter (or hold) to solve manually");
			System.out.println("2) Enter S to save (Will not Exit the Program)");
			System.out.println("3) Enter Q to quit the program");
			System.out.println("\n?Waiting For User Input?");
			menuOption = kb.nextLine();

			//menuOption to exit the program
			if(menuOption.equals("Q") || menuOption.equals("q"))
			{
				;
			}

			//menuOption to save the file
			else if(menuOption.equals("S") || menuOption.equals("s"))
			{
				//variable to hold user input file name to save
				String fileName;

				//asks user what name and file type to save as
				System.out.println("\nPlease Enter a File Name to Save your Maze as");
				System.out.println("!!! This is CASE SENSITIVE. The File Will Be in and MUST STAY in the Same Folder. You Must Include The File Type !!!");
				System.out.println("Example: MyAmazingMaze.dat");
				System.out.println("\n?Waiting For User Input?");
				fileName = kb.nextLine();
				System.out.println("\nMaze Saved To This File: " + fileName + "\n");

				//saves current maze and it's position as serializable data
				ObjectOutputStream oosVar = new ObjectOutputStream(new FileOutputStream(fileName));
				oosVar.writeObject(this);
				oosVar.close();
			}

			//menuOption to solve on enter press or hold as well as solving logic (also contains modifier to solve automatically)
			else if(menuOption.equals(""))
			{
				{
					//adds the current row/col to the visited points of the maze
					if(!mazeArrayListTracker.contains(new Point(theMaze.getCurrentRow(),theMaze.getCurrentCol())))
					{
						mazeArrayListTracker.add(new Point(theMaze.getCurrentRow(),theMaze.getCurrentCol()));
					}

					//checks if the stack is empty, if it is it pushes a filler
					if(mazeStackTracker.isEmpty())
					{
						this.mazeStackTracker.push("FILLER");
					}

					//logic for the maze
					//mazeArrayListTracker logic
					if(theMaze.isOpen(Maze.Direction.UP) && !mazeArrayListTracker.contains(new Point(theMaze.getCurrentRow()-1,theMaze.getCurrentCol())))	//visited[currentRow-1][currentCol])
					{
						this.theMaze.move(Maze.Direction.UP);
						this.mazeStackTracker.push("UP");
						//System.out.println("Move U"); //debug
					}
					else if(theMaze.isOpen(Maze.Direction.DOWN) && !mazeArrayListTracker.contains(new Point(theMaze.getCurrentRow()+1,theMaze.getCurrentCol()))) //visited[currentRow+1][currentCol])
					{
						this.theMaze.move(Maze.Direction.DOWN);
						this.mazeStackTracker.push("DOWN");
						//System.out.println("Move D"); //debug
					}
					else if(theMaze.isOpen(Maze.Direction.LEFT) && !mazeArrayListTracker.contains(new Point(theMaze.getCurrentRow(),theMaze.getCurrentCol()-1)))//visited[currentRow][currentCol-1])?
					{
						this.theMaze.move(Maze.Direction.LEFT);
						this.mazeStackTracker.push("LEFT");
						//System.out.println("Move L"); //debug
					}
					else if(theMaze.isOpen(Maze.Direction.RIGHT) && !mazeArrayListTracker.contains(new Point(theMaze.getCurrentRow(),theMaze.getCurrentCol()+1)))//visited[currentRow][currentCol+1])
					{
						this.theMaze.move(Maze.Direction.RIGHT);
						this.mazeStackTracker.push("RIGHT");
						//System.out.println("Move R"); //debug
					}
					//mazeStackTracker logic
					else
					{
						//System.out.println("Popped" + mazeStackTracker.peek()); //debug
						Object stackPeek = mazeStackTracker.pop();

						if(stackPeek.equals("UP"))
						{
							this.theMaze.move(Maze.Direction.DOWN);
						}
						else if(stackPeek.equals("DOWN"))
						{
							this.theMaze.move(Maze.Direction.UP);
						}
						else if(stackPeek.equals("LEFT"))
						{
							this.theMaze.move(Maze.Direction.RIGHT);
						}
						else if(stackPeek.equals("RIGHT"))
						{
							this.theMaze.move(Maze.Direction.LEFT);
						}
					}

					//reaching the goal
					if (theMaze.goalReached() == true)
					{
						System.out.println("You Have Reached The Goal! You Are Now a Master Maze Solver!");
						break;
					}
				}
			}
			//prompts user to re-enter menuOption if their selection was out of bounds
			else
			{
				System.out.println("\nIllegal Selection! Enter a Different Option!\n");
			}

			//Object stackPeek2 = mazeStackTracker.peek(); //debug
			//System.out.println(mazeArrayListTracker); //debug

		}while (!(menuOption.equals("q") || menuOption.equals("Q")));
	}
}

