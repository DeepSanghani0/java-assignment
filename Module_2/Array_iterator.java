package Module_2;
//Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;
import java.util.Iterator;

public class Array_iterator {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());;
		}
	}
}
