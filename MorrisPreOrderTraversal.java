import java.util.*;

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
	
	void morrisPreOrderTraversal(Node node){
		if(node==null) return;
		Node current=node,pre;
		while(current!=null){
			if(current.left==null){
				System.out.println(current.data);
				current=current.right;
			}
			else{
				pre=current.left;
				while(pre.right!=null && pre.right!=current){
					pre=pre.right;
				}

				if(pre.right==current){
					pre.right=null;
					current=current.right;					
				}
				else{
					System.out.println(current.data);
					pre.right=current;
					current=current.left;
				}
			}
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
		tree.morrisPreOrderTraversal(tree.root);
	}
}