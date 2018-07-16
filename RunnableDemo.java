import java.lang.*;
import java.util.*;
public class RunnableDemo{
		public static void main(String [] args ){
			System.out.println("Starting parent Thread");
			SecondThread st = new SecondThread();
			try{
					(Thread.currentThread()).setName("Parent");
					for(int i=0;i<10;i++){
						System.out.println((Thread.currentThread()).getName()+"thread here..."+"Thread Priority:"+(Thread.currentThread().getPriority()));
						Thread.sleep(1000);
						st.join();
					}
			}catch(InterruptedException e){
			}
			System.out.println("parent Threading ending");
		}
}
class SecondThread implements Runnable {
			Thread thread;
			SecondThread(){
				thread = new Thread(this,"Second");
				System.out.println("Starting child thread");
				thread.start();
			}
			public void run(){
				try{
					(Thread.currentThread()).setName("Child");
					for(int i=0;i<10;i++){
						System.out.println((Thread.currentThread()).getName()+"thread here..."+"Thread Priority:"+(Thread.currentThread().getPriority()));
						Thread.sleep(1000);
						
					}
				}catch(InterruptedException e){
				}
				System.out.println("Second thread Ending");
			}
}