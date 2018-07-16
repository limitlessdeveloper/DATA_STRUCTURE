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
	
	int hight(Node node){
		if(node==null) return 0;
		int hl=hight(node.left);
		int hr=hight(node.right);
		if(hr<hl) return(hl+1);
		else return(hr+1);
	}
	
	void levelOrderTree(Node node){
		int h=hight(node);
		for(int i=1;i<=h;i++){
			printLevelOrder(node,i);
		System.out.println();
		}
	}
	
	void printLevelOrder(Node node,int level){
		if(node==null) return;
		else if(level==1) System.out.print(node.data+" ");
		else{
			//if((level-1)==1) System.out.println();
			printLevelOrder(node.left,level-1);
			printLevelOrder(node.right,level-1);
		} 
	}
}

class Main{
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
		tree.levelOrderTree(tree.root);
		
	} 
}