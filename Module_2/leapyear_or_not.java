package Module_2;

import java.util.Scanner;

//Write a Java program that takes a year from user and print whether that year is a leap year or not
public class leapyear_or_not 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = obj.nextInt();
		if(year%4==0 && year%400!=0 )
		{
			System.out.println("Given year is a leap year");
		}
		else if (year %400 == 0) 
		{
			System.out.println("Given year is a leap year");
		}
		else 
		{
			System.out.println("Given year is not a leap year");
		}
		obj.close();
	}
}
