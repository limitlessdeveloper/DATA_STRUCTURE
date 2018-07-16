import java.util.*;
class InstanceOfMethod{
	public static void main(String args[]){
			ArrayList<Integer> list=new ArrayList<>();
				list.add(5);
				list.add(12);
				list.add(52);
				list.add(53);
				list.add(56);
				list.add(59);
				list.add(578);
				list.add(58);
				list.add(5998);
				Iterator i=list.listIterator();
				Iterator y=list.iterator();
				while(y.hasNext()){
					System.out.print(y.next()+" ");
				}
				System.out.println("\n"+(list instanceof ArrayList));
				System.out.println(i instanceof Iterator);
				System.out.println(y instanceof ListIterator);
				System.out.println(i instanceof ListIterator);
				System.out.println(y instanceof Iterator);
		}
}