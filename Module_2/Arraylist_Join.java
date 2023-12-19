package Module_2;
//Write a Java program to join two array lists
import java.util.ArrayList;

public class Arraylist_Join 
{
	public static void main(String[] args) 
	{
		ArrayList array1 = new ArrayList<>();
		array1.add('A');
		array1.add('B');
		array1.add('C');
		array1.add('D');
		
		ArrayList array2 = new ArrayList<>();
		array2.add('D');
		array2.add('E');
		array2.add('F');
		array2.add('G');
		array2.add('H');
		
		array1.addAll(array2);
		System.out.println(array1);
	}
}
