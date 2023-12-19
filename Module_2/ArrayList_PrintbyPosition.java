package Module_2;
//Write a Java program to print all the elements of an Array List using the position of the elements
import java.util.ArrayList;

public class ArrayList_PrintbyPosition 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer>alpha=new ArrayList<Integer>();
		alpha.add(20);
		alpha.add(30);
		alpha.add(50);
		alpha.add(5);
		alpha.add(80);
		alpha.add(45);
		System.out.println(alpha);
		
		for(int i = 0;i<alpha.size();i++)
		{
			System.out.println(i + " : "+alpha.get(i));
		}
	}
}
