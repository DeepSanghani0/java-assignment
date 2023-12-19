package Module_2;
/*
 	 • Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for
each data type.
 */
public class Print_Number 
{

	public void printno(int no)
	{
		System.out.println(no);
	}
	public void printno(float no)
	{
		System.out.println(no);
	}
	public void printno(double no)
	{
		System.out.println(no);
	}
	public void printno(long no)
	{
		System.out.println(no);
	}
	
	public static void main(String[] args) 
	{
		Print_Number obj = new Print_Number();
		
		obj.printno(10);
		obj.printno(10.1f);
		obj.printno(10.12);
		obj.printno(10000L);
	}
	
}
