import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
class BinaryTree{
	Node root;
	
	void createBlock(Node node,int n){
		ArrayList<Node> list=new ArrayList<Node>();
		System.out.println(getPath(node,n,list));
		printPath(list);
	}
	
	
	boolean getPath(Node node,int key,ArrayList<Node> path){
		
		if(node==null)return false;
		if(node.data==key){
			path.add(node);
			return true;
		}
		boolean left_check=getPath(node.left,key,path);
		boolean right_check=getPath(node.right,key,path);
		if(left_check || right_check){
			path.add(node);
			return true;
		}
		return false;
	}
	
	void printPath(ArrayList<Node> list){
		for(int i=0;i<list.size();i++){
			System.out.print(list.get((list.size()-1)-i).data+" ");
		}
	}
	
	
	
	
	
	public static void main(String []args){
		BinaryTree obj=new BinaryTree();
		obj.root=new Node(5);
		obj.root.left=new Node(6);
		obj.root.right=new Node(9);
		obj.root.left.left=new Node(7);
		obj.root.left.right=new Node(3);
		obj.root.right.left=new Node(0);
		obj.createBlock(obj.root,0);
	}
}