import java.util.*;
class BasicHash{
	
	static void printFreq(int []arr){
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			Integer a=hmap.get(arr[i]);
			if(a==null){
				hmap.put(arr[i],1);
		    }
			else{
				hmap.put(arr[i],++a);
			}
		
		}
		printMap(hmap);
	}
	
	static void printMap(HashMap<Integer,Integer> hmap){
		
		for(Map.Entry m:hmap.entrySet()){
			System.out.println("Frequency of "+m.getKey()+" is "+m.getValue());
		}
	}
	
	public static void main(String []args){
		
		int arr[]={1,23,4,5,12,1,23,5,4,6,2,2,2};
		printFreq(arr);
	}
}


// Learned-:
// declearation of HashMap 
// if hmap is a object then
// 1.hmap.get(key)----to get value of the corrospondinng key.
// 2.hmap.entrySet()---returns a set contains (key,value).
// 3.Map.Entry m---is a predefined structure of a that set where "m" is the object of he set.
// 4.m.getKey()---to get KeyValue of the set.
// 5.m.getValue()--to get keyValue of the set.
// 6.the value of the Integer cannot be written in "int" form only to be written in the "Integer" form.