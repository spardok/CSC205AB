/*
Michael Vecchio
Stack Assignment
CSC205AB 13608
*/

import java.io.*;
import java.util.*;
import java.util.EmptyStackException;

public class Stack<E> implements java.io.Serializable
	{
	//------- data
	private ArrayList<E> theArrayList;

	//------- constructors
	public Stack()
	{
		this.theArrayList = new ArrayList<E>();
	}

	//------- methods

	//push
	public void push(E element)
	{
		theArrayList.add(element);
	}

	//pop
	public E pop()
	{
		if (theArrayList.isEmpty())
			throw new EmptyStackException();

		return theArrayList.remove(theArrayList.size() - 1);
	}
	//peek
	public E peek()
	{
		if (theArrayList.isEmpty())
			throw new EmptyStackException();

		return theArrayList.get(theArrayList.size() - 1);
	}

	//isEmpty
	public boolean isEmpty()
	{
		return theArrayList.isEmpty();
	}

	//size
	public int size()
	{
		return theArrayList.size();
	}
}