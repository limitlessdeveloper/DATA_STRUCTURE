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
	Node head1;
	Node head2;
	Node head;
	
	void push1(int data){
		Node node=new Node(data);
		if(head1==null)head1=node;
		else{
			Node current=head1;
			while(current!=null){
				if(current.next==null){
					current.next=node;
					break;
				}
				current=current.next;
			}
		}
	}
	void push2(int data){
		Node node=new Node(data);
		if(head2==null)head2=node;
		else{
			Node current=head2;
			while(current!=null){
				if(current.next==null){
					current.next=node;
					break;
				}
				current=current.next;
			}
		}
	}
	void merg(){
		if(head1==null||head2==null)return;
		else{
			Node c1,c2,temp=null,prev=null;;
			if(head1.data<=head2.data){
				head=head1;
			System.out.println(head);
				 c1=head1;
				 c2=head2;
			}
			else {
				head=head2;
				c1=head2;
				c2=head1;
			}
			while(c1!=null){
				if(c1.data<=c2.data){
					prev=c1;
					c1=c1.next;
				}
				else{
					prev.next=c2;
					prev=c2;
					c2=c2.next;
					temp=c2;
					c2=c1;
					c1=temp;
				}
			}
			if(c1==null){
				prev.next=c2;
			}
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
		list.push1(0);
		list.push1(2);
		list.push1(6);
		list.push1(9);
		list.push2(7);
		list.push2(8);
		list.merg();
		list.display();
	}
}