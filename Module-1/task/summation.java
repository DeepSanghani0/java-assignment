package Module_1.task;

import java.util.Scanner;

// h .Write a program to find out the max from given number
public class summation 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number (only 4 digit)");
		int n = obj.nextInt();
		obj.close();
		while(n>0)
		{
			int digit = n%10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println("sum of digit of given number is: "+ sum);
	}
}
