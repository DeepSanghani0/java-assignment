package Module_1;

import java.util.Scanner;

//19. Write a program of to find out the Area of Triangle, Rectangle and Circleusing If Condition
public class ifex1 
{
	public static void main(String[] args) 
	{
		Scanner obj =new Scanner(System.in);
		System.out.printf("press 1 for find area of triangle %npress 2 for find area of trectangle%npress 3 for find area of Circle: ");
		int number = obj.nextInt();
		
		if (number == 1) 
		{
			System.out.println("enter value of 3 adges: ");
			float a = obj.nextInt();
			float b = obj.nextInt();
			float c = obj.nextInt();
			
			float s = ((a + b + c)/2);
			
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Semi perimeter is: " + s);
			System.out.println("area of triangle is: " + area);
		}
		
		else if (number == 2) 
		{
			System.out.println("enter value of 2 adges: ");
			float a = obj.nextInt();
			float b = obj.nextInt();
			float area = a * b;
			System.out.println("area of rectangle is: " + area);
		}
		
		else if (number == 3) 
		{
			float pi = 3.14f;
			int radius = obj.nextInt();
			float area = pi * radius * radius;
			System.out.println("Area of Circle is: " + area);
		}
		else
		{
			System.out.println("Enter valid number");
		}
		
	}
}
