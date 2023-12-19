package Module_2;
//• W.A.J. P to create one thread by extending Thread class in another Class.
class Thread_A1 extends Thread
{
	public void run() 
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println("Thread a : " + i);
		}
	} 
}

class Thread_B1 extends Thread
{
	public void run() 
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println("Thread b : " + i);
		}
	} 
}
public class Extend_Thread_Ex1 
{	public void run() 
	{
		for(int i = 0; i<= 10; i++)
		{
			System.out.println("Thread b : "+i);
		}
	}
	public static void main(String[] args) 
	{
		Thread_A1 a = new Thread_A1();
		Thread_B1 b = new Thread_B1();
		
		a.start();
		b.start();
	}
}
