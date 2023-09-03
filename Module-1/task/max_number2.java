package Module_1.task;

import java.util.Scanner;

// h .Write a program to find out the max from given number
public class max_number2 
{
	public static void main(String[] args) 
	{
		int largest = 0;
		int smallest = 9;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = obj.nextInt();
		obj.close();
		while(n>0)
		{
			int digit = n % 10;
			largest = Math.max(digit, largest);
			smallest = Math.min(digit, smallest);
			n = n/10;
		}
		System.out.println("largest number is: "+largest);
		System.out.println("Smallest number is: "+smallest);
	}
}
