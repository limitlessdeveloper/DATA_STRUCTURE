import java.util.*;
import java.lang.*;

class Node{
	int data;
	Node left,right ;
	
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class DFS{
	Node root;
	
	void printInOrder(Node node){
		if(node==null) return;
		printInOrder(node.left);
		System.out.print(node.data+" ");
		printInOrder(node.right);
	}
	
	void printPreOrder(Node node){
		if(node==null) return;
		System.out.print(node.data+" ");
		printPreOrder(node.left);
		printPreOrder(node.right);

	}
	void printPostOrder(Node node){
		if(node==null) return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.data+" ");

	}
	
}

class Main{
	public static void main(String []args){
		DFS tree=new DFS();
		tree.root= new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		
		System.out.println("InOrder Tree Traversal");
		tree.printInOrder(tree.root);
		System.out.println("\nPreOrder Tree Traversal");
		tree.printPreOrder(tree.root);
		System.out.println("\nPostorder Tree Traversal");
		tree.printPostOrder(tree.root);
		
	}
}