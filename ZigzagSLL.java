import java.util.*;
import java.lang.*;

class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	
	void zigzag(){
		int i=1;
		if(head==null){
			return;
		}
		else if(head.next==null){
			return;
		}
		else{
			System.out.println("point here!");
			Node prev=head,current=head.next;
			while(current!=null){
				if(i%2!=0){
					if(current.data>prev.data){
						prev=current;
						current=current.next;
					}
					else{
						int temp=current.data;
						current.data=prev.data;
						prev.data=temp;
						prev=prev.next;
						current=current.next;
					};
				}
				else{
					if(current.data<prev.data){
						prev=current;
						current=current.next;
					}
					else{
						int temp=current.data;
						current.data=prev.data;
						prev.data=temp;
						prev=prev.next;
						current=current.next;
					}
				}
				i++;
			}
			if(current==null)return;
		}
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
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		
		list.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		list.display();
		list.zigzag();
		list.display();
		
	}
}