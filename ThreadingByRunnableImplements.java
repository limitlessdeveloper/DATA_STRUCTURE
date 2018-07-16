import java.util.*;
import java.lang.Thread;
class MyThreadDemo implements Runnable{
	String s1;
	public static HashMap<String,Integer> map=new HashMap<>();
	MyThreadDemo(){
		map.put("a",0);
		map.put("e",0);
		map.put("i",0);
		map.put("o",0);
		map.put("u",0);
	 
}
	public void run(){
			synchronized(this){
				System.out.println("Enter the context :");
				Scanner s=new Scanner(System.in);
				String s1=s.nextLine();
			try{
				for(int i=0;i<s1.length();i++){
					if(s1.charAt(i)=='a'||s1.charAt(i)=='A'){
						int u=map.get("a");
						map.put("a",++u);
					}
					else if(s1.charAt(i)=='e'||s1.charAt(i)=='E'){
						int u=map.get("e");
						map.put("e",++u);
					}
					else if(s1.charAt(i)=='i'||s1.charAt(i)=='I'){
						int u=map.get("i");
						map.put("i",++u);
					}
					else if(s1.charAt(i)=='o'||s1.charAt(i)=='O'){
						int u=map.get("o");
						map.put("o",++u);
					}
					else if(s1.charAt(i)=='u'||s1.charAt(i)=='U') {
						int u=map.get("u");
						map.put("u",++u);
					}
					else continue;
				}
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
			}
	}
	
	public void display(){
		System.out.println("Map display by Entry Set");
		Set set=map.entrySet();
		System.out.println(set);
	}	
	public void displayByKeySet(){
		System.out.println("Vowel count in the given text are:");
		for(String s:map.keySet()){
			System.out.print(s+":"+map.get(s)+" ");
		}
	}
}

class ThreadingByRunnableImplements{
	public static void main(String []args) throws Exception{
		Scanner s=new Scanner(System.in);
		MyThreadDemo obj=new MyThreadDemo();
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			Thread ob=new Thread(obj);
			ob.start();
			ob.join();
		}		
		obj.display();
		obj.displayByKeySet();
	}
}