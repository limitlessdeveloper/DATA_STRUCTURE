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
	void insertAtEnd(int data){
		Node node=new Node(data);
		if(head==null){
			head=node;
			node.next=null;
			node.prev=null;
		}
		else{
			Node current=head;
			while(current!=null){
				if(current.next==null){
					current.next=node;
					node.prev=current;
					node.next=null;
					break;
				}
				current=current.next;
			}
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
		list.insertAtBegning(4);
		list.insertAtBegning(5);
		list.insertAtBegning(9);
		list.insertAtBegning(44);
		list.insertAtBegning(45);
		list.insertAtBegning(46);
		list.insertAtEnd(15);
		list.insertAtEnd(445);
		list.insertAtEnd(99);
		list.insertAtEnd(89);
		list.display();
	}
}