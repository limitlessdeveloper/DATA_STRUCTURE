import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
	}
		this.left=this.right=null;
}
class BinaryTree{
	Node root;
	
	void createBlock(Node node,int n,int m){
		ArrayList<Node> list1=new ArrayList<Node>();
		ArrayList<Node> list2=new ArrayList<Node>();
		int a=0;
		if(getPath(node,n,list1))
			if(getPath(node,m,list2))
				a=printLowestCommonAncestor(list1,list2);
		System.out.println("["+n+","+m+"]="+a);
	}
	
	
	boolean getPath(Node node,int key,ArrayList<Node> path){
		
		if(node==null)return false;
		if(node.data==key){
			path.add(node);
			return true;
		}
		boolean left_check=getPath(node.left,key,path		);
		boolean right_check=getPath(node.right,key,path);
		if(left_check || right_check){
			path.add(node);
			return true;
		}
		return false;
	}
	
	
	int printLowestCommonAncestor(ArrayList<Node> list1,ArrayList<Node> list2){
		
		for(int i=0;i<list1.size();i++){
			for(int j=0;j<list2.size();j++){
				if(list1.get(i).data==list2.get(j).data){
					return (list1.get(i).data); 
				}	
			}
		}
		return 0;
	}
	
	
	
	
	
	public static void main(String []args){
		BinaryTree obj=new BinaryTree();
		obj.root=new Node(5);
		obj.root.left=new Node(6);
		obj.root.right=new Node(9);
		obj.root.left.left=new Node(7);
		obj.root.left.right=new Node(3);
		obj.root.right.left=new Node(0);
		obj.createBlock(obj.root,0,3);
	}
} 