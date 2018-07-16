import java.util.*;
import java.lang.*;

class Node {
	int data;
	Node next;
	Node (int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	void reversrSLL(){
		if(head==null){
			return;
		}
		else if(head.next==null){
			return;
		}
		else{
			Node temp=head;
			Node prev=head;
			Node current=head.next;
			while(current!=null){
					temp=current.next;
					current.next=prev;
					prev=current;
					current=temp;	
			}
			if(current==null){
				head.next=null;
				head=prev;
			}	
		}
	}
	
	void add1(Node current){
		//Node current=head;
		//	System.out.println("point here !");
		//while(current!=null){
			if((current.data+1)!=10){
				current.data=current.data+1;
				return;
			}
			else if(current.next==null && (current.data+1)==10){
				current.data=0;
				current.next=new Node(1);
				return;
			}
			else{
				current.data=0;
				//current=current.next;
				add1(current.next);
			}
		}
	
	
	void display(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data);
			current=current.next;
		}
	}
	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		Node n2=new Node(9);
		 Node n3=new Node(9);
		 Node n4=new Node(9);
		 Node n5=new Node(8);
		 Node n6=new Node(7);
		
		list.head.next=n2;
		 n2.next=n3;
		 n4.next=n5;
		 n3.next=n4;
		 n5.next=n6;
		
		list.display();
		list.reversrSLL();
		list.add1(list.head);
		System.out.println("\nafter add1");
		list.reversrSLL();
		list.display();
		
	}
}