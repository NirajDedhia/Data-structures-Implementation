/*
 * Author : Niraj Dedhia
 * This is the implementation of Circular linked list 
 * 
 */
class CircularNode
{
	CircularNode next;
	CircularNode prev;
	int data;
	
	// Constructor
	CircularNode(int data)
	{
		this.data = data;
	}
}

class CircularListMethods
{
	CircularNode front;
	int size;
	
	// Constructor
	CircularListMethods()
	{
		front = null;
		size = 0;
	}
	
	// insert : Insert an element in to linked list
	public void insert(int data)
	{
		size = size + 1;
		CircularNode n = new CircularNode(data);
		if(front == null)
		{
			front = n;
			front.next = n;
			front.prev = n;		
		}
		else
		{
			CircularNode temp = front;
			n.next = front;
			n.prev = front.prev;
			front.prev.next = n;
			front.prev = n;		
		}
	}
	
	// delete : Delete an element from linked list
	public void delete(int data)
	{
		if(front.data == data)
		{
			front.prev.next = front.next;
			front.next.prev = front.prev;
			front = front.next;
			size = size - 1;
		}
		else
		{
			if(front == null)
				System.out.println("List is Empty");
			else
			{
				int found = 1;
				int count = 0;
				CircularNode temp = front;
				while(count<size && found == 1)
				{
					if(temp.data == data)
					{
						found = 0;
						temp.prev.next = temp.next;
						temp.next.prev = temp.prev;
					}
					temp = temp.next;
				}
				if(found == 1)
					System.out.println("Value not found");
				size = size - 1;
			}
		}
	}
	
	// Display linked list
	public void display()
	{
		int count = 0;
		CircularNode d = front;
		String a ="";
		while(count<size)
		{
			a = a + (d.data+" || ");
			d = d.next;
			count = count + 1;
		}
		System.out.println(a);
	}
}

public class CircularLinkedList 
{
	public static void main(String[] args)
	{
		CircularListMethods clm = new CircularListMethods();
		for(int i=1;i<9;i++)
			clm.insert(i);
		
		System.out.print("Displaying Circular List -->  ");
		clm.display();
		
		clm.delete(1);
		clm.delete(3);
		clm.delete(5);
		
		clm.insert(10);
		
		System.out.print("Displaying Circular List -->  ");
		clm.display();
	}
}
