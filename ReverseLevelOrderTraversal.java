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
	
	int hight(Node node){
		if(node==null) return 0;
		int hl=hight(node.left);
		int hr=hight(node.right);
		
		if(hl<hr) return(hr+1);
		else return(hl+1);
	}
	
	void reverseLevelOrder(Node node){
			
			int h=hight(node);
			for(int i=h;i>0;i--){
				printReverseLevelOrder(node,i);
				System.out.println();
			}
	}
	
	void printReverseLevelOrder(Node node,int level){
		if(node==null) return;
		else if(level==1) System.out.print(node.data+" ");
		else{
			printReverseLevelOrder(node.left,level-1);
			printReverseLevelOrder(node.right,level-1);
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
		tree.reverseLevelOrder(tree.root);
	}

}