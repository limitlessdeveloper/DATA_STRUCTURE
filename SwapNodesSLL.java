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
	void addNewNode(int data){
		NewNode node=new NewNode(data);
		if(head==null){
			head=node;
		}
		else{
			NewNode current=head;
			while(current!=null){
				if(current.next==null){
					current.next=node;
					break;
				}
				current=current.next;
			}
		}
	}
	void swap(int x,int y){
		if(head==null){
			return;
		}
		else if(head.next==null){
			return;
		}
		else{
			NewNode pre1=null;
			NewNode head1=head;
			NewNode pre2=null;
			NewNode head2=head;
			NewNode temp;
			while(head1!=null && head1.data!=x){
				pre1=head1;
				head1=head1.next;
			}
			if(head1==null){
				return;
			}
			while(head2!=null && head2.data!=y){
				pre2=head2;
				head2=head2.next;
			}
			if(head2==null){
				return;
			}
			if(pre1!=null){
				pre1.next=head2;
			}
			else{	
			head=head2;
			}
			if(pre2!=null){
				pre2.next=head1;
			}
			else{
				head=head1;
			}
			temp=head1.next;
			head1.next=head2.next;
			head2.next=temp;
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
		list.addNewNode(1);
		list.addNewNode(56);
		list.addNewNode(13);
		list.addNewNode(19);
		list.addNewNode(18);
		list.addNewNode(89);
		list.addNewNode(546);
		list.display();
		list.swap(1,18);
		list.swap(18,546);
		System.out.println("After Swaping");
		list.display();
	}
}