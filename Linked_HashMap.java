import java.util.*;
class Sample{
	public static void main(String args[]){
		LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
		lhm.put("c","rekhit");
		lhm.put("a","krishna");
		lhm.put("b","sarabjeet");
		for(String a:lhm.keySet()){
			System.out.println(a+" "+lhm.get(a));
		}
		for(Map.Entry<String,String> map:lhm.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());	
		}
		System.out.println(lhm);
		
	}
}