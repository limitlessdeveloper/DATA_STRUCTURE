import java.util.*;
import java.lang.*;
class PrintDemo {
    public void printCount(String threadName) {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println(threadName+"---" + i );
			Thread.sleep(1000);
         }
      }catch (Exception e) {
         System.out.println("Thread  interrupted.");
      }
   }
}

class ThreadDemo extends Thread {
   private Thread t;
   private String threadName;
   PrintDemo  PD;

   ThreadDemo( String name,  PrintDemo pd) {
      threadName = name;
      PD = pd;
   }
   public void run(){ synchronized(PD){
      PD.printCount(threadName);
       System.out.println("Thread " +  threadName + " exiting.");
   }}

     public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class TestThread {
   public static void main(String args[]) {
	   
      PrintDemo PD = new PrintDemo();
      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );
      T1.start();
      T2.start();      
       try {
       T1.join();														//join methods throws exception.
       }catch(InterruptedException e) {
       System.out.println("Interrupted");
       }
   }
}