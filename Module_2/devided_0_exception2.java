package Module_2;
//Take two numbers from the user and perform the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0
//Exception in thread main java.lang.ArithmeticException:/ by zero
import java.util.Scanner;

public class devided_0_exception2 {

	public static void main(String[] args) 
	{

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any  2 Number: ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		
		try 
		{
			int c = a/b;
			System.out.println("Devision is : " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Executed");
		}
	}

}
