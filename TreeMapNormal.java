import java.util.*;
class TreeMapNormal{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		TreeMap<String,Integer> map=new TreeMap<>();
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			String s1=s.next();
			int b=s.nextInt();
			map.put(s1,b);
		}
		
		System.out.println("By entrySet()");
		Set set=map.entrySet();
		System.out.println(set);
		
		System.out.println("By getting Key And than Value");
		 System.out.println("Size :"+map.size());
		 for(String k:map.keySet()){
			 System.out.println(map.get(k));
		 }
		 
		 
	}
}