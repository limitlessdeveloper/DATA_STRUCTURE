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
	int treeHight(Node node){
		if(node==null) return 0;
		int hl=treeHight(node.left);
		int hr=treeHight(node.right);
		if(hl>hr){
			return(hl+1);
		}
		else return (hr+1);
	}
	int getWidth(Node node,int hight){
		if(node==null) return 0;
		else{int maxWidth=0;
			for(int i=1;i<hight;i++){
				int n=getMaxWidth(node,i);
				if(maxWidth<=n) maxWidth=n;
			}
			return maxWidth;
		}
	}
	int getMaxWidth(Node node,int level){
		if(node==null)return 0;
		else if(level==1) return 1;
		else{
			return(getMaxWidth(node.left,level-1)+ getMaxWidth(node.right,level-1));
		}
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
		System.out.println(tree.getWidth(tree.root,tree.treeHight(tree.root)));
	}
	
}