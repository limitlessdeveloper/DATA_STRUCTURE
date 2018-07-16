import java.util.*;
import java.lang.*;

class Node{
	int data;
	Node next;
	Node arbitrary;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
} 

class LinkedList{
	Node head;
		
	void cloneLL(){
		Node node; 
		if(head==null)return;
		else if(head.next==null){
			node=new Node(head.data);
			head.next=node;
			node.arbitrary=head;
			node.next=null;
		}
		else{
			Node node;
			Node current=head,current1=head,current2=head;
			while(current.arbitrary!=2){
				Node temp=current.next;	
			}
		}
	}
}