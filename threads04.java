import java.util.*;
import java.lang.*;
class Sync
{
	synchronized void display(String str)
	{
		System.out.println("Start :"+str);
		try
		{
			for(int i=5;i>0;i--){
						System.out.println("Start :"+i);
		Thread.sleep(1000);

			}
					}
		catch(InterruptedException e)
		{
			System.out.println("Interruption :");
		}
		System.out.println("end :");
	}
}
class NewThread implements Runnable
{
	Sync targate;
	String m;
	Thread t;
	NewThread(String msg,Sync s)
	{
		targate=s;
		m=msg;
		t=new Thread(this,"child");//refers to the variable of the current object
		t.start();
	}
	public void run()
	{
		
		targate.display(m);
		System.out.println("exiting thread");
	
	}
}
class threads04
{
	public static void main(String []args)
	{
		Sync ob=new Sync();
	//	ob.display("afsdgfhgj");
		NewThread t1=new NewThread("T-1",ob);
		NewThread t2=new NewThread("T-2",ob);
		NewThread t3=new NewThread("T-3",ob);
			// Thread t=Thread.currentThread();
			
				// System.out.println("main thread start :");
				// try
				// {
					// ob.t1.join();
					// ob.t2.join();
					// ob.t3.join();
					// for(int i=5;i>0;i--)
					// {
						// System.out.println("main thread :"+i);
					// try	{
						// t.sleep(500);
						// }
				// catch(InterruptedException e)
				// {
					// System.out.println("interruption occures");
				// }

					// }
				// }
				// catch(InterruptedException e)
				// {
					// System.out.println("interruption occures");
				// }
			
			
			// t.start();
			
			 // // try{
		 // t1.t.join();
		 // t2.t.join();
		 // t3.t.join();
			
		 // }catch(InterruptedException e){System.out.println(e);}
		
	}
}