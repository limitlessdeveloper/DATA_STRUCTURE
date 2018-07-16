import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class PrintTree{
	Node root;
	
	int treeHight(Node node){
		if(node==null)return 0;
		else{
			int hl=treeHight(node.left);
			int hr=treeHight(node.right);
			
			if(hl>=hr)return (hl+1);
			else return (hr+1);
		}
	}
	
	void printLevelOrder(Node node , int h){
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=h;i++){
			printTree(node,i,list);
			Collections.sort(list);
			for(int j=0;j<list.size();j++){
				System.out.print(list.get(j)+" ");
			}
			list.clear();
			System.out.println();
			
		}
	}
	
	void printTree(Node node,int h,ArrayList<Integer> list){
		
		if(node==null)return;
		else if(h==1){
			//System.out.print(node.data+" ");
			list.add(node.data);
		}
		else{
			printTree(node.left,h-1,list);
			printTree(node.right,h-1,list);
		}
	}
	
	public static void main(String []args){
		PrintTree ob=new PrintTree();
		ob.root=new Node(7);
		ob.root.left=new Node(5);
		ob.root.right=new Node(6);
		ob.root.left.left=new Node(4);
		ob.root.right.left=new Node(2);
		ob.root.left.right=new Node(3);
		ob.root.right.right=new Node(1);
		int hight=ob.treeHight(ob.root);		
		ob.printLevelOrder(ob.root,hight);
	}
}