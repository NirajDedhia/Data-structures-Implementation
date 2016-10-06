/*
 * Author : Niraj Dedhia
 * This is the implementation of Nodes for tree 
 * 
 */
public class Node 
{
	Node leftNode;
	Node rightNode;
	int data;
	
	// Constructor
	Node(int data)
	{
		this.leftNode = null;
		this.rightNode = null;
		this.data = data;
	}
}
