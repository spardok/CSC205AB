//This class will implement a singly linked List, using Generics

import java.util.*;

public class SLList<E>
{
	//-------- data
	private SLLNode<E> head;
	private SLLNode<E> tail;

	//-------- constructors
	public SLList()
	{
		head = null;
		tail = null;
	}

	//-------- methods
	public String toString()
	{
		SLLNode<E> cursor = head;
		String str = "";
		while(cursor != null)
		{
			if (str.isEmpty())
				str = str + cursor.data;
			else
				str = str + ", " + cursor.data;
			cursor = cursor.next;
		}
		return  "[" + str + "]";
	}

	//backwards - this will traverse the list like toString, only "backwards".
	public String backwards()
	{
		SLLNode<E> cursor = head;
		String str = "";
		while(cursor != null)
		{
			if (str.isEmpty())
				str = str + cursor.data;
			else
				str = str + ", " + cursor.data;
			cursor = cursor.next;
		}
		return  "[" + str + "]";
	}

	//addLast - adds a new SLLNode to the end of the list
	public void addLast(E theData)
	{
		//create the new SLLNode
		SLLNode<E> aNode = new SLLNode<E>(theData);

		//Case1:  the list was empty (head was null).  Change links
		if (head == null)
		{
			head = tail = aNode;
		}

		//Case2 and 3:  list has 1 or more elements.   Change links
		else
		{
			tail.next = aNode;    //put it on the end
			tail = aNode;     //now aNode is at the end (tail)
		}
	}

	//isEmpty - returns true if the list is empty
	public boolean isEmpty()
	{
		return head == null;
	}

	//------------------------------------------------------

	//addFirst - adds to the front of the list
	public void addFirst(E someData)
	{
		//create a new SLLNode
		SLLNode<E> aNode = new SLLNode<E>(someData);

		//Case1: is list empty?
		if (head== null)
			head = tail = aNode;

		//Case2,3: is has >=1 element already
		else
		{
			aNode.next = head;
			head = aNode;
		}

	}

	//getFirst - returns the element at the front of the list, without deleting
	public E getFirst()
	{
		//case1:   empty list
		if (head == null)
			throw new NoSuchElementException("can't getFirst from empty list");

		//case 2,3:   list has 1 or more elements - return data that head points at
		return head.data;
	}

	//getLast - returns the element at the end of the list, without deleting
	public E getLast()
	{
		//case1:   empty list
		if (head == null)
			throw new NoSuchElementException("can't getLast from empty list");

		//case 2,3:   list has 1 or more elements - return data that tail points at
		return tail.data;
	}

	//removeFirst - returns the element at the front of the list and deletes it
	public E removeFirst()
	{
		//case1: list is empty
		if (head == null)
			throw new NoSuchElementException("can't removeFirst from empty list");

		//case2:  1 element on the list
		else if (head == tail)
		{
			E savedData = head.data;   //save the data
			head = tail = null;
			return savedData;
		}

		//case3:  many elements on list
		else
		{
			E savedData = head.data;
			head = head.next;
			return savedData;
		}
	}

	//removeLast - returns the element at the end of the list and deletes it
	public E removeLast()
	{
		//case1: list is empty
		if (head == null)
			throw new NoSuchElementException("can't removeLast from empty list");

		//case2: list has 1 element
		else if (head == tail)
		{
			return removeFirst();   //or could have same 3 statements as removeFirst does
		}

		//case3: list has many elements
		else
		{
			//we need a cursor to traverse the list, stopping at the node IN FRONT of the tail
			SLLNode<E> cursor = head;

			//traverse
			while (cursor.next != tail)
				cursor = cursor.next;

			//save the last data so we can return it
			E savedData = tail.data;

			//now that cursor points at the second to last node, change the links
			cursor.next = null;
			tail = cursor;

			//return it
			return savedData;
		}


	}

	//size - returns the number of elements in the list
	public int size()
	{
		//needs a counter
		int count = 0;

		//declare a cursor that will "walk" through the list
		SLLNode<E> cursor = head;

		//as long as ("while") cursor is not null, count it
		while(cursor != null)
		{
			count++;
			cursor = cursor.next;    //move to the next node...
		}

		return count;
	}

	//contains - returns true if the list contains what is received, false otherwise
	public boolean contains(E elt)
	{
		//create a cursor so we can "walk" through the list
		SLLNode<E> cursor = head;

		//walk through the whole list (maybe)
		while (cursor != null)
		{
			if (cursor.data.equals(elt))    //found it!
				return true;
			cursor = cursor.next;
		}

		//if we get all the way through the list, we did not find it
		return false;
	}

	//add - adds a new element at the given index.
	//          throws IllegalArgumentException if the index is out of bounds
	public void add(int index, E elt)
	{
		//check to see if the index is out of bounds
		if (index < 0 || index > size())
			throw new IllegalArgumentException("index " + index + " is out of bounds");

		//create a new node that holds elt
		SLLNode<E> aNode = new SLLNode<E>(elt);

		//case1: list is empty
		if (head == null)
			head = tail = aNode;

		//case2,3: here, index is 0 so putting it at the front
		else if (index == 0)
			addFirst(elt);     //creates a new node and puts it at front

		//index is same as size() so putting it at the end
		else if (index == size())
			addLast(elt);

		//if we get to here, we know that it is going onto the list at a
		//legal index and not at the front or the back
		else
		{
			//find the node in front of where it goes...
			SLLNode<E> cursor = head;
			for (int i=0; i<index-1; i++)
				cursor = cursor.next;    //draw it out!!!

			//now cursor is at the node in front of where it goes
			//change the links
			aNode.next = cursor.next;
			cursor.next = aNode;
		}
	}

	//remove - removes and returns the first occurrance of an element.
	//                 returns true if successful, false otherwise
	public boolean remove(E elt)
	{
		//case1: list is empty
		if (head == null)
			return false;

		//case2: list has 1 element - one element to check
		else if (head == tail)
		{
			if (head.data.equals(elt))
			{
				removeFirst();
				return true;
			}
			else
				return false;
		}

		//case3: list has many elements
		else
		{
			//check to see if the list even contains it...
			if (!contains(elt))
				return false;
			//if we get to here, we know the list contains it
			//check to see if it is the first element...
			else if (head.data.equals(elt))
			{
				removeFirst();
				return true;
			}
			//if we get to here, we know the list contains it
			//and it is not the first element
			//so we can find the node in front of it (since not first)
			else
			{
				SLLNode<E> cursor = head;
				//move cursor, stopping at the node in front of one to be removed
				while(!cursor.next.data.equals(elt))
					cursor = cursor.next;

				//cursor should have stopped at the node before the one to be removed

				//if the node to be removed was the last one...
				if (cursor.next == tail)
					removeLast();
				//otherwise, make the link go around it
				else
					cursor.next = cursor.next.next;



				return true;

			}
		}
	}

}

//=================================

//This class will implement a node in our singly linked list
class SLLNode<E>
{
	//data
	protected E data;    //(protected here so we can say things like head.next)
	protected SLLNode<E> next;   //next points at another node

	//constructors
	public SLLNode(E theData)
	{
		data = theData;
		next = null;
	}

	//methods
	//toString - returns its representation as a String
	public String toString()
	{
		return "" + data;
	}

}


