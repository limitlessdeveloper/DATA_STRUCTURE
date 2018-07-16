import java.util.*;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Vector;


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
	
	void printVertical(Node node,TreeMap<Integer,Vector<Integer>> h,int d){
		
		if(node==null) return;
		
		Vector<Integer> k=h.get(d);
		
		if(k==null){
			k=new Vector<Integer>();
			k.add(node.data);
		}
		else{
			k.add(node.data);
		}
		
		h.put(d,k);
		
		printVertical(node.left,h,d-1);
		printVertical(node.right,h,d+1);
		
	}
	
	void printVerticalTree(Node node){
		TreeMap<Integer,Vector<Integer>> printvertical=new TreeMap<>();
		
		printVertical(node,printvertical,0);
		System.out.println("printing the vertical tree by Enter set which is the interface of Map FrameWork");
		
		for(Entry<Integer,Vector<Integer>> entry:printvertical.entrySet()){
			System.out.println(entry.getValue());
		}
	}
	
	public static void main(String []args){
		Tree tree=new Tree();
		tree.root= new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.right.right=new Node(6);
		tree.root.right.right.left=new Node(9);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.right.left=new Node(7);
		tree.root.left.right.right=new Node(8);
		tree.printVerticalTree(tree.root);
	}
}