import java.util.*;

class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class BinaryTree{
	Node root;
	
	void morriesTraversal(Node node){
		Node pre,current=node;
		while(current!=null){
			if(current.left==null){
				System.out.print(current.data+" ");
				current=current.right;
			}
			else{
				pre=current.left;
				while(pre.right!=current && pre.right!=null)
					pre=pre.right;
				if(pre.right==null){
					pre.right=current;
					current=current.left;
				}
				else{
					pre.right=null;
					System.out.print(current.data +" ");
					current=current.right;
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
		bt.morriesTraversal(bt.root);
	}
}
