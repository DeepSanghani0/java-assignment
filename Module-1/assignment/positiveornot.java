package Module_1;

import java.util.Scanner;

// 	8. Write a Program to check the given number is Positive, Negative

public class positiveornot 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a = obj.nextInt();
		if (a > 0) 
		{
			System.out.println("Given number is Positive");
		}
		else if (a == 0) 
		{
			System.out.println("Given number is Zero");
		}
		else
		{
			System.out.println("Given number is Nagative");
		}
	}
}
