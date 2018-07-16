import java.util.*;

class Node{
	int data;
	Node left,right;
	
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class BinaryTree{
	Node root;
	
	void printInOrder(Node node){
		
		Stack<Node> s=new Stack<Node>();
		Node current=node;
		
		if(current==null) return;
		
		while(current!=null){
			s.push(current);
			current=current.left;
		}
		
		while(s.size()>0){
			current=s.pop();
			System.out.println(current.data);
			
			if(current.right!=null){
				current=current.right;
				
				while(current!=null){
					s.push(current);
					current=current.left;
				}
			}
		}
		
	}
}

class Main{
	public static void main(String []args){
		BinaryTree tree=new BinaryTree();
		tree.root= new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.right.right=new Node(6);
		tree.root.right.right.left=new Node(9);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.right.left=new Node(7);
		tree.root.left.right.right=new Node(8);
		tree.printInOrder(tree.root);
	}
}