package Module_2;

/*
Create an abstract class 'Parent' with a method 'message'. 
It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" 
and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
*/

abstract class parentclass
{
public abstract void message();

}

class firstsubclass extends parentclass
{
public void message()
{
	System.out.println("This is Firstsubclass");
}
}

class secondsubclass extends parentclass
{
public void message()
{
	System.out.println("This is Secondsubclass");
}
}

public class inheritance_ex 
{

	public static void main(String[] args) 
	{
		parentclass obj1 = new firstsubclass();
		parentclass obj2 = new secondsubclass();
		
		obj1.message();
		obj2.message();
		
		
	}
}
