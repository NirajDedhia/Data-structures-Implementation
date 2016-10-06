/*
 * Author : Niraj Dedhia
 * This is the implementation of Stack 
 * 
 */

class MyStack<T>
{
	Object al[];
	int size;
	
	// Constructor
	MyStack()
	{
		al = new Object[1000];	
		size = -1;
	}
	
	// Push Method : Add an element in to Stack
	public void push(T element)
	{
		size = size + 1;
		al[size]=element;
	}
	
	// Pop Method : Removes and returns the topmost element
	public T pop()
	{
		T top = (T)al[size];
		size = size - 1;
		return (top);
	}
	
	// Peek Method : Returns the top most element in Stack
	public T peek()
	{
		T top = (T)al[size];
		return (top);
	}
	
	// Print the Stack
	public String toString()
	{
		String a="";
		for(int i=0;i<=size;i++)
		{
			a = a + (al[i]+ " ");
		}
		return a;
	}
}

public class Stack
{
	public static void main(String[] args)
	{
		MyStack<Integer> ms = new MyStack<Integer>();
		int a;
		// pushing values to stack
		for(int i=1;i<6;i++)
			ms.push(i);
		
		System.out.print("Displaying Stack -->  ");
		
		System.out.println(ms); // print Stack
		
		System.out.println("Top : "+ms.peek()); // Topmost element
		
		// Removing values from stack
		for(int i=1;i<4;i++)
			a = ms.pop();
		
		System.out.print("Displaying Stack -->  ");
		System.out.println(ms); // print Stack
		
		System.out.println("Top : "+ms.peek()); // Topmost element
		
		// pushing values to stack
		for(int i=6;i<10;i++)
			ms.push(i);
		
		System.out.print("Displaying Stack -->  ");
		System.out.println(ms); // print Stack
		
		System.out.println("Top : "+ms.peek()); // Topmost element

	}
}

