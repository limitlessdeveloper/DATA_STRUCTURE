import java.util.*;
import java.lang.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=next;
	}
}
class LinkedList{
	Node head;
	
	void addNode(int data){
		Node node=new Node(data);
		if(head==null){
			head=node;
		}
		else{
			Node current=head;
			while(current!=null){
				if(current.next==null){
					current.next=node;
					break;
				}
				current=current.next;
			}
		}
	}
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
	void display(){
		if(head==null)return;
		else{
			Node current=head;
			while(current!=null){
				System.out.println(current.data);
				current=current.next;
			}
		}	
	}
	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.addNode(77);
		list.addNode(48);
		list.addNode(54);
		list.addNode(45);
		list.addNode(46);
		list.addNode(464);
		list.display();
		list.reversrSLL();
		System.out.println("After Reversing");
		list.display();
	}
}
