package assignment;

import java.util.*;

class C implements Comparable<C>
{
	private int id;
	private int marks;
	private String subject;
	
	C(int id, int marks, String subject)
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
	
	@Override 
	public int compareTo(C perEntry)
	{
		if(subject.equals("Maths") && perEntry.subject.equals("Maths"))
		{
			return Integer.compare(perEntry.marks, marks);
		}
		
		else if(subject.equals("Maths"))
		{
			return -1;
		}
		
		else if(perEntry.subject.equals("Maths"))
		{
			return 1;
		}
		
		else 
		{
			return Integer.compare(perEntry.marks, marks);
		}
	}
}

public class question3 
{
	public static void main(String args[])
	{
		List<C> subjectList=new ArrayList<C>();
		List<C> subjectList1=new ArrayList<C>();
		
		C subEntry1=new C(1,96, "Maths");
		C subEntry2=new C(2,97, "Maths");
		C subEntry3=new C(3,86, "Science");
		C subEntry4=new C(4,90, "English");
		C subEntry5=new C(5,70, "Maths");
		C subEntry6=new C(6,59, "English");
		
		subjectList.add(subEntry1);
		subjectList.add(subEntry2);
		subjectList.add(subEntry3);
		subjectList.add(subEntry4);
		subjectList.add(subEntry5);
		subjectList.add(subEntry6);
		
		subjectList1.addAll(subjectList);
	
		//sorting using comparator 
		//creating a custom comparator 
		
		Comparator <C> sortComparator= (var1, var2) -> 
		{
			if(var1.getSubject()=="Maths" && var2.getSubject()=="Maths")
			{
				return Integer.compare(var2.getMarks(), var1.getMarks());
			}
			else if(var1.getSubject().equals("Maths"))
			{
				return -1;
			}
			else if(var2.getSubject().equals("Maths"))
			{
				return 1;
			}
			else 
			{
				return var2.getMarks() - var1.getMarks();
			}
		};
		
		subjectList.sort(sortComparator);
		System.out.println("Sorting using comparator");
		for(C perItem: subjectList)
		{
			System.out.println(perItem);
		}
		
		Collections.sort(subjectList1);
		System.out.println("\nSorting using collections.sort()");
		for(C perItem: subjectList1)
		{
			System.out.println(perItem);
		}
		
	}
}
