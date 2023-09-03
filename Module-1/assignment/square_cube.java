package Module_1;
// 3. Write a program to make a square and cube of number.
import java.util.Scanner;

public class square_cube 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a = obj.nextInt();
		int square = a * a;
		int cube  = a * a * a;
		System.out.println("square of given number is: " + square);
		System.out.println("square of given number is: " + cube);
	}

}
