package Module_2;
//Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;

public class ArrayList_RetrieveElement 
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
		
		System.out.println("Element of 2nd index is: "+alpha.get(2));
	}
}
