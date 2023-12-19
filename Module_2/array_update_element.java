package Module_2;
//Write a Java program to update specific array element by given element.
import java.lang.reflect.Array;
import java.util.Arrays;

public class array_update_element 
{
	public static void main(String[] args) 
	{
		int numbers[] = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(numbers));
		numbers[2] = 100;
		System.out.println(Arrays.toString(numbers));
	}
}
