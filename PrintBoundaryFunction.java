import java.util.*;

class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class Tree{
	Node root;
	
	void printLeaf(Node node){
		if(node==null) return;
		if(node.left!=null) printLeaf(node.left);
		if(node.left==null && node.right==null) System.out.print(node.data+" ");
		if(node.right!=null) printLeaf(node.right);
	}
	
	void printLeftNodes(Node node){
		if(node!=null){
			if(node.left!=null){
				System.out.print(node.data+" ");
				printLeftNodes(node.left);
			}
			else if(node.right!=null){
				System.out.print(node.data+" ");
				printLeftNodes(node.right);
			}	
		}
	}
	
	void printRightNodes(Node node){
		if(node!=null){
			if(node.right!=null){
				printRightNodes(node.right);
				System.out.print(node.data+" ");
			}
			else if(node.left!=null){
				printRightNodes(node.left);
				System.out.print(node.data+" ");
			}
		}
	}
	
	void printBoundaryNodes(Node node){
		if(node==null) return;
		System.out.print(node.data+" ");
		printLeftNodes(node.left);
		printLeaf(node.left);
		printLeaf(node.right);
		printRightNodes(node.right);
	}
	
	public static void main(String []args){
		Tree tree=new Tree();
		tree.root= new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.right.right=new Node(6);
		tree.root.right.right.left=new Node(9);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.right.left=new Node(7);
		tree.root.left.right.right=new Node(8);
		tree.printBoundaryNodes(tree.root);
	}
}