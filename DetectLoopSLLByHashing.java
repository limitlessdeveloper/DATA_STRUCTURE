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
	HashMap<Integer,Node> temp=new HashMap<Integer,Node>();
	
	boolean detect(Node head1){
		if(head1==null)return false;
		else if(head1.next==null)return false;
		else{
				Node current=head;
				while(current.next!=null){
					if(temp.find(current)==temp.end()){
						return true;
					}
					current=current.next;
				}
			return false;	
			}
		}			
	
			
			public static void main(String args[]){
				int i=0;
				LinkedList list=new LinkedList();
				list.head=new Node(1);
				Node node1=new Node(2);
				Node node2=new Node(4);
				Node node3=new Node(5);
				Node node4=new Node(6);
				list.head=node1;
				node1.next=node2;
				node2.next=node3;
				node3.next=node4;
				node4.next=node2;
				list.temp.put(1,head);
				list.temp.put(2,n2);
				list.temp.put(2,n3);
				list.temp.put(2,n4);
				list.temp.put(2,n5);
				System.out.println(list.detect(list.head));
			}
}