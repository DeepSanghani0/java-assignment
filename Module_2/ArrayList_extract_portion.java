package Module_2;
//Write a Java program to extract a portion of an array list
import java.util.ArrayList;

public class ArrayList_extract_portion 
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
		
		System.out.println(alpha.subList(2, 5));
		
		}
}
