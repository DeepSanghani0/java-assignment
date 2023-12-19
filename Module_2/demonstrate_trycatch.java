package Module_2;
//• W.A.J. P to demonstrate try catch block,
import java.util.Scanner;

public class demonstrate_trycatch 
{
	public static void ex1()
	{
		try
		{
			int a;
			System.out.println("Enter Any Number: ");
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			if (a>0) 
			{
				System.out.println("Square of " + a +" is: " + (a*a));
			}
			else
			{
				throw new Exception();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter Valid Number");
			ex1();
		}
	}
	
	public static void main(String[] args) 
	{
		ex1();
	}
}