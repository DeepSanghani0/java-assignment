package Module_1;

// 7. Write a program to calculate sum of 5 subjects & find the percentage. Subject marks entered by user.

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Marksheet 
{
	static int Total,ID;
	float Percentage;
	static String Name;

	public void Name() 
	{
		Scanner nm = new Scanner(System.in);
		System.out.println("Enter Your ID: ");
		 ID = nm.nextInt();
		System.out.println("Enter Your Name: ");
		Name = nm.next();
	}
	
	public void mark()
	{
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter your marks(Out of 100): ");
		System.out.println("enter mark of Maths: ");
		int Maths = marks.nextInt();
		System.out.println("enter mark of Science: ");
		int Science = marks.nextInt();
		System.out.println("enter mark of English: ");
		int English = marks.nextInt();
		System.out.println("enter mark of Gujarati: ");
		int Gujarati = marks.nextInt();
		System.out.println("enter mark of Computer: ");
		int Computer = marks.nextInt();
		 Total = Maths + Science + English + Gujarati + Computer;
		Percentage = Total / 5;
		
		marks.close();
	}
	public void display()
	{
		
		System.out.println("Your ID is: " + ID);
		System.out.println("Your Name is: " + Name);
		System.out.println("Total marks is: " + Total );
		System.out.println("Percantage = " + Percentage );
	}
	
	
	public static void main(String[] args) 
	{
		Marksheet m1 = new Marksheet();
		m1.Name();
		m1.mark();
		m1.display();
	}	
}
