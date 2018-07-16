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
	
	void inorderTraversal(Node node){
		Stack <Node> stack=new Stack<Node>();
		Node current=node;
		
		while(current!=null){
			stack.push(current);
			current=current.left;
		}
		
		while(stack.size()>0){
			current=stack.pop();
			System.out.print(current.data+" ");
			if(current.right!=null){
				current=current.right;
				while(current!=null){
					stack.push(current);
					current=current.left;
				}
			}
		}
	}
	
	public static void main(String []args){
		BinaryTree bt= new BinaryTree();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.left=new Node(6);
		bt.root.right.right=new Node(7);
		bt.inorderTraversal(bt.root);
	}
}

