package Module_2;
//Write a Java program to display the system time
import java.util.Calendar;

public class systemtime 
{

	public static void main(String[] args) 
	{
	
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
	
		System.out.println(hour + ":" + min + ":" + second );
	}
	
}
