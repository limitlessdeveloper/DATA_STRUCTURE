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
	
	void push(int data){
		Node node=new Node(data);
		if(last==null){
			last=node;
			node.next=last;
		}
		else{
			node.next=last.next;
			last.next=node;
		}
	}
	
	void display(){
		Node current=last.next;
		System.out.println(current.data);
		while(current!=last){
			current=current.next;
			System.out.println(current.data);
		}
		System.out.println(current.next.data);
	}
    
	public static void main(String []args){
		LinkedList lsit=new LinkedList();
		lsit.push(1);
		lsit.push(2);
		lsit.push(5);
		lsit.push(6);
		lsit.push(9);
		lsit.display();
	}
}