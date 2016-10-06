/*
 * Author : Niraj Dedhia
 * This is the implementation of Singly linked list 
 * 
 */
class NodeMethods
{
	Node front;
	
	// Constructor
	NodeMethods()
	{
		this.front = null;
	}
	
	// append : Insert an element in to linked list
	void append(int data)
	{
		Node n = new Node(data);
		if(this.front == null)
		{
			this.front = n;
		}
		else
		{
			Node temp = front;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	
	// remove : Delete an element from linked list
	void remove(int data)
	{
		int found = 0;
		if(front.data == data)
		{
			front = front.next;
			found = 1;
		}
		Node prev=new Node(0);
		prev.next = front;
		
		while(prev.next!=null && found == 0)
		{
			if(prev.next.data == data)
			{
				prev.next = prev.next.next;
				found = 1;
			}
			else
			{
				prev = prev.next;
			}
		}
		if(found == 0)
		System.out.println("Value not found");
	}
	
	// Display linked list
	public String toString()
	{
		String a = "";
		Node d = front;
		while(d!=null)
		{
			a = a + (d.data+" || ");
			d = d.next;
		}
		return (a);
	}
	

}

public class SingleNode 
{
	public static void main (String[] args)
	{
		NodeMethods mn = new NodeMethods();
		int a;
		for(int i=1;i<6;i++)
			mn.append(i);
		
		System.out.print("Displaying Linked List after insertion-->  ");
		System.out.println(mn);
		
		for(int i=1;i<4;i++)
			mn.remove(i);
		
		System.out.print("Displaying Linked List after deletion-->  ");
		System.out.println(mn);
		
		for(int i=6;i<10;i++)
			mn.append(i);
		
		System.out.print("Displaying Linked List after insertion-->  ");
		System.out.println(mn);
		
	}
}
