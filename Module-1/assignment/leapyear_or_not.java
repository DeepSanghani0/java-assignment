package Module_1;

import java.util.Scanner;

public class leapyear_or_not 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = obj.nextInt();
		if (year % 4 == 0 && year % 100 != 0) 
		{
			System.out.println("Given year is leap year");
		}
		else if (year % 400 == 0) 
		{
			System.out.println("Given year is leap year");
		}
		else 
		{
			System.out.println("Given year is not leap year");
		}
		obj.close();
	}
}
