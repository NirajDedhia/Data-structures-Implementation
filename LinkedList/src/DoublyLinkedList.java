/*
 * Author : Niraj Dedhia
 * This is the implementation of Doubly Linked list 
 * 
 */
class doubleNode
{
	doubleNode prev;
	int data;
	doubleNode next;
	
	// Constructor
	doubleNode(int data)
	{
		this.prev = null;
		this.next = null;
		this.data = data;
	}
}

class DoublyNodeMethods
{
	doubleNode front;
	
	// Constructor
	DoublyNodeMethods()
	{
		front = null;
	}
	
	// insertion : Insert an element in to linked list
	public void insertion(int data)
	{
		doubleNode n = new doubleNode(data);
		if(front == null)
			front = n;
		else
		{
			n.next = front;
			front.prev = n;
			front = n;
		}
	}
	
	// deletion : Delete an element from linked list
	public void deletion()
	{
		if(front == null)
			System.out.println("List is empty");
		else
		{
			front = front.next;
			front.prev = null;
		}		
	}
	
	// insertLast : Insert an element at the end
	public void insertLast(int data)
	{
		doubleNode n = new doubleNode(data);
		doubleNode temp=front;
		if(front == null)
			front = n;
		else
		{
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			n.prev = temp;
			temp.next = n;
		}			
	}
	
	// deleteLast : Delete an element from the end
	public void deleteLast()
	{
		doubleNode temp=front;
		if(front == null)
			System.out.println("List is Empty");
		else
		{
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.prev.next = null;
		}			
	}
	
	// insertAfter : Insert an element after a given element
	public void insertAfter(int data, int a)
	{
		doubleNode n = new doubleNode(a);
		doubleNode temp=front;
		if(front==null)
			System.out.println("List is Empty");
		else
		{
			int found = 1;
			while(temp!=null && found==1)
			{
				if(temp.data == data)
				{
					found = 0;
					temp.next.prev = n;
					n.next = temp.next;
					n.prev = temp;
					temp.next = n;
				}
				else
				{
					temp = temp.next;
				}
			}
			if(found == 1)
				System.out.println("Value not found!! so can not insert!!!");
		}
	}
	
	// delete : Insert an element
	public void delete(int data)
	{
		if(front.data == data)
			deletion();
		else
		{
			doubleNode temp=front;
			if(front == null)
				System.out.println("List is Empty");
			else
			{
				int found = 1;
				while(temp!=null && found==1)
				{
					if(temp.data == data)
					{
						found = 0;
						temp.prev.next = temp.next;
						temp.next.prev = temp.prev;
					}
					else
					{
						temp = temp.next;
					}
				}
				if(found == 1)
					System.out.println("Value not found!! So can not delete!!!");
			}
		}
			
	}
	
	// displayForward : display linkedlist in forward direction
	public void displayForward()
	{
		String a = "";
		doubleNode d = front;
		while(d!=null)
		{
			a = a + (d.data+" || ");
			d = d.next;
		}
		System.out.println(a);
	}
	
	// displayBackward : display linkedlist in backward direction
	public void displayBackward()
	{
		String a = "";
		doubleNode d = front;
		while(d.next!=null)
		{
			d = d.next;
		}
		
		while(d!=null)
		{
			a = a + (d.data+" || ");
			d = d.prev;
		}
		System.out.println(a);
	}
	
}


public class DoublyLinkedList 
{
	public static void main(String[] args)
	{
		DoublyNodeMethods dnm = new DoublyNodeMethods();
		int a;
		for(int i=5;i>=1;i--)
			dnm.insertion(i);
		
		for(int i=7;i<10;i++)
			dnm.insertLast(i);
		
		System.out.print("Displaying Linked List in forward -->  ");
		dnm.displayForward();
		System.out.print("Displaying Linked List in backward -->  ");
		dnm.displayBackward();
		
		dnm.insertAfter(1,10);
		dnm.insertAfter(5,6);
//		dnm.displayForward();
//		dnm.displayBackward();
		
		dnm.delete(1);
		dnm.delete(5);
		
		for(int i=1;i<3;i++)
			dnm.deletion();
		
		for(int i=1;i<2;i++)
			dnm.deleteLast();
		
		System.out.print("Displaying Linked List in forward -->  ");
		dnm.displayForward();
		System.out.print("Displaying Linked List in backward -->  ");
		dnm.displayBackward();
			
	}
}
