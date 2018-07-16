import java.util.*;
import java.lang.*;

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
	Node arr[];
	int s;
	int size;
	Node current;
	Tree(int n){
		size=n;
		 arr=new Node[size];
		 s=-1;
	}
	
	void push(Node node){
		if(s>=size){
			System.out.println("Stack Overflow");
			return;
		}
		else{
			s++;
			arr[s]=node;
			return;
		}
	}
	
	Node pop(){
		if(s==-1){
			System.out.println("stack underflow");
			return null;
		}
		else{
			Node ref=arr[s];
			s--;
			return ref;			
		}
	}
		
	void printInOrder(Node node){
		Node current=node;
		if(current==null) return;
		while(current!=null){
			push(current);
			current=current.left;
		}
		
		while(s>=0){
			current=pop();
			System.out.println(current.data);
			if(current.right!=null){
				current=current.right;
				while(current!=null){
					push(current);
					current=current.left;
				}
			}
		}
	}	
	
}

class Main{
	public static void main(String []args){
		Tree tree=new Tree(10);
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