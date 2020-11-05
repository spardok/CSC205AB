public class DLLTesterHG
{
	public static void main(String[ ] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String test = kb.nextLine();
		System.out.println(test + "\n");

		//===============================================
		if (test.equalsIgnoreCase("Testing addLast") ||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\naddLast with 2, 3, 4, 5, 6 then doing toString():");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 2, 3, 4, 5, 6 } );
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing addFirst") ||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\naddFirst(0) with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.addFirst(0);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\naddFirst(0) with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.addFirst(0);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\naddFirst(0) with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.addFirst(0);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing getFirst")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\ngetFirst() with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.getFirst();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ngetFirst() with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.getFirst();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ngetFirst() with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.getFirst();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing getLast")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\ngetLast() with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.getLast();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ngetLast() with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.getLast();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ngetLast() with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.getLast();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing removeFirst")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nremoveFirst() with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.removeFirst();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremoveFirst() with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.removeFirst();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremoveFirst() with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.removeFirst();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing removeLast")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nremoveLast() with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.removeLast();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremoveLast() with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.removeLast();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremoveLast() with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.removeLast();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing size")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nsize() with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.size();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nsize() with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.size();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nsize() with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					int elt = myDLL.size();
					System.out.println("returned:\t   " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing isEmpty")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nisEmpty() with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.isEmpty();
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nisEmpty() with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.isEmpty();
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nisEmpty() with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.isEmpty();
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing contains")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\ncontains(4) with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.contains(4);
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ncontains(6) with one-element DLList that contains it:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.contains(6);
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ncontains(6) with one-element DLList that does NOT contain it:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3 } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.contains(6);
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ncontains(3) with many-element DLList that contains it first:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.contains(3);
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ncontains(5) with many-element DLList that contains it in the middle:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.contains(5);
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ncontains(8) with many-element DLList that contains it last:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.contains(8);
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\ncontains(99) with many-element DLList that does NOT contain it:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:\t" + myDLL);
					boolean result = myDLL.contains(99);
					System.out.println("returned:\t   " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing add")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nadd(-1, 4):");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(-1, 4);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(0, 4) with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(0, 4);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(1, 4) with empty DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(1, 4);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(0, 1) with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(0, 1);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(1, 5) with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(1, 5);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(2, 5) with one-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(2, 5);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(0, 1) with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(0, 1);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(1, 4) with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(1, 4);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(3, 8) with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(3, 8);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(6, 15) with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(6, 15);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nadd(7, 15) with many-element DLList:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:\t" + myDLL);
					myDLL.add(7, 15);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}
		//===============================================

		if (test.equalsIgnoreCase("Testing remove")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nremove(2) from empty list:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:\t" + myDLL);
					boolean boolResult = myDLL.remove(2);
					System.out.println("returned:\t   " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremove(2) from one-element list that contains it:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 2 } );
					System.out.println("toString before:\t" + myDLL);
					boolean boolResult = myDLL.remove(2);
					System.out.println("returned:\t   " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremove(2) from one-element list that does NOT contain it:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 5 } );
					System.out.println("toString before:\t" + myDLL);
					boolean boolResult = myDLL.remove(2);
					System.out.println("returned:\t   " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremove(3) from many-element list that contains it at front (and back):");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 3 } );
					System.out.println("toString before:\t" + myDLL);
					boolean boolResult = myDLL.remove(3);
					System.out.println("returned:\t   " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremove(7) from many-element list that contains it in middle (and back):");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 7 } );
					System.out.println("toString before:\t" + myDLL);
					boolean boolResult = myDLL.remove(7);
					System.out.println("returned:\t   " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremove(13) from many-element list that contains it at back:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:\t" + myDLL);
					boolean boolResult = myDLL.remove(13);
					System.out.println("returned:\t   " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nremove(99) from many-element list that does NOT contain it:");
				DLList<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:\t" + myDLL);
					boolean boolResult = myDLL.remove(99);
					System.out.println("returned:\t   " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
				}
				finally
				{
					System.out.println("toString after:\t\t" + myDLL);
					System.out.println("backwards after:\t" + myDLL.backwards());
				}
			}
		}

	}

	//=================
	static DLList<Integer> generateDLL(int[ ] elements)
	{
		DLList<Integer> theDLL = new DLList<Integer>();
		for (int i=0; i<elements.length; i++)
			theDLL.addLast(elements[i]);

		return theDLL;
	}
}
