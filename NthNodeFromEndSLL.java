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
	int length;
	void push(int data){
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
	
	int lengthSLL(Node head1){
		if(head1==null){
			return 0;
		}
		else return(1+lengthSLL(head1.next));
	}
	
	void printNthFromLast(int n){
		if(head==null){
			return;
		}
		else{
			Node current=head;
			n=length-n+1;
			while(n>1){
				current=current.next;
				n--;
			}
			System.out.println(current.data);
		}
	}
	
	void display(){
		Node current=head;
		if(current==null)return;
		else{
			while(current!=null){
				System.out.println(current.data);
				current=current.next;
			}
		}
	} 


	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.push(1);
		list.push(7);
		list.push(6);
		list.push(8);
		list.push(5);
		list.push(4);
		list.length=list.lengthSLL(list.head);
		System.out.println("Total no. of Nodes : "+list.length);
		list.display();
		System.out.println("printing nth from last");
		list.printNthFromLast(6);
	}
}
