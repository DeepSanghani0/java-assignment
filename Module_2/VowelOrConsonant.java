package Module_2;
/*
  	• Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 */
import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a single character from the alphabet: ");
        String input = sc.nextLine(); 
        if (input.length() == 1 && input.matches("[a-zA-Z]")) 
        { 
            String ch = input.toLowerCase(); 
            
            if (input == "a" && input == "e" && input == "i" && input == "o" && input == "u") 
            {
				System.out.println("Vowel");
			}
            else
            {
            	System.out.println("Consonant");
            	
            }
        }
        
        else 
        {
            System.out.println("Invalid input"); 
        }
    }
}
