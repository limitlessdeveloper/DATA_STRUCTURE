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
	Node head;
	
	void push(int data){
		Node node=new Node(data);
		if(head==null){
			head=node;
			node.next=head;
		}
		else{
			Node current=head.next;
			while(current.next!=head){
					current=current.next;
				}
				current.next=node;
				node.next=head;
			}
		}
		
		void display(){
			Node current=head;
			System.out.println(current.data);
			while(current.next!=head){
				current=current.next;
				System.out.println(current.data);
			}
		}
		
		public static void main(String []args){
			LinkedList list=new LinkedList();
			list.push(1);
			list.push(5);
			list.push(6);
			list.push(9);
			list.push(4);
			list.push(7);
			
			list.display();
		}
	}
