package assignment;

class Parent
{
	public void display()
	{
		System.out.println("This is the parent class");
	}
	
	public void getParentMethod()
	{
		System.out.println("This is the normal method in the parent class");
	}
}

class Child1 extends Parent
{
	public void display()
	{
		System.out.println("This is the child1 class");
	}
	
	public void getChild1Method()
	{
		System.out.println("This is the normal method in the child class");
	}
}

class Child2 extends Parent
{
	public void display()
	{
		System.out.println("This is the child2 class");
	}
	
	public void getChild2Method()
	{
		System.out.println("This is the normal method in the parent class");
	}
}

public class question1
{
	public static void main(String args[])
	{
		Parent pobject1=new Child1();
		
		/*Note:
		Child1 cobject1=new Parent();
		is not possible can't make the object of child using parent constructor*/
		
		Parent pobject2=new Child2();
		
		Parent pobject3=new Parent();
		
		
		//created parent object and was able to obtain the overriden method
		pobject1.display(); 
		
		//pobject1.getChild1Method();
		//can't access the child exclusive method here
		//pobject2.getChild2Method();
		
		pobject2.display();
		
		pobject3.display(); 
		
		pobject3.getParentMethod();
	}

}
