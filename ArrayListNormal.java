import java.util.*;
class ArrayListNormal{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			int b=s.nextInt();
			list.add(b);
		}
		e:
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		
		list.set(a-1,100);
	System.out.println("\n"+list.get(a-1));
	
	Iterator i=list.listIterator(1); 
	while(i.hasNext()){
		System.out.print(i.next()+" ");
	}
	System.out.println("\nIs Empty :"+list.isEmpty());
		
	}
}