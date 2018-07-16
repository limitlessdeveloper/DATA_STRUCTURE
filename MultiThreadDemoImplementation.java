import java.util.*;
import java.lang.*;
class ThreadInitiate extends Thread{
	public void run(){
		synchronized(this){
				
					try{
					System.out.println("from thread 1--"+Thread.currentThread().getId());
					}
					catch(Exception e){
						System.out.println(e.toString());
					}
				
			}
	}
}

class MultiThreadDemo extends Thread{
	public void run(){
			synchronized(this){
				for(int i=0;i<5;i++){
					try{
					System.out.println("from thread 2--"+Thread.currentThread().getId());
					}
					catch(Exception e){
						System.out.println(e.toString());
					}
				}
			}
		}
}

class MultiThreadDemoImplementation{
	public static void main(String args[]){
				
		for(int i=0;i<5;i++){
			ThreadInitiate n=new ThreadInitiate();
			n.start();
			try{	
				n.join();
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
			MultiThreadDemo m=new MultiThreadDemo();
			m.start();
			try{	
				m.join();
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
		}
	}
}