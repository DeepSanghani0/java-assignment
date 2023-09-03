package Module_1;

import java.util.Scanner;

//5. Write a program to find the Area of Triangle

public class areaoftriangle 
{
	int a,b,c;
	
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter value of 3 adges: ");
		float a = obj.nextInt();
		float b = obj.nextInt();
		float c = obj.nextInt();
		
		float s = ((a + b + c)/2);
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Semi perimeter is: " + s);
		System.out.println("area of triangle is: " + area);
	}
}
