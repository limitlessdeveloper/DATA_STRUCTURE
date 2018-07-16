import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class ReverseListInparticularOrder{
		Node head,head2;
		public ReverseListInparticularOrder(){
			this.head=null;
			this.head2=null;
		}
		void rearrange(Node head){
			if(head==null)return;
			Node slow=head;
			Node fast=slow;
			while(fast!=null&& fast.next!=null){
				slow=slow.next;
				fast=fast.next.next;
				if(fast.next==null){
					head2=slow.next;
					slow.next=null;
				}
			}
			Node cur=head2;
			Node prev = null;
			Node nex=null;
			while(cur!=null){
				nex=cur.next;
				cur.next=prev;
				prev=cur;
				cur=nex;
			}
			Node h1=head;
			while(prev!=null){
				Node s=prev;
				Node h=h1.next;
				h1.next=s;
				prev=prev.next;
				s.next=h;
				h1=s.next;
			}
			display(head);
		}
		void display(Node head){
			if(head==null)return;
			System.out.print(head.data+"  ");
			display(head.next);
		}
		public static void main(String [] args){
			ReverseListInparticularOrder a = new ReverseListInparticularOrder();
			a.head= new Node(1);
			a.head.next= new Node(2);
			a.head.next.next= new Node(3);
			a.head.next.next.next= new Node(4);
			a.head.next.next.next.next= new Node(5);
			a.head.next.next.next.next.next= new Node(6);
			a.head.next.next.next.next.next.next= new Node(7);
			a.head.next.next.next.next.next.next.next= new Node(8);
			a.head.next.next.next.next.next.next.next.next= new Node(9);
			
			a.rearrange(a.head);
			
		}
}