package Module_2;
//• W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check the execution.
class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending "+ msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg + " sent");
	}
}
class ThreadSend extends Thread
{
	String msg;
	Sender sender;
	public ThreadSend(String msg,Sender sender)
	{
		this.msg = msg;
		this.sender = sender;
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		synchronized (sender) 
		{
			sender.send(msg);
		}
	}
}

public class Thread_Sleeptime_ex1 
{
	public static void main(String[] args) 
	{
		Sender send = new Sender();
		
		ThreadSend t1 = new ThreadSend("Hii", send);
		ThreadSend t2 = new ThreadSend("Bye", send);
		
		t1.start();
		t2.start();
		
		
	}
}
