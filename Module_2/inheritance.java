package Module_2;
/*
 * Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". 
 * Now, create an object for each of the class and call 
 * 1 - method of parent class by object of parent class 
 * 2 - method of child class by object of child class 
 * 3 - method of parent class by object of child class
 */
class parent
{
	void parent1()
	{
		System.out.println("This is Parent Class");
	}
}

class child extends parent
{
	void child1()
	{
		System.out.println("This is Child Class");
	}
}
public class inheritance 
{
	
	public static void main(String[] args) 
	{
		parent p =new parent();
		child c = new child();
		
		p.parent1();
		c.child1();
		c.parent1();
	}
}
