import java.util.*;
class threads01
{
	public static void main(String []args)
	{
			Thread t=Thread.currentThread();
			System.out.println("thread name : "+t);
			t.setName("New Name");
			t.setPriority(3);
			System.out.println("thread name 02 : "+t);
			try
			{
				for(int i=3;i>0;i--)
				{
					System.out.println(i);
					t.sleep(1000);
				}
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
	}
}