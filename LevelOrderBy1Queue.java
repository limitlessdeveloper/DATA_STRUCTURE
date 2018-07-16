import java.util.*;
import java.util.LinkedList;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class BSF{
	Node root;
	
	void BSFBySingleQueue(Node node){
		Queue<Node> q1=new LinkedList<Node>();
		if(node==null)return;
		q1.add(node);
		
		while(!q1.isEmpty()){
			int cn=q1.size();
			while(cn>0){
				Node current=q1.peek();
				if(current.left!=null)q1.add(current.left);
				if(current.right!=null)q1.add(current.right);
				System.out.print(current.data+" ");
				q1.remove();
				cn--;
			}
			System.out.println();
		}
	}
	
	public static void main(String []args){
		BSF obj=new BSF();
		obj.root=new Node(11);
		obj.root.left=new Node(29);
		obj.root.right=new Node(33);
		obj.root.left.left=new Node(54);
		obj.root.left.left.left=new Node(85);
		obj.BSFBySingleQueue(obj.root);
	}
}