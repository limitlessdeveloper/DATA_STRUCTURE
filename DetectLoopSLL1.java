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
	int detectLoop(){
	 Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");
                return 1;
            }
        }
        return 0;
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
		list.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n2;
		//list.head.next.next.next.next.next=list.head.next;
		System.out.println(list.detectLoop());
		//list.display();
	}
}