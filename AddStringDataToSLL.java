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
	 void addNodeAtEnd(int value,NewNode head1 )
	{	
		
		if(head1==null)
		{
			head1=new NewNode(value); 
			return;
		}
		else
		{addNodeAtEnd(value,head1.next);
			return;
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
	int length(NewNode head)
	{
		if(head==null)return 0;
		else
		{
			return (1+length(head.next));
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
		System.out.println("3.size");
		System.out.println("4.exit");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choise");
		n=s.nextInt();
		
			switch(n)
			{
				case 1:
				{
				System.out.println("enter the value of String");
				int value=s.nextInt();
				list.addNodeAtEnd(value,list.head);
				break;
				}
				case 2:
				{
					list.display(list.head);
					break;
				}
				case 3:
				{
					System.out.println(list.length(list.head));
				}
				default:
				//System.out.println("Ente right choise");
			}
		}while(n!=4);
	}
}