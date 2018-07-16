import java.util.*;
import java.lang.*;

class List{
	String sourc=new String();
	String destin=new String();
	List next;
	List(String sourc,String destin){
		this.sourc=sourc;
		this.destin=destin;
		this.next=null;
	}
}

class LinkedList{
	List head;
	LinkedList(){
			head=null;
	}
	void add(String s,String d){
		if(head==null){
			head=new List(s,d);
		}
		else{
			List current=head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=new List(s,d);
		}
	}
	
	void displayList(){
		 List current=head;
		 while(current!=null){
			 System.out.print(current.sourc+"-"+current.destin+"\n");
			 current=current.next;
		 }
	}
	
}

class Sample{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int []T=new int[t];
		for(int k=0;k<t;k++){
			LinkedList list=new LinkedList();
			T[k]=s.nextInt();
			int y=2*T[k];
			String tic[]=new String[y];
			for(int i=0;i<y;i++){
				tic[i]=s.next();
			}
			int index=0;
			for(int i=0;i<y;i++){
				if(i%2!=0) continue;
				String r=tic[i];
				int count=0;
				for(int j=0;j<y;j++){
					if(r.equals(tic[j])){
						count++;
					}
				}
				if(count==1){
					index=i;
					break;
				}
			}
			int d=T[k];
			int ind=index;
			String f=new String();
			while(d>0){
				f=tic[ind];
				ind=findIndex(tic,f); 
				list.add(tic[ind],tic[ind+1]);
				ind++;
				d--;
				}
			list.displayList();
		}
	}
	static int findIndex(String []s,String st){
		for(int i=0;i<s.length;i++){
			if(st.equals(s[i]))
				return i;
			i++;
		}
		return(-1);
	}
}