import java.util.*;
class RunnableImplements implements Runnable{
	public void run(){
		synchronized(this){
		//try{
			//Thread.sleep(101);
			Thread t=Thread.currentThread();
			t.setName("Child Class");
			for(int i=0;i<5;i++){
				System.out.println("Runnable Implementation  :"+t.getId()+" name :"+t.getName());
			//}
		}
		//catch(Exception e){
			//System.out.println(e.toString());
		//}
		}
	}
}

class RunnableImplementation{
	public static void main(String args[])throws Exception{
		for(int i=0;i<5;i++){
			System.out.println("main class thread :"+Thread.currentThread().getName());
			Thread m=new Thread(new RunnableImplements());
			m.start();
			m.join();
		}
	}
}