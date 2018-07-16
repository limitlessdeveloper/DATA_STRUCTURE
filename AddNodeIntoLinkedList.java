import java.util.*;
import java.lang.*;

class LinkedList
{	LinkedList(){
		this.head=null;
	}
	
	
	 class NewNode
	{
		private int data;
		private NewNode next;
		
		public NewNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	 NewNode head;
	 void addNodeAtEnd(int value ,LinkedList list)
	{	
		NewNode node= new NewNode(value);
		if(head==null)
		{
			head=node; 
		}
		else
		{
			
			NewNode current=head;
			while(current!=null)
			{
				if(current.next==null)
				{
				current.next=node;
				break;
				}
				current=current.next;
				System.out.println("point here");		
			}
			
		System.out.println("display head: "+head.data);
		System.out.println("display current: "+current.data);
		System.out.println("display current.next: "+current.next.data);
		System.out.println("display head.next: "+head.next.data);
		System.out.println("display head: "+head.data);
		}
	}
	void display(NewNode head1)
	{
		if(head1==null)
		{
			System.out.println("Empty LinkedList");
		}
		else
		{
			NewNode current=head1;
			while(current!=null)
			{	
				System.out.println(current.data);
				current=current.next;
			}
			if(current==null)
			{
			}
		}
	}
	public static void main(String []args)
	{
		LinkedList list=new LinkedList();
		int n;
		do
		{
		System.out.println("\n1.Adding Node");
		System.out.println("2.display LinkedList");
		System.out.println("3.exit");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choise");
		n=s.nextInt();
		
			switch(n)
			{
				case 1:
				{
				System.out.println("enter the value");
				int value=s.nextInt();
				list.addNodeAtEnd(value,list);
				break;
				}
				case 2:
				{
					list.display(list.head);
					break;
				}
				default:
				//System.out.println("Ente right choise");
			}
		}while(n!=3);
	}
}