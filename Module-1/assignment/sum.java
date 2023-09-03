package Module_1;

import java.util.Scanner;

/*
 	2. Write a program to make addition, Subtraction, Multiplication and Division of
	   Two Numbers.
 */
public class sum 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		
		//Addition 
		int c = a + b;
		System.out.println("Addition of given number is: " + c);
		
		//Substraction
		int d = a - b;
		System.out.println("Addition of given number is: " + d);
		
		//Multiplication
		int e = a * b;
		System.out.println("multiply of given number is: " + e);
		
		//Division
		float f = a / b;
		System.out.println("Devide of given number is: " + f);
	}
}
