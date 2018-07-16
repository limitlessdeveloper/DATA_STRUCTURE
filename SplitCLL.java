import java.util.*;
import java.lang.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

class LinkedList{
	Node head,head2;
	
	void split(){
		int i=0;
		if(head==null){
			return;
		}
		else if(head.next==head)return;
		else{
			Node current=head,temp=head;
			while(current.next!=head){
				current=current.next;
				i++;
			}
			for(int j=0;j<(i+1)/2-1;j++){
				temp=temp.next;
			}
			head2=temp.next;
			temp.next=head;
			current.next=head2;
		}
	}
	
	void display(){
		Node temp=head;
		System.out.print(temp.data+" ");
		while(temp.next!=head){
			temp=temp.next;
			System.out.print(temp.data+" ");
		}
		System.out.println();
	}
	void display2(){
		Node temp=head2;
		System.out.print(temp.data+" ");
		while(temp.next!=head2){
			temp=temp.next;
			System.out.print(temp.data+" ");
		}
		System.out.println();
	}
	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.head=new Node(2);
		list.head.next=new Node(5);
		list.head.next.next=new Node(9);
		list.head.next.next.next=new Node(7);
		list.head.next.next.next.next=new Node(17);
		list.head.next.next.next.next.next=new Node(48);
		list.head.next.next.next.next.next.next=new Node(37);
		list.head.next.next.next.next.next.next.next=new Node(137);
		list.head.next.next.next.next.next.next.next.next=list.head;
		list.display();
		list.split();
		System.out.println("After Spliting :1");
		list.display();
		System.out.println("After Spliting :2");
		list.display2();
	}	
}