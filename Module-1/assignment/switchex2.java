package Module_1;

import java.util.Scanner;

//18. Write a Program of Addition, Subtraction ,Multiplication and Division using switch
public class switchex2 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value of A & B: ");
		int A = obj.nextInt();
		int B = obj.nextInt();
		System.out.printf("press 1 for addition %npress 2 for subsstraction %npress 3 for multuplication %npress 4 for division ");
		int number = obj.nextInt();
		switch (number)
		{
			
		case 1:
			{
				int c = A+B;
				System.out.println(A +"+"+ B +"="+c );
			}
			
			case 2:
			{
				int c = A-B;
				System.out.println(A +"-"+ B +"="+c );
			}
			
			case 3:
			{
				int c = A*B;
				System.out.println(A +"*"+ B +"="+c );
			}
			
			case 4:
			{
				float c = A/B;
				System.out.println(A +"/"+ B +"="+c );
			}
		}
	}
}
