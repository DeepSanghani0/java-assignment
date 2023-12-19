package Module_2;
//Write a Java program to compare two array lists
import java.util.ArrayList;

public class Arraylist_Compare 
{
	public static void main(String[] args) 
	{
		ArrayList<String>Array1 = new ArrayList<String>();
		ArrayList<String>Array2 = new ArrayList<String>();
		
		//Add Elements in Arraylist1
		Array1.add("A");
		Array1.add("B");
		Array1.add("C");
		Array1.add("D");
		Array1.add("E");
		
		//Add Elements in Arraylist2
		Array2.add("A");
		Array2.add("B");
		Array2.add("C");
		Array2.add("D");
		Array2.add("E");
		Array2.add("F");
		
		System.out.println(Array1);
		System.out.println(Array2);
		
		if(Array1.equals(Array2)==true)
		{
			System.out.println("Both Arraylist are equal");
		}
		else {
			System.out.println("Arraylist are not equal");
		}
	}
}
