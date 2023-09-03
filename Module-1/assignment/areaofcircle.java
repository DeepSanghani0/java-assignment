package Module_1;

import java.util.Scanner;

// 4. Write a program to find the Area of Circle

public class areaofcircle 
{
	public static void main(String[] args) 
	{
		float pi = 3.14f;
		
		System.out.println("enter value of radius: ");
		Scanner objt = new Scanner(System.in);
		int radius = objt.nextInt();
		float area = pi * radius * radius;
		System.out.println("Area of Circle is: " + area);
		
		
	}
}
