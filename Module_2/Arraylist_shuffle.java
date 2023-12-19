package Module_2;
//• Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_shuffle 
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
		
		Collections.shuffle(alpha);
		System.out.println(alpha);
		
		}
}
