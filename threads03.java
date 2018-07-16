import java.util.*;
class threads03
{
	public static void main(String []args)
	{
		Thread t=Thread.currentThread();
		new NewThread();
		System.out.println("main class : "+t);
		try
		{
			for(int i=5;i>0;i--)
			{
			System.out.println("main thread : "+i);
			t.sleep(1000);
			}
		}
		catch(InterruptedException e1)
		{
			System.out.println(e1);
		}
		System.out.println("End Main : ");
	}
}
class NewThread extends Thread
{
	NewThread()
	{
		super("thread01");
		System.out.println("Child Thread : "+this);
		start();
	}
public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child thread : "+i);
				sleep(500);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("End Child : ");
	}
}