package Module_1;

import java.util.Scanner;

//6. Write a program to find the simple Interest.

public class simple_iinterest 
{

	public static void main(String[] args) 
	{
	
//		float i,p,r,t;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter value of principal: ");
		float p = obj.nextFloat();
		System.out.println("Enter rate of interest: ");
		float r = obj.nextFloat();
		System.out.println("Enter time period(in year): ");
		float n = obj.nextFloat();
		
		float i = ((p * r * n)/100);
		
		System.out.println("simple interest is: " + i);
		
		float a = i + p;
		System.out.println("total payable amount is: " + a);
	}
	
}
