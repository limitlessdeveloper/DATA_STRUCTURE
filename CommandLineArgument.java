import java.io.*;
import java.util.*;
class CommandLineArgument{
	public static void main(String args[]){
		
		char arr[]=args[0].toCharArray();
		int i=arr.length;
		
		int l=(int)(Math.pow(2,i)-1);
		
		while(l>0){
		ArrayList<Integer> list=new ArrayList<>();
			String st="";
			count(list,l);
			for(int k=0;k<list.size();k++){
				if(list.get(k)==1){
				System.out.print(arr[k]);
				st+=arr[k];
				}
			}
			System.out.println();
			BufferedReader br=null;
			try{
				br=new BufferedReader(new FileReader("F:\\java programs\\default\\FileOperation\\rekhit.txt"));
				String g;
				while((g=br.readLine())!=null){
						if(g.equals(st))
					System.out.print(g+"**"+st+"\n");
				}
				br.close();
			}
			catch(IOException e){
				System.out.println(e.toString());
			}
			finally{
				try{
					if(br!=null) br.close();
				}
				catch(IOException e){
					System.out.println(e.toString());
				}
			}
			System.out.println();
			l--;
		}
	}
	static void count(ArrayList<Integer> list,int l){
		
		while(l!=0){
			list.add(l%2);
			l/=2;
		}
	}
}