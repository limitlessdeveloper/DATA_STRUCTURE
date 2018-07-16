import java.util.*;
 class Node {
	 Node left,right;
	 int data;
	 Node(int data){
		 this.data=data;
		 this.left=this.right=null;
	 }
 }
 
 class BinaryTree{
	 
	 Node root;
	 void iterativePreorder(Node node){
			Stack<Node> s1=new Stack<Node>();
			Stack<Node> s2=new Stack<Node>();
			
			Node current=node;
			s1.push(current);
			while(s1.size()>0 || s2.size()>0){
				while(s1.size()>0){
				current=s1.pop();
				System.out.print(current.data+" ");
				if(current.left!=null){
					s1.push(current.left);
					}
				if(current.right!=null){
					s2.push(current.right);
					}
				}
				while(s2.size()>0){
				current=s2.pop();
				System.out.print(current.data+" ");
				if(current.left!=null){
					s1.push(current.left);
					}
				if(current.right!=null){
					s2.push(current.right);
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
		bt.iterativePreorder(bt.root);
	 }
 }