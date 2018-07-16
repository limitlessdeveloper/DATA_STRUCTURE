import java.util.*;
class threads02
{
	public static void main(String []args)
	{
		Thread t=Thread.currentThread();
		new NewThread();			
			System.out.println("main thread : "+t);//calling the implemnented interface constructor	
		try{
		for(int i=5;i>0;i--)
			{
			System.out.println("main thread : "+i);
			t.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}System.out.println("exit main :");
	}
}
class NewThread implements Runnable
{
	Thread e;
	NewThread()
	{
		e=new Thread(this,"thread 01");
		System.out.println("Child Thread : "+e);
		e.start();
		
	}
	public void run()
	{
		try
		{
			for(int h=5;h>0;h--)
			{
				System.out.println("child thread : "+h);
				e.sleep(500);
			}
		}catch(InterruptedException e1)
		{
			System.out.println(e1);
		}
	System.out.println("exit Child :");
	}
}