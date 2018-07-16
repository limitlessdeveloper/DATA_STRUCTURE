import java.util.*;
import java.lang.*;

class NewNode{
	int data;
	NewNode next;
	NewNode(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	NewNode head;
	
	void addNewNodeAtend(int value){
		NewNode node=new NewNode(value);
		if(head==null){
			head=node;
			System.out.println("noded added");
		}
		else{
			NewNode current=head;
			while(current!=null){
				if(current.next==null){
				current.next=node;
				System.out.println("noded added");
				break;
				}
				current=current.next;
			}
		} 
	}
	boolean searchElement(int element,NewNode head1){
		if(head1==null)return false;
		if(head1.data==element){
			System.out.println("Yes");
			return true;
			}
		return searchElement(element,head1.next);
	}
	
	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.addNewNodeAtend(1);
		list.addNewNodeAtend(2);
		list.addNewNodeAtend(3);
		list.addNewNodeAtend(4);
		list.addNewNodeAtend(5);
		list.addNewNodeAtend(6);
		System.out.println(list.head);
		boolean t0=list.searchElement(1,list.head);
		boolean t1=	list.searchElement(7,list.head);
		boolean t2=list.searchElement(9,list.head);
		boolean t3=list.searchElement(6,list.head);
		System.out.println(t0+" "+t1+" "+t2+" "+t3);
	}
}