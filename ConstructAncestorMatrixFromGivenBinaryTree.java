import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class ConstructAncestorMatrixFromGivenBinaryTree{
	Node root;
	int cntt;
	int arrm[][]=new int[100][100];
	
	int numberOfElement(Node node){
		 if(node==null) return 0;
		 else{
				cntt++;
				numberOfElement(node.left);
				numberOfElement(node.right);
				return cntt;
		 }
	}
	
	
	void constructionOfMatrix(Node node){
		ArrayList<Node> arr=new ArrayList<Node>();
		matrixFilling(node,0,arr);
	}
	
	
	void matrixFilling(Node node,int cnt,ArrayList<Node> list){
		if(node==null) return;
		list.add(node);
		cnt++;
		if(node.left==null && node.right==null){
			fillingTheMatrix(list);
			list.remove(list.size()-1);
		}
		else{
			matrixFilling(node.left,cnt,list);
			while(cnt!=list.size()){
					list.remove(list.size()-1);
			}
			matrixFilling(node.right,cnt,list);
		}
	}
	
	
	void fillingTheMatrix(ArrayList<Node> list){
		for(int i=0;i<list.size();i++){
		
			Node current=list.get(i);
			
			for(int j=i+1;j<list.size();j++){
					Node current2=list.get(j);
					arrm[current.data][current2.data]=1;			
			}
		}
		
	}
		
	void printAncestorMatrix(int n){
				for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
							System.out.print(arrm[i][j]+" ");
					}
					System.out.println();
				}
	}
		
	
	public static void main(String []args){
		ConstructAncestorMatrixFromGivenBinaryTree obj=new ConstructAncestorMatrixFromGivenBinaryTree();
		obj.root=new Node(0);
		obj.root.left=new Node(1);
		obj.root.right=new Node(2);
		obj.root.right.left=new Node(5);
		obj.root.left.left=new Node(3);
		obj.root.left.right=new Node(4);
		obj.root.left.right.left=new Node(6);
		int n=obj.numberOfElement(obj.root);
		obj.constructionOfMatrix(obj.root);
		obj.printAncestorMatrix(n);
	}
}








// int numberOfElement(Node node){
		// if(node==null) return 0;
		// else{
			// cnt++;
			// numberOfElement(node.left);
			// numberOfElement(node.right);
			// return cnt;
		// }
	// }
	
	  // int[][] ancestorMatrix(int n,Node node){	
			// int mat[][]=new int[n][n];
			// for(int i=0;i<n-1;i++){
				// for(int j=0;j<n-1;j++){
					// mat[i][j]=0;
				// }
			// }
			// if(node==null)return mat[][];
			// else{
				// Node current=node;
				
			// }
		 // }
	//i love you rekhit