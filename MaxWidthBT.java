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
	int minLevel;
	int maxLevel;
	int minimumLevel(Node node){
		if(node.left!=null){
			minLevel-=1;
			System.out.println(minLevel);
			minimumLevel(node.left);
		}
		return minLevel;
	}
	int maximumLevel(Node node){
		if(node.right!=null){
			maxLevel+=1;
			System.out.println(maxLevel);
			maximumLevel(node.right);
		}
		return maxLevel;
	}
	void findWidth(Node node){
		int min=0,max=0;
		if(node.left!=null){
			minLevel=minLevel-1;
			min=minimumLevel(node.left);
			System.out.println("min "+min);
		}
		if(node.right!=null){
			maxLevel=maxLevel+1;
			max=maximumLevel(node.right);
			System.out.println("max "+max);
		}
		System.out.println("The maximum Width of the tree is :"+(max-min));
	}
	
	public static void main(String []args){
		Tree tree=new Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right=new Node(3);
		tree.root.right.right=new Node(8);
		tree.root.right.right.left=new Node(6);
		tree.root.right.right.right=new Node(7);
		tree.findWidth(tree.root);
	}
}
