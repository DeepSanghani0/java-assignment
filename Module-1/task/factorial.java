package Module_1.task;

import java.util.Scanner;

//d .write a program you have to find the factorial of given number.

public class factorial 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number: ");
		int no = obj.nextInt();
		for(int i = no-1;i>=1;i--)
		{
			no= no* i;
		}
		System.out.println(no);
	}
}
