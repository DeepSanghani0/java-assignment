package Module_2;
//Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.ArrayList;

public class ArrayList_Add_Colour 
{
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Black");
		color.add("Red");
		color.add("Yellow");
		color.add("Green");
		System.out.println(color);
	}
}
