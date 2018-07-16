import java.util.*;
import java.lang.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	
	void printRverse(Node head1){
		if(head1==null)return;
		printRverse(head1.next);
		System.out.println(head1.data);
	}
	
	void display(){
		Node current=head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		list.head.next.next.next=new Node(4);
		list.head.next.next.next.next=new Node(5);
		
		list.display();
		System.out.println("After Reversing");
		list.printRverse(list.head);
	}
}