package Module_2;
/*
 • Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5
	5 + 55 + 555
 */
import java.util.Scanner;

public class sumofint 
{
	
	public static void main(String[] args) 
	{
		
		int a=5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number(0 to 9): ");
		a = sc.nextInt();
		System.out.printf("%d + %d%d + %d%d%d",a,a,a,a,a,a);
		
		int m = a + 11*a + 111*a;
		System.out.print(" = "+ m);
	}
	
	
}
