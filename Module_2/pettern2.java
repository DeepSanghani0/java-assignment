package Module_2;

import java.util.Scanner;

public class pettern2 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number of row: ");
		int rows = obj.nextInt();
		int a = 1;
		for(int i =1 ; i<=rows;i++)
		{
			for(int j = 1 ; j<=i; j++)
			{
					System.out.print(a+" " );
					a++;
			}	
			System.out.println();
		}
		obj.close();
	}

}
