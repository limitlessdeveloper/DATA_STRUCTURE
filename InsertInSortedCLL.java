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
	Node last;
	
	void insert(int value){
		Node node=new Node(value);
		if(last==null){
			last=node;
			node.next=last;
		}
		else {
			Node current=last;
			if(value>last.data){
				node.next=last.next;
				last.next=node;
				last=node;
			}
			else{
				while(current.next.data<value)current=current.next;
				node.next=current.next;
				current.next=node;
			}	
		}
	}
	void display(){
		Node current=last.next;
		System.out.println(current.data);
		while(current!=last){
			current=current.next;
			System.out.println(current.data);
		}
	}
	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.insert(1);
		list.insert(4);
		list.insert(9);
		list.insert(8);
		list.insert(7);
		list.display();
	}
}