package Module_2;
//• Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class array_sort 
{
	public static void main(String[] args) {
		
	ArrayList<Integer>alpha=new ArrayList<Integer>();
	alpha.add(20);
	alpha.add(30);
	alpha.add(50);
	alpha.add(5);
	alpha.add(80);
	alpha.add(45);
	System.out.println(alpha);
	
	Collections.sort(alpha);
	System.out.println(alpha);

	Collections.sort(alpha,Collections.reverseOrder());
	System.out.println(alpha);
	}
}
