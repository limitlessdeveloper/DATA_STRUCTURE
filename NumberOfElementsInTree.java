import java.util.*;
class Node{
	Node left,right;
	int data;
	Node(int data){
		this.left=this.right=null;
		this.data=data;
	}
}

class Tree{
	Node root;
	int n;
	
	void numberOfElements(Node node){
		if(node==null)return ;
		else{
			System.out.println(node.data);
			n++;
			numberOfElements(node.left);
			numberOfElements(node.right);
		}
	}
	
	int numberOfElements2(Node node){
		if(node==null)return 0;
		else{
			return(1+numberOfElements2(node.left)+numberOfElements2(node.right));
		}
	}
	
	public static void main(String []args){
		Tree ob=new Tree();
		ob.root=new Node(5);
		ob.root.left=new Node(15);
		ob.root.right=new Node(25);
		ob.root.right.left=new Node(35);
		ob.root.right.right=new Node(45);
		ob.root.left.left=new Node(55);
		ob.root.left.right=new Node(65);
		ob.numberOfElements(ob.root);
		int n=ob.numberOfElements2(ob.root);
		System.out.println(ob.n);
		System.out.println();
		System.out.println(n);
		
	}
}