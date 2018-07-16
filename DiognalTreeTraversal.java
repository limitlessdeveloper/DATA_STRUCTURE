import java.util.*;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Vector;


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
	
	void diognalTraversal(Node node , HashMap<Integer,Vector<Integer>> printdiognal, int d){
		if(node==null) return;
		
		Vector<Integer> k=printdiognal.get(d);
		
		if(k==null){
			k= new Vector<Integer>();
			k.add(node.data);
		}
		else{
			k.add(node.data);
		}
		printdiognal.put(d,k);
		diognalTraversal(node.left,printdiognal,d+1);
		diognalTraversal(node.right,printdiognal,d);
	}
	
	void printdiognalelelment(Node node){
		HashMap<Integer,Vector<Integer>> printdiognal=new HashMap<>();
		diognalTraversal(node,printdiognal,0);
		
		System.out.println("Printing Diagonal Element");
		for(Entry<Integer,Vector<Integer>> entry:printdiognal.entrySet()){
			System.out.println(entry.getValue());
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
		tree.printdiognalelelment(tree.root);
	}
	
}


