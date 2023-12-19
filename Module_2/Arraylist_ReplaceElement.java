package Module_2;
//Write a Java program to replace the second element of an Array List with the specified element
import java.util.ArrayList;

public class Arraylist_ReplaceElement 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(15);
		ar1.add(50);
		ar1.add(80);
		System.out.println(ar1);
		
		ar1.set(1, 100);
		System.out.println(ar1);
	}
}
