import java.util.*;
import java.lang.*;

class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data=data;
	}
}

class LinkedList{
	Node head;
	void insertAtBegning(int data){
		Node node=new Node(data);
		if(head==null){
			head=node;
			node.next=null;
			node.prev=null;
		}
		else{
			node.next=head;
			head.prev=node;
			node.prev=null;
			head=node;
		}
	}
	
	void reverse(){
		if(head==null)return;
		else if(head.next==null)return;
		else{
			Node current=head;
			while(current.next!=null){
				Node temp=current.next;
				current.next=current.prev;
				current.prev=temp;
				current=temp;
			}
			current.next=current.prev;
			current.prev=null;
			head=current;
		}
	}
	
	void display(){
		Node current=head;
		while(current!=null){
			System.out.print(" "+current.data);
			current=current.next;
		}
	}
	
	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.insertAtBegning(1);
		list.insertAtBegning(2);
		list.insertAtBegning(3);
		list.insertAtBegning(4);
		list.insertAtBegning(5);
		list.insertAtBegning(6);
		list.insertAtBegning(7);
		list.display();
		System.out.println(" ");
		System.out.println( " After Reverse");
		list.reverse();
		list.display();
	}
}