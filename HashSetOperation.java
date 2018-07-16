import java.util.*;
class HashSetOperation{
	public static void main(String args[]){
		HashSet<Integer> h=new HashSet<>();
		h.add(5);
		h.add(15);
		h.add(55);
		h.add(595);
		h.add(595);
		h.add(85);
		
		Iterator<Integer> i=h.iterator();
		while(i.hasNext()){
			System.out.println(i.next());				// TreeSet will not print the Number in order
				}
	}
}