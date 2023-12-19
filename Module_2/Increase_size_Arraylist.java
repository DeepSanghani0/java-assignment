package Module_2;
//Write a Java program to increase the size of an array list
import java.util.ArrayList;

public class Increase_size_Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(2);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.ensureCapacity(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(30);
		al.add(40);
		System.out.println(al);
	}
}