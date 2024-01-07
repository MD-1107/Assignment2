package assignment;

//cannot override methods in the child class and don't use final as well 
//three options: private, static and 
class A
{
	public void canOverride()
	{
		System.out.println("canOverride: Parent class method which can be overriden");
	}
	
	private void cantOverride1()
	{
		System.out.println("cantOverride1: Private methods cannot be overriden");
	}
	
	public static void cantOverride2()
	{
		A object1=new A();
		
		//only in this way the method calling of private method can be done
		object1.cantOverride1();
		
		System.out.println("cantOverride2: static methods cannot be overriden");
	}
	
}

class B extends A 
{
	public void canOverride()
	{
		System.out.println("Child->canOverride: The canOverride method is overridden in child class");
	}
	
	public void cantOverride1() //doesnt consider the parent class method
	{
		System.out.println("Child->cantOverride1:cantOverride is not considered method overriding. This is a fresh method");
	}
	
	/*public void cantOverride2() //cant be done static method override
	{
		System.out.println("Child->cantOverride2:cantOverride is not considered method overriding. This is a fresh method");
	}*/
}

public class question2 
{
	public static void main(String args[])
	{
		A parentObject=new A();
		
		B childObject=new B();
		
		parentObject.canOverride();
		
		parentObject.cantOverride2();
		
		childObject.canOverride();
		
		childObject.cantOverride1();
		
		A parentObject1=new B();
		
		parentObject1.canOverride();
		
		parentObject1.cantOverride2();
	}

}
