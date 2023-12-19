package Module_2;

import java.util.Scanner;

//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop
public class sum_and_average 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		float average = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		for(int i = 1;i<=5;i++)
		{
			int number = obj.nextInt();
			sum += number;
			average = sum/5;
		}
		System.out.println("sum of given number is "+ sum);
		System.out.println("Average of given number is "+ average);
		obj.close();
	}
}
