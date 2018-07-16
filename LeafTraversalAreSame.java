import java.util.*;

class Node{
	int data;
	Node left,right;
	Node (int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class Tree{
	Node root;
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
	
	void treesInStack(Node node,Stack<Integer> s){
		if(node==null) return;
		if(node.left==null && node.right==null){
			s.push(node.data);
			return;
		}
		
		if(node.left!=null) treesInStack(node.left,s);
		if(node.right!=null) treesInStack(node.right,s);
	}
	
	void treeMatch(Stack<Integer> s1,Stack<Integer> s2){
		int m1;
		int m2;
		while(s1.size()>0 && s2.size()>0){
			 m1=s1.pop();
			 m2=s2.pop();
			 System.out.println(m1);
			 System.out.println(m2);
			if(m1!=m2){
				System.out.println("not same");
				return;
			}
		}
		if(s1.size()!=0 || s2.size()!=0){
				System.out.println("not same 2");
				return;
		}
		System.out.println("same");
	}
	
	
	public static void main(String[] args)
    {

        Tree tree1=new Tree();
        Tree tree2=new Tree();
		tree1.root=new Node(1);
		tree1.root.left=new Node(2);
		tree1.root.right=new Node(3);
		tree1.root.right.right=new Node(6);
		tree1.root.left.left=new Node(4);
		tree1.root.left.right=new Node(5);
		tree2.root=new Node(1);
		tree2.root.left=new Node(2);
		tree2.root.left.left=new Node(4);
		tree2.root.right=new Node(3);
		tree2.root.right.right=new Node(6);
		tree2.root.right.left=new Node(5);
		 
		 tree1.treesInStack(tree1.root,tree1.s1);
		 tree1.treesInStack(tree2.root,tree2.s2);
		 tree1.treeMatch(tree1.s1,tree2.s2);
    }
	
}
