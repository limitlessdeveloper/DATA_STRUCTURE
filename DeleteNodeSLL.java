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
	
	 void addNodeAtEnd(int data){
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
	
	void deleteNode(int delete){
		if(head==null){
			System.out.println("Empty LinkedList");
			return;
		}
		else if(head.data==delete){
			head=head.next;
			return;
		}
		else{
			NewNode head1=head;
			NewNode head2=head.next;
			while(head2!=null && head2.data!=delete){
			
				head1=head2;
				head2=head2.next;
			}
			if(head2==null)return;
				head1.next=head2.next;
				return;
		}
	}
	
	// void display()
	// {
		// if(head==null)
		// {
			// System.out.println("Empty LinkedList");
		// }
		// else
		// {
			// NewNode current=head;
			// while(current!=null)
			// {	
				// System.out.println(current.data);
				// current=current.next;
			// }
			// if(current==null)
			// {
			// }
		// }
	// }
	 void addNodeAtEndByRecursion(int value,NewNode head2){	
		NewNode head1=head2;
		if(head1==null)
		{
			head=new NewNode(value); 
	//		System.out.println(head);
			return;
		}
		 if(head1.next==null){
			head1.next=new NewNode(value);
			return;
		}
		else{
			addNodeAtEndByRecursion(value,head1.next);
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
		int n;
		do{
			System.out.println("\n1.Adding Node\n2.By Recursion\n3.Deleting Node\n4.display LinkedList\n5.exit");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your choise");
			n=s.nextInt();
			
			switch(n){
				
				case 1:
				System.out.println("Enter the value");
				int data=s.nextInt();
				list.addNodeAtEnd(data);
				break;
				
				case 2:
				System.out.println("Enter the value");
				int data1=s.nextInt();
				list.addNodeAtEndByRecursion(data1,list.head);
				break;
				
				case 3:
				System.out.println("Enter the value of node to delete");
				int delete=s.nextInt();
				list.deleteNode(delete);
				break;
				
				case 4:
				list.display();
				break;
				
				default:
			}
		}while(n!=5);
	}
}	