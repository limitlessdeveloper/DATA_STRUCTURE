import java.util.*;
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
	
	int numberOfChild(Node node,int key){
			if(node==null)return -1;
			else{
				Node current=node;
				while(current!=null){
					if(current.data==key){
						if(current.left!=null && current.right!=null)return 2;
						if(current.left==null && current.right==null)return 0;
						else return 1;
					}
					if(current.data>key)current=current.left;
					else current=current.right;
				}
				return -1;
			}
	}
	void deleteNode(Node node,int key,int delcase){
		if(delcase==0){
			if(node==null)return;
			else if(node.data==key)root=null;
			else{
				Node current=node;
				while(current!=null){
					if(current.data<key){
						if(current.right.data==key){
							current.right=null;
							break;
						}
						current=current.right;
					}
					else{
						if(current.left.data==key){
							current.left=null;
							break;
						}
						current=current.left;
					}
				}
			}
		}
		
		if(delcase==1){
			if(node==null)return;
			else if(node.data==key){
				if(node.left!=null){
					Node temp=root.left;
					root.left=null;
					root=temp;
				}
				else{
					Node temp=root.right;
					root.right=null;
					root=temp;
				}
			}
			else{
				Node current=node;
				while(current!=null){
						if(current.data>key){
							if(current.left.data==key){
								if(current.left.left!=null){
									Node temp=current.left.left;
									current.left=null;
									current.left=temp;
									break;
								}
								else{
									if(current.left.right!=null){
										Node temp=current.left.right;
										current.left=null;
										current.left=temp;
										break;		
									}
								}
							}
							else current=current.left;
						}
						else{
							if(current.right.data==key){
								if(current.right.left!=null){
									Node temp=current.right.left;
									current.right=null;
									current.right=temp;
									break;
								}
								else{
									Node temp=current.right.right;
									current.right=null;
									current.right=temp;
									break;
								}
							}
							else current=current.right;
						}
				}
			}
		}
			
		if(delcase==2){						
			ArrayList<Integer> list=new ArrayList<Integer>();
			inorderArray(node,list);
			if(node==null)return;
			else if(node.data==key){
				for(int i=0;i<list.size();i++){
					if(node.data==list.get(i)){
						int temp=list.get(i+1);
						int delnodecase=numberOfChild(node,list.get(i+1));
						deleteNode(node,list.get(i+1),delnodecase);
						node.data=temp;
						break;
					}
				}
			}
			else{
				Node current=node;
				while(current!=null){
					if(current.data==key){
							for(int i=0;i<list.size();i++){
								if(node.data==list.get(i)){
									int temp=list.get(i+1);
									int delnodecase=numberOfChild(node,list.get(i+1));
									deleteNode(node,list.get(i+1),delnodecase);
									node.data=temp;
									break;
								}
							}
					}
					else if(current.data<key)current=current.right;
					else current=current.left;
				}
			}
		}
	}
	
	void inorderArray(Node node ,ArrayList<Integer> list){
		if(node==null)return;
		else{
			inorderArray(node.left,list);
			list.add(node.data);
			inorderArray(node.right,list);
		}
	} 
		
	void printTree(Node node){
		if(node==null)return;
		else{
			printTree(node.left);
			System.out.print(node.data+" ");
			printTree(node.right);
		}
	}
	
	public static void main(String []args){
		Tree ob=new Tree();
		ob.root=new Node(50);
		ob.root.left=new Node(30);
		ob.root.right=new Node(70);
		ob.root.left.left=new Node(20);
		ob.root.left.left.left=new Node(10);
		ob.root.left.right=new Node(40);
		ob.root.right.left=new Node(60);
		ob.root.right.right=new Node(80);
		ob.root.right.right.right=new Node(90);		
		ob.printTree(ob.root);
		int m=50;
		int deletecase=ob.numberOfChild(ob.root,m);
		ob.deleteNode(ob.root,m,deletecase);
		System.out.println();
		ob.printTree(ob.root);
		}
}
