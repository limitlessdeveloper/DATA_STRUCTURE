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
	int sum;
	
	int calSum(Node node){
		if(node==null) return 0;
		else{
			int hl=calSum(node.left);
			int hr=calSum(node.right);
			
			if(hl>=hr){
				sum=sum + node.data;
				return hl+1;
			}
			else{
				sum=sum + node.data;
				return hr+1;
			}
		}	
	}
		
	void printSum(){
		System.out.println("Sum = "+sum);
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
		System.out.println(tree.calSum(tree.root));
		tree.printSum();
		
	}
}