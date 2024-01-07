package assignment;

import java.util.*;

class X
{
	private int id;
	private int marks;
	private String subject;
	
	X(int id, int marks, String subject)
	{
		this.id=id;
		this.marks=marks;
		this.subject=subject;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	@Override
	public String toString()
	{
		return "ID: "+id+" Subject: "+subject+" Marks: "+marks;
	}
}

public class question7 
{
	public static void main(String args[])
	{
		List<X> newList=new ArrayList<X>();
		
		X sub1=new X(1, 96, "Maths");
		X sub2=new X(2, 59, "Chemistry");
		X sub3=new X(3, 100, "Computer Applications");
		
		newList.add(sub1);
		newList.add(sub2);
		newList.add(sub3);
		
		List<X> greaterMarksSub=new ArrayList<>();
		
		for(X perItem: newList)
		{
			if(perItem.getMarks()>60)
			{
				greaterMarksSub.add(perItem);
			}
		}
		System.out.println("The subjects which have marks greater than 60: ");
		for(X perItem: greaterMarksSub)
		{
			System.out.println(perItem);
		}
	}

}
