package Module_2;
//• Write a Java program to Take three numbers from the user and print the greatest number.
import java.util.Scanner;

public class greatestnumber {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter threee number: ");
		int no1= obj.nextInt();
		int no2= obj.nextInt();
		int no3= obj.nextInt();
		if (no1>no2 && no1>no3) 
		{
			System.out.println(no1 + " is a greatest number");
		}
		else if (no2 > no1 && no2 > no3) {
			System.out.println(no2 + " is greatest number");
		}
		else 
		{
			System.out.println(no3 + " is greatest number");
		}
		obj.close();
	}

}
