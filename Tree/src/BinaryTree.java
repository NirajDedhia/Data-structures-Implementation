/*
 * Author : Niraj Dedhia
 * This is the implementation of Tree (Binary) 
 * 
 */
class Binary
{
	Node root;
	
	// Creating constructor for class
	Binary()
	{
		this.root = null;
	}
	
	// This method adds the new data to existing tree
	public void addNode(int data)
	{
		Node n = new Node(data);
		if(root==null)
		{
			root = n;
		}
		else
		{
			Node p = root;
			Node q;
			while(true)
			{
				q = p; // not required q
				if(data<= p.data)
				{
					p = p.leftNode;
					if(p==null)
					{
						q.leftNode = n;   // can be written p = n;
						break;
					}
				}
				else
				{
					p = p.rightNode;
					if(p==null)
					{
						q.rightNode = n;
						break;
					}
				}
			}
		}
	}
	
	// This method prints the in-order of tree
	public void inOrder(Node p)
	{
		if(p!=null)
		{
			inOrder(p.leftNode);
			System.out.print(p.data+" ");
			inOrder(p.rightNode);
		}
	}
	
	// This method prints the pre-order of tree
	public void preOrder(Node p)
	{
		if(p!=null)
		{
			System.out.print(p.data+" ");
			preOrder(p.leftNode);
			preOrder(p.rightNode);
		}
	}
	
	// This method prints the post-order of tree
	public void postOrder(Node p)
	{
		if(p!=null)
		{
			postOrder(p.leftNode);
			postOrder(p.rightNode);
			System.out.print(p.data+" ");
		}
	}
	
	// Perform the binary search over tree
	public void search(int value)
	{
		Node n = root;
		int found = 1;
		while(n!=null)
		{
			if(value == n.data)
			{
				System.out.println(value+" --> Found in Tree  :-)");
				found = 0;
				break;
			}
			else if(value < n.data)
				n = n.leftNode;
			else
				n = n.rightNode;
			
		}
		if(found == 1)
			System.out.println(value+" --> Not Found in Tree  :-(");
	}
	
	// Calculate and returns the height of tree
	public int height(Node n)
	{
		if(n==null)
			return 0;
		else
		{
			int lhe = height(n.leftNode);
			int rhe = height(n.rightNode);
			
			if(lhe>=rhe)
				return lhe+1;
			else
				return rhe+1;
		}
	}
	
	// Perform bfs over tree
	public void bfs(Node n)
	{
		int h = height(n);
		for(int i=1;i<=h;i++)
		{
			printElementsAtLevel(n,i);
		}
	}
	
	// This method prints all the elements at particular level
	public void printElementsAtLevel(Node n, int l)
	{
		if(n==null)
			return;
		if(l==1)
			System.out.print(n.data+" ");
		else
		{
			printElementsAtLevel(n.leftNode, l-1);
			printElementsAtLevel(n.rightNode, l-1);
		}
		
	}
}

public class BinaryTree 
{
	public static void main(String[] args)
	{
		Binary b = new Binary();
		b.addNode(4);
		b.addNode(2);
		b.addNode(1);
		b.addNode(3);
		b.addNode(6);
		b.addNode(5);
		b.addNode(7);
			
		b.search(5);
		System.out.println();
		b.search(10);
		System.out.println();
		
		System.out.println("Height of tree : "+b.height(b.root));
		System.out.println();
		
		System.out.println("DFS OF TREE AS FOLLOWS : ");
		System.out.print("INORDER  :  --> ");
		b.inOrder(b.root);
		System.out.println();		
		System.out.print("PREORDER  :  --> ");
		b.preOrder(b.root);
		System.out.println();
		System.out.print("POSTORDER  :  --> ");
		b.postOrder(b.root);
		System.out.println();
		System.out.println();
		
		System.out.print("BFS OF TREE  :  --> ");
		b.bfs(b.root);
		System.out.println();
		System.out.println();
		
	}
}

/***
 * Tree looks like 
 * 
 * 	      			4
 * 				/		\
 *  		2				6
 *  	  /   \           /   \
 *		1		3		5		7		
 */






