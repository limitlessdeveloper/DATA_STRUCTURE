import java.util.*;
import java.lang.*;
class threadnew implements Runnable
{
	synchronized void display()
	{
		System.out.println("child class started:");		
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("child class: "+i);
				display();
			}	
				Thread.sleep(1);
		}	
		catch(InterruptedException e)
		{
			System.out.println("interruption occurs");
		}
	}
}
class Thread05
{
	public static void main(String []args)
	{
			threadnew ob=new threadnew();
		    Thread o=new Thread(ob);
			o.start();
			
			try
			{
				Thread.sleep(500);
				for(int i=0;i<5;i++)
				{
					System.out.println("main thread: "+i);
				}
			}
			catch(InterruptedException e)
		{
			System.out.println("interruption occurs");
		}
	}
}