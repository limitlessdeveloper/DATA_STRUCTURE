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
	boolean detectLoop(){
		if(head==null){
			return false;
		}	
		else if(head.next==null){
			return false;
		}
		else{
			Node cf=head;
			Node cb=head.next;
			while(cf!=null && cb!=null && cf.next!=null){
				if(cf.next==cb){
					System.out.println(head+"\n"+cb+"\n"+cf);
					return true;
				}	
				cf=cf.next.next;
				cb=cb.next;
			}
			return false;
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
		list.head=new Node(4);
		Node n2=new Node(5);
		Node n3=new Node(6);
		Node n4=new Node(7);
		Node n5=new Node(8);
		Node n6=new Node(8);
		Node n7=new Node(8);
		list.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n6;
		System.out.println(list.detectLoop());
		//list.head.next.next.next.next.next=list.head.next;
		//list.display();
	}
}