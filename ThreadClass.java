import java.lang.*;
import java.util.Thread;

class MultiThreadDemo extends Thread{
	public void run(){
			try{
		synchronized(this){
					for(int i=0;i<5;i++){
						System.out.println("Thread 2 is running");
					}
				}
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
	}
}

class ThreadClass{
	public static void main(String args[]){
		int a=5;
		for(int i=0;i<a;i++){
			System.out.println("Thread "+i+" running");
			MultiThreadDemo ob=new MultiThreadDemo();	
			//Thread m=new MultiThreadDemo();
			ob.start();
			try{
			ob.sleep(1);
			}
			catch(Exception e){
					System.out.println(e.toString());
			}
		}
	}
}