package Module_2;
/*
 Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks Grade
91-100	AA
81-90	AB
71-80	BB
61-70	BC
51-60	CD
41-50 	DD
 
 */



import java.util.Scanner;

public class student_grade 
{

	
	public static void main(String[] args) 
	{
		int marks[] = new int[6];
		int i;
		float total = 0,avg;
		Scanner obj = new Scanner(System.in);
		for( i = 0 ; i<5 ; i++)
		{
			System.out.println("Enter  marks of subject "+ (i+1) + " : ");
			marks[i] = obj.nextInt();
			total = total + marks[i];
		}
		avg = total / 5;
		System.out.println("your Average marks is: " + avg);
		System.out.print("your Grade is: ");
		 
		if (avg > 90 && avg <=100) 
		{
			System.out.print("AA");
		}
		else if (avg >=81 && avg <= 90) 
		{
			System.out.print("AB");
		}
		else if (avg > 71 && avg <= 80) 
		{
			System.out.print("BB");
		}
		else if (avg > 61 && avg <= 70) 
		{
			System.out.print("BC");
		}
		else if (avg > 51 && avg <= 60) 
		{
			System.out.print("CD");
		}
		else if (avg > 41 && avg <= 50) 
		{
			System.out.print("DD");
		}
	}
}
