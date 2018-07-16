import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node right;
	Node left;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
class LNode{
	int data;
	LNode next;
	LNode prev;
	public LNode(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class BSTtoDL{
			public static Node root;
			public static boolean isLeft;
			public void addNode(int datas){
				Node newNode= new Node(datas);
				if(root==null){
					root=newNode;
					return;
				}
				Node Current=root;
				while(Current!=null){
					if(Current.data>datas){
						if(Current.left==null){
							Current.left=newNode;
							return;
						}
						 else{
							Current=Current.left;
							continue;
						 }
					}
					if(Current.data<datas){
						if(Current.right==null){
							Current.right=newNode;
							return;
						}
						else{
						Current=Current.right;
							continue;
						}
					}
				}
				
			}
	public Node find(int id){
		Node current = root;
		Node parent = root;
	    isLeft=false;
		while(current!=null){
				parent=current;
			if(current.data==id){
				return parent;
			}else if(current.data>id){
				isLeft=true;
				current = current.left;
			}else{
				isLeft=false;
				current = current.right;
			}
		}
		return null;
    }
		public void delete(int datas){
			if(root==null){
				System.out.println("The value of  Tree is Null");
				return;
			}
			Node Current;
			Current=find(datas);
			if(Current.left==null && Current.right==null){
				if(isLeft==true){
					Current.left=null;
					return;
				}
				if(isLeft==false){
					Current.right=null;
					return;
					}
			}
		}		
			public void display(Node root){
				if(root!=null){
					display(root.left);
					System.out.print(" "+root.data);
					display(root.right);
				}
			}
			void createDL(Node root){
				
				
			}
			public static void main(String [] args ){
				BSTtoDL bs= new BSTtoDL();
				bs.addNode(10);
				bs.addNode(12);
				bs.addNode(15);
				bs.addNode(25);
				bs.addNode(30);
				bs.addNode(36);
				bs.display(bs.root);
				System.out.println();
				//bs.delete(5);
				//bs.display(bs.root);
				//bs.createDL(bs.root);
			}
}
