package Module_2;

/*
	 W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than 18, then throw an Arithmetic Exception otherwise print a message welcome to vote.
	O/P- Enter your age: 16
	Exception in thread main java. Lang. Arithmetic Exception: not valid
 
 */


import java.util.Scanner;

public class throw_age_ex {

	static void Age(int age)
	{
		if(age > 18)
		{
			System.out.println("You are aligible to vote");
		}
		else 
		{
			throw new ArithmeticException("Not Valid");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Anter Your Age: ");
		int age = sc.nextInt();
		Age(age);
	}

}
