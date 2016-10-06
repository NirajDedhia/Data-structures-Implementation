/*
 * Author : Niraj Dedhia
 * This is the implementation of Queue 
 * 
 */
class MyQueue
{
	int queue[];
	int size;
	int front;
	
	// Constructor
	MyQueue()
	{
		queue = new int[1000];	
		size = -1;
		front = 0;
	}
	
	// Enqueue : Adding an element in to queue
	public void enQueue(int element)
	{
		size = size + 1;
		queue[size]=element;
	}
	
	// Dequeue : Removing an elements from queue
	public int deQueue()
	{
		int top = queue[front];
		front = front + 1;
		return (top);
	}
	
	// Displaying queue
	public String toString()
	{
		String a="";
		for(int i=front;i<=size;i++)
		{
			a = a + (queue[i]+ " ");
		}
		return a;
	}
}

public class Queue
{
	public static void main(String[] args)
	{
		MyQueue mq = new MyQueue();
		int a;
		
		// Adding values
		for(int i=1;i<6;i++)
			mq.enQueue(i);
		
		System.out.print("Displaying Queue -->  "); 
		System.out.println(mq); // Display queue
		
		// Removing values
		for(int i=1;i<4;i++)
			a = mq.deQueue();
		
		System.out.print("Displaying Queue after Dequeue -->  ");
		System.out.println(mq); // Display queue
		
		// Adding values
		for(int i=6;i<10;i++)
			mq.enQueue(i);
		
		System.out.print("Displaying Queue -->  ");
		System.out.println(mq); // Display queue

	}
}

