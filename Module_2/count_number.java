package Module_2;

import java.util.Scanner;

//Write a Java program that reads a positive integer and count the number of digits the number
public class count_number 
{
	public static void main(String[] args) 
	{
		int count =0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number: ");
		long number = obj.nextLong();
		while (number != 0) 
		{
			number /=10;
			count++;
		}
		System.out.println("number of digit of given number is: " + count);
		obj.close();
	}
}
