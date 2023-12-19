package Module_2;
//Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist_Reverse 
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
	

	Collections.reverse(alpha);
	System.out.println(alpha);
	}
}
