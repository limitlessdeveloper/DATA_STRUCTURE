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
	Node root1;
	Node root2;
	void checkingCondition(Node node1,Node node2){
		ArrayList<Node> list1=new ArrayList<Node>();
		ArrayList<Node> list2=new ArrayList<Node>();
		arrayListOfTree1(node1,list1);
		arrayListOfTree1(node2,list2);
		printWheatherTheLeafNodeAreEqual(list1,list2);
		
	}
	
	void arrayListOfTree1(Node node,ArrayList<Node> list){
		if(node==null) return;
		
		if(node.left==null&&node.right==null){
			list.add(node);
		}
		else{
			arrayListOfTree1(node.left,list);
			arrayListOfTree1(node.right,list);
		}
	}
	
	 void printWheatherTheLeafNodeAreEqual(ArrayList<Node> list1,ArrayList<Node> list2){
		if(list1.size()!=list2.size()){
			System.out.println("Not Same");
			return;
		}
		for(int i=1;i<list1.size();i++){
			for(int j=0;j<list1.size();j++){
				int a=list1.get(i).data;
				int b=list1.get(i-1).data;
				if(b>a){
					int temp=a;
					a=b;
					b=temp;
				}
			}
		}
		for(int i=1;i<list2.size();i++){
			for(int j=0;j<list2.size();j++){
				int b=list2.get(i-1).data;
				int a=list2.get(i).data;
				if(b>a){
					int temp=list2.get(i).data;
					list2.get(i).data=list2.get(i-1).data;
					list2.get(i-1).data=temp;
				}
			}
		}
		int cnt=0;
		for(int i=0;i<list1.size();i++){
			if(list1.get(i).data==list2.get(i).data)
				cnt++;
		}
		System.out.println(cnt);
		if(cnt==list1.size()||cnt==list2.size()){
			System.out.println("Yes Same");
		}
	}
	
	public static void main(String []args){
		BinaryTree obj=new BinaryTree();
		obj.root1 =new Node(0);
		obj.root1.left =new Node(1);
		obj.root1.right =new Node(2);
		obj.root1.left.left =new Node(4);
		obj.root1.left.right =new Node(5);
		obj.root1.right.left =new Node(6);
		
		obj.root2 =new Node(0);
		obj.root2.left =new Node(1);
		obj.root2.right =new Node(2);
		obj.root2.left.left =new Node(6);
	//	obj.root2.left.right =new Node(4);
	//	obj.root2.right.left =new Node(5);
		
		obj.checkingCondition(obj.root1,obj.root2);
	}
}