package Module_1.task;

import java.util.Scanner;

// f. write a program you have to print the table of given number.
public class table 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n = obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			int no=n*i;
			System.out.println(n+" * "+i+" ="+no);
		}
	}
}
