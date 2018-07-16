import java.util.*;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node headf;
	Node heads;
	Node rs;
	Node add(Node head1,Node head2){
		 if(head1==null && head2==null )
			 return rs;
		 else if(head1==null) return head2;
		 else if(head2==null) return head1;
		 else{

			 Node current1=head1;
			 Node current2=head2;
			 Node rs=null;
			 int carry=0;
					while(current1!=null && current2!=null){
					int sum=current1.data+current2.data+carry;
					if(rs==null)rs=new Node(sum%10);																							
					else{
						Node rst=rs;
						while(rst.next!=null)rst=rst.next;
						rst.next=new Node(sum%10);
						//System.out.println("point here "+rst.next.data);
					}
					carry=sum/10;
					current1=current1.next;
					current2=current2.next;
				}
				if(current1!=null){
					while(current1!=null){
						int sum=current1.data+carry;
						if(rs==null)rs=new Node(sum%10);
						else{
							Node rst=rs;
							while(rst.next!=null)rst=rst.next;
							rst.next=new Node(sum%10);
						}
						carry=sum/10;
						current1=current1.next;
					}
				}
				if(current2!=null){
					while(current2!=null){
						int sum=current2.data+carry;
						if(rs==null)rs=new Node(sum%10);
						else{
							Node rst=rs;
							while(rst.next!=null)rst=rst.next;
							rst.next=new Node(sum%10);
						}
						carry=sum/10;
						current2=current2.next;
					}
				}
				if(current1==null && current2==null){
					if(carry==1){
						if(rs==null)rs=new Node(1);
						else{
							Node rst=rs;
							while(rst.next!=null)rst=rst.next;
							rst.next=new Node(1);
						}
					}
				}
				
				return(rs);	
		 }
		 
	}
	
	static void display(Node current){
		while (current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
		//if(current==null)System.out.println("Yes");
	}
	
	public static void main(String []args){
		LinkedList obj=new LinkedList();
		obj.headf=new Node(9);	
		obj.headf.next=new Node(9);
		obj.headf.next.next=new Node(9);
		obj.heads=new Node(9);	
		obj.heads.next=new Node(9);
		obj.heads.next.next=new Node(9);
		Node rsw=obj.add(obj.headf,obj.heads);
		obj.display(obj.headf);
		System.out.println();
		obj.display(obj.heads);	
		System.out.println();
		obj.display(rsw);
	}			
}