package Module_2;
//• Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.
	class areaof
	{
		static int area(int length ,int breadth)
			{
				return length*breadth;
			}
		static int area(int length)
		{
			return length*length;
		}
	}



public class areas extends areaof
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 6;
		System.out.println("area of Rectangle is: " + area(a,b));
		System.out.println("area of square is: " + area(a));
	}
}
