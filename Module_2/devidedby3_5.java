package Module_2;
//• Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
public class devidedby3_5 {

	public static void main(String[] args) 
	{
		
		int i;
		for(i = 1 ; i<=100;i++)
		{
			if (i%3==0 || i%5==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
