package Module_2;
//• W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument and perform the division operation and handle Arithmetic
//O/P-
//Exception in thread main java. Lang. Arithmetic Exception:/ by zero
import java.util.Scanner;

public class devided_0_exception {

	public static void main(String[] args) 
	{

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any  2 Number: ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		
//		try 
//		{
			int c = a/b;
			System.out.println("Devidion is : " + c);
//		}
//		catch(ArithmeticException e)
//		{
//			e.getStackTrace();
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Executed");
//		}
	}

}
