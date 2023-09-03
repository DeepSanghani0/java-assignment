package Module_1.task;

import java.util.Scanner;

// h .Write a program to find out the max from given number
public class max_number 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number (only 4 digit)");
		int n = obj.nextInt();
		obj.close();
		int a=(n/1000);
	    int b=((n/100)-(a*10));
	    int c=((n/10)-((a*100)+(b*10)));
	    int d=(n-((a*1000)+(b*100)+(c*10)));
	    if (a>b && a>c && a>d) 
	    {
	    	System.out.println(a+" is max number");
		}
	    else if (b>a && b>c && b>d) 
	    {
	    	System.out.println(b+" is max number");
		}
	    else if (c>a && c>b && c>d) 
	    {
	    	System.out.println(c+" c is max number");
		}
	    else 
	    {
	    	System.out.println(d+" is max number");
	    }
	}
}
