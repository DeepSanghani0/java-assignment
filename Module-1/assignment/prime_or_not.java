package Module_1;

import java.util.Scanner;

public class prime_or_not 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a = obj.nextInt();
		int c = 0;
		int i;
		
		if (a == 1) 
		{
			System.out.println("Given number is not prime nor composite");
		}
		else
			{	for( i = 1;i<=a;i++)
				{
					if (a % i == 0) 
					{
						c++;
					}
				}
				if (c == 2) 
				{
					System.out.println("Given number is Prime");
				}
				else 
				{
					System.out.println("given number is composite(not prime");
				}
			}
	}
}
