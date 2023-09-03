package Module_1.task;

import java.util.Scanner;

public class fibonaci 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number: ");
		int no = obj.nextInt();
		int a = 0,b = 0,c=1;
		
		while(c<no)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
