package Module_2;

import java.util.Iterator;

class thread_a implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i = 1;i<=10;i++)
		{
			System.out.println("Thread thread_a : " + i);
		}
	}
	
}

class thread_b implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++)
		{
			System.out.println("Thread thread_b: " + i);
		}
	}
	
}


public class Runnable_Thread_Ex1 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread a1 = new Thread(new thread_a());
		Thread a2 = new Thread(new thread_b());
		a1.start();
		a2.start();
	}

}
