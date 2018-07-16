import java.util.*;
import java.lang.*;

class Node{
	int data;
	Node left,right;
	
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class Tree{
	Node root;
	
	int hight(Node root){
		if(root==null) return 0;
		else{
			
			int lh= hight(root.left);
			int rh= hight(root.right);
			
			if(rh<lh){
				return lh+1; 
			}
			else return rh+1;
		}
	}
	
	void printLevelOrder(Node root){
		int h=hight(root);
		for(int i=1;i<=h;i++){
			levelOrder(root,i);
		}
	}
	
	void levelOrder(Node node,int level){
		if(node==null) return;
		else if(level==1){
			System.out.println(node.data);
		}
		else{
			levelOrder(node.left,level-1);
			levelOrder(node.right,level-1);
		}
	}
}

class Main{
	public static void main(String []args){
		Tree tree=new Tree();
		tree.root= new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.printLevelOrder(tree.root);
		
	}
}