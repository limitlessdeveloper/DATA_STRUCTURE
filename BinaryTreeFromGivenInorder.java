import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class FormBinaryTree{
	Node root;
	
	int maxElementIndex(int[] arr){
		int max=0,in=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				in=i;
				max=arr[i];
			}
		}
		return in;
	}
	
	Node buildBinary(Node node,int[] a){
		if(a.length==0)return node;
		int x=maxElementIndex(a);
		node=new Node(a[x]);
    	System.out.println("point here "+node.data+" 2 ");
		int arl[]=new int[x];
		for(int i=0;i<x;i++){
			arl[i]=a[i];
		}
		node.left=buildBinary(node.left,arl);
		int arr[]=new int[a.length-(x+1)];
		int h=x+1;
		for(int i=0;i<a.length-(x+1);i++){
			arr[i]=a[h];
			h++;
		}
		node.right=buildBinary(node.right,arr);
		return node;
	}
	
	
	
	void printInorder(Node node){
		if(node==null)return;
		else{
			//System.out.println(root.data);
			System.out.print(node.data+" ");
			printInorder(node.left);
			printInorder(node.right);
		}
	}
	
	
	
	public static void main(String []args){
		FormBinaryTree obj=new FormBinaryTree();
		int arr[]={5,10,40,30,15,28,20};
		obj.root=obj.buildBinary(obj.root,arr);
		obj.printInorder(obj.root);
	}
}