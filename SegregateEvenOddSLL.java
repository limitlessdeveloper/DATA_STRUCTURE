import java.util.*;
import java.lang.*;

class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	void segregateSLL(){
		if(head==null || head.next==null || head.next.next==null)return;
		else{
			Node prev1=head,current=head.next,prev2=head,temp1=null,temp2=null;
			while(current!=null){
				if(prev1.data%2!=0){
					if(current.data%2!=0){
						prev2=current;
						current=current.next;
					}
					else{
						while(current!=null && current.data%2==0){
							//System.out.println(current);
							prev2=current;
							current=current.next;
							if(current!=null && current.data%2!=0){
								prev2.next=current.next;
								temp1=prev1.next;
								prev1.next=current;
								current.next=temp1;
								prev1=current;
								current=prev2;
							}
							if(current==null)return;
						}
						if(current==null)return;
						
					}
				}
				else{
					if(current.data%2==0){
						prev2=current;
						current=current.next;
						System.out.println("!");
					}
					else{
						while(current!=null && current.data%2!=0){
							prev2=current;
							current=current.next;
							if(current!=null && current.data%2==0 ){
								prev2.next=current.next;
								temp1=prev1.next;
								prev1.next=current;
								current.next=temp1;
								prev1=current;
								current=prev2;
				System.out.println(prev1.data);
				System.out.println(prev2.data);
				System.out.println(current.data);
							}
							if (current==null)return;
						}
						if(current==null){
							return;
						}	
					}
				}
			}
			
			if(current==null)return;
		}
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
		list.head=new Node(1);
		list.head.next=new Node(4);
		list.head.next.next=new Node(5);
		list.head.next.next.next=new Node(10);
		list.head.next.next.next.next=new Node(12);
		list.head.next.next.next.next.next=new Node(8);
		list.head.next.next.next.next.next.next=new Node(15);
		list.head.next.next.next.next.next.next.next=new Node(17);
		//17->15->8->12->10->5->4->1->7->6->
		list.display();
		list.segregateSLL();
		System.out.println("Segreated LinkedList");
		list.display();
	}
}
