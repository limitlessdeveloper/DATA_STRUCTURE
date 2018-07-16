import java.lang.*;
import java.util.*;
class node{
    node next;
    int data;
    public node(int data){
        this.data=data;
        this.next=null;
    }
}
 class ReverseLinkedList {
    node head;
    public ReverseLinkedList(){
        this.head=null;
    }
    void display( node head){
        node c=head;
        while(c!=null){
            System.out.print(" "+c.data);
            c=c.next;
        }
    }
    void reverseList(){
        node c=head;
        node p=null;
        node nex=null;
        while(c!=null){
           nex=c.next;
            c.next=p;
            p=c;
            c=nex; 
        }
        display(p);
    }
	void reverseListTimes(int num){
		node c=head;
		node p=null;
		node nex=null;
		int c1=0;
		while(c1!=num){
			c1++;
			nex=c.next;
			c.next=p;
			p=c;
			c=nex;
		}
		
		display(p);
		display(c);
		
	}
    void reverseListRecur(node c,node prev){
       // node c=head;
        if(c.next==null){
           head=c;
           c.next=prev;
           display(null);
           return;
        }
        node next =c.next;
        c.next=prev;
        reverseListRecur(next, prev);
        display(head);
    }
    public static void main(String [] args){
            ReverseLinkedList rl=new ReverseLinkedList();
            rl.head=new node(1);
            rl.head.next=new node(2);
            rl.head.next.next=new node(3);
            rl.head.next.next.next=new node(4);
            rl.head.next.next.next.next=new node(5);
            rl.display(rl.head);
            System.out.println();
            System.out.println();
            System.out.println();
		//	rl.reverseList();
            System.out.println();
       //     rl.reverseListRecur(rl.head,null);
            System.out.println();
			int n=3;
			rl.reverseListTimes(n);
			
    }
}
