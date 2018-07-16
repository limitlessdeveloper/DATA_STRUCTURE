import java.util.*;
import java.util.LinkedList;

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
	
	void levelOrderTraversal(Node node){
		Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
		if(node==null) return;
		
		q1.add(node);
		while(!q1.isEmpty() || !q2.isEmpty()){
			while(!q1.isEmpty()){
				if(q1.peek().left!=null){
					q2.add(q1.peek().left);
				}
				
				if(q1.peek().right!=null){
					q2.add(q1.peek().right);
				}
				
				System.out.print(q1.peek().data+" ");
				q1.remove();
			}
			System.out.println();
			
			while(!q2.isEmpty()){
				if(q2.peek().left!=null){
					q1.add(q2.peek().left);
				}
				
				if(q2.peek().right!=null){
					q1.add(q2.peek().right);
				}
				System.out.print(q2.peek().data+" ");
				q2.remove();	
			}
			System.out.println();
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
		tree.levelOrderTraversal(tree.root);
	}
}