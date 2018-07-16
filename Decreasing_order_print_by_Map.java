import java.util.*;
import java.util.Collections;
class Dopbm{
	public static void main(String args[]){
		int arr[]={1, 2, 6, 2, 3, 8, 4, 9, 5, 5};
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.get(arr[i])==null){
				map.put(arr[i],new ArrayList<Integer>());
			}
			map.get(arr[i]).add(i);
		}
		for(ArrayList<Integer> list:map.values()){
			for(int a:list)
				System.out.print(arr[a]+" ");
		}
		System.out.println();
		ArrayList<Integer> list= new ArrayList<Integer>(map.keySet());
		//System.out.println(list.get(list.size()-1));
		 for(int i=list.size()-1;i>=0;i--){
			ArrayList<Integer> al = map.get(list.get(i));
				 for(int a:al)
					 System.out.print(arr[a]+" ");
		 }
	}
}