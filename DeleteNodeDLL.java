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
	
	
	void deleteNodeB(){
		if(head==null)return;
		else{
			Node current=head;
			head=head.next;
			head.prev=null;
			current.next=null;
		}
	}
	void deleteNodeE(){
		if(head==null)return;
		else{
			Node current=head;
			while(current.next!=null){
				current=current.next;
				}
				Node temp=current.prev;
				temp.next=null;
				current.prev=null;
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
		list.insertAtEnd(12);
		list.insertAtEnd(45);
		list.insertAtEnd(9);
		list.insertAtEnd(46);
		list.insertAtEnd(97);
		list.insertAtEnd(47);
		list.insertAtEnd(67);
		list.insertAtEnd(17);
		list.display();
		System.out.println();
		list.deleteNodeB();
		list.display();
		System.out.println();
		list.deleteNodeB();
		list.display();
		System.out.println();
		list.deleteNodeB();
		list.display();
		System.out.println();
		list.deleteNodeE();
		list.deleteNodeE();
		list.display();
		
	}
}