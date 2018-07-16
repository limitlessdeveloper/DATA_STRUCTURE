import java.util.*;
class BasicTreeMap{
	
	static void printFreq(int []arr){
		TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			Integer a=tmap.get(arr[i]);
			if(a==null){
				tmap.put(arr[i],1);
			}
			else{
				tmap.put(arr[i],++a);
			}
		}
		printMap(tmap);
	}
	
	static void printMap(TreeMap<Integer,Integer> tmap){
		for(Map.Entry m:tmap.entrySet()){
			System.out.println("frequency of "+m.getKey()+" is "+m.getValue());
		}
	}
	
	
	public static void main(String []args){
		int a[]={1,2,43,56,7,8,9,546,7,8,89,435,67,76776,};
		printFreq(a);
	}
}