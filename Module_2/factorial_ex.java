package Module_2;

/*
 	Write a program to print the factorial of a number by defining a method named 'Factorial'.
*/
import java.util.Scanner;


public class factorial_ex 
{
	static int fectorial(int no)
	{
		for(int i = no-1 ; i>=1; i--)
		{
			no*=i;
		}
		return no;
	}
	
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int no = obj.nextInt();
		System.out.println(fectorial(no));
	}
}

