import java.util.*;

class Node{
	int data;
	Node left,right;
	
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class Tree{
	Node root;
	
	void postOrderTraversal(Node node){
		Stack<Node> stack1=new Stack<Node>();
		Stack<Node> stack2=new Stack<Node>();
		
		stack1.push(node);
		while(stack1.size()>0){
			Node current=stack1.pop();
			stack2.push(current);
			if(current.left!=null)
				stack1.push(current.left);
			if(current.right!=null)
				stack1.push(current.right);
		}
		while(stack2.size()>0){
			Node printTree=stack2.pop();
			System.out.print(printTree.data);
		}
		
	}

	
	public static void main(String []args){
		Tree tree=new Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.right.right=new Node(6);
		tree.root.right.right.left=new Node(9);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.right.left=new Node(7);
		tree.root.left.right.right=new Node(8);
		tree.postOrderTraversal(tree.root);
	}
}