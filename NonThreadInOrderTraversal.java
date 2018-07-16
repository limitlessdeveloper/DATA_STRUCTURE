import java.util.*;

class Node {
	int data;
	Node left,right,parent;
	Node (int data){
		this.data=data;
		this.left=this.right=this.parent=null;
		
	}
}

class Tree{
	Node root;
	boolean leftdone;
	Tree(){
		leftdone=false;
	}
	void nonThreadTraversal(Node node){
		Node current=node;
		if(current==null) return;
		while(current!=null){
			if(leftdone==false){
				while(current.left!=null){
					current=current.left;
				}
				System.out.print(current.data+" ");
				leftdone=true;
			}
			
			if(current.right!=null && leftdone==true){
				current=current.right;
				leftdone=false;
			}
			if(leftdone==true && current.right==null){
				
				 if(current==current.parent.left){
					current=current.parent;
					System.out.print(current.data+" ");
				}
				else if (current==current.parent.right && current.parent.parent!=null){
					while(current!=current.parent.left) current=current.parent;
					current=current.parent;
					System.out.print(current.data+" ");
				}
				else current=null;
				
			}
		}
	}
	
	public static void main(String []args){
		Tree tree=new Tree();
		tree.root=new Node(1);
		tree.root.parent=null;
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.parent=tree.root;
		tree.root.right.parent=tree.root;
		 tree.root.left.left=new Node(4);
		 tree.root.left.right=new Node(5);
		 tree.root.left.left.parent=tree.root.left;
		 tree.root.left.right.parent=tree.root.left;
		 tree.root.left.right.left=new Node(6);
		 tree.root.left.right.right=new Node(7);
		 tree.root.left.right.left.parent=tree.root.left.right;
		 tree.root.left.right.right.parent=tree.root.left.right;
		tree.nonThreadTraversal(tree.root);
	}
}