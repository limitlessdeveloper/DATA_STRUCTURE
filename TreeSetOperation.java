import java.util.*;
class TreeSetOperation{
	public static void main(String args[]){
		TreeSet<String> t=new TreeSet<>();
		TreeSet<Integer> o=new TreeSet<>();
		o.add(56);
		o.add(5);
		o.add(59);
		o.add(58);
		o.add(89);
		o.add(3);
		t.add("aaaaaa");
		t.add("aaaa");								
		t.add("aaaab");
		t.add("aaaaba");
		
		Iterator<String> i=t.iterator();
		while(i.hasNext()){
			System.out.println(i.next());					//the TreeSet will arranged the string according to the lexicopgraphically arrangement.
		}
		System.out.println(t.isEmpty());
		System.out.println("Size : "+t.size());
		Iterator<Integer> itr=o.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());				//Tree set will arranged number according to the increasing order
			}
		System.out.println(o.isEmpty());
		System.out.println("Size : "+o.size());
		
	}
}
