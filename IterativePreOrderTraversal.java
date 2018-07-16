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
	
	void preOrderTraversal(Node node){
		Stack<Node> s=new Stack<Node>();
		s.push(node);
		while(s.size()>0){
			Node current=s.pop();
			System.out.println(current.data);
			if(current.right!=null){
				s.push(current.right);
			}
			if(current.left!=null){
				s.push(current.left);
			}	
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
		tree.preOrderTraversal(tree.root);
	}
	
}

