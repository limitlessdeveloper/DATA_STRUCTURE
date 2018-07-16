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
	LinkedList(){
		this.head=null;
	}
	
	void push(int value){
		NewNode node=new NewNode(value);
		if(head==null){
			head=node;
		}
		else{
			NewNode current=head;
			while(current!=null){
				if(current.next==null){
					current.next=node;
					return;
				}
				current=current.next;	
			}
			
		}
	}
	
	void delete(int pos){
		if(head==null){
			return;
		}
		else if(pos==0){
			head=head.next;
		}
		else{
			NewNode head1=head;
			NewNode head2=head.next;
			for(int i=0;i<pos-1;pos--){
				head1=head2;
				head2=head2.next;
				System.out.println("point here");
			}
			head1.next=head2.next;
		}
	}
	
	void display(){
		NewNode current=head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public static void main(String []args){
		LinkedList list=new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		
		list.delete(1);
		list.delete(1);
		list.delete(1);
		list.delete(1);
		list.display();
	}
		
}