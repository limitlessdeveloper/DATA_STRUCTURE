class LinkedList
{	
	NewNode head;
	
	static class NewNode
	{
		private int data;
		private NewNode next;	
	
		public NewNode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}
	
		void display()
		{
			NewNode current=head;
			while(current!=null)
			{
			System.out.println(current.data);
			current=current.next;
			}
		}
		
		public static void main(String []args)
	{
			
		LinkedList list=new LinkedList();
		//list.head=null;
		list.display();
	}
}
