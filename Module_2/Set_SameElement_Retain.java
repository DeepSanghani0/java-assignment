package Module_2;
//Write a Java program to compare two sets and retain elements which are same on both sets.
import java.util.HashSet;
import java.util.Set;

public class Set_SameElement_Retain 
{
	public static void main(String[] args) {
		Set<String> color1 = new HashSet<String>();
		color1.add("White");
		color1.add("Black");
		color1.add("Red");
		color1.add("Yellow");
		color1.add("Green");
		System.out.println("Set1: "+color1);
		
		Set<String> color2 = new HashSet<String>();
		color2.add("White");
		color2.add("Black");
		color2.add("Red");
		color2.add("Orange");
		color2.add("Blue");
		System.out.println("Set2: "+color2);
		
		color1.retainAll(color2);
		System.out.println("same on both set: "+color1);
	}
}
