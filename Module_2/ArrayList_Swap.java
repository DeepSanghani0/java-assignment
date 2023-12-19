package Module_2;
// Write a Java program of swap two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Swap 
{
	public static void main(String[] args) {
		
	ArrayList ar = new ArrayList<>();
	ar.add('A');
	ar.add('B');
	ar.add('C');
	ar.add('D');
	System.out.println(ar);
	
	Collections.swap(ar, 2, 3);
	System.out.println(ar);
	}
}
