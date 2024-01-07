package assignment;

import java.util.*;

class StudentClass
{
	private int id;
	private int age;
	private String name;
	private String address;
	
	
	StudentClass(int id, int age, String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	StudentClass(int id, String name, String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	@Override 
	public String toString()
	{
		return "ID: "+id+" Name: "+name+" Age: "+age+" Address: "+address;
	}
	
}

class SubjectClass
{
	private int id;
	private String name;
	
	SubjectClass(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return "ID: "+id+" Name: "+name;
	}
}

public class question6 
{
	public static void main(String args[])
	{
		Map<StudentClass, List<SubjectClass>> studentSubject=new HashMap<StudentClass, List<SubjectClass>>();
		
		List<SubjectClass> subjectList=new ArrayList();
		
		StudentClass sobject1=new StudentClass(1, 20, "Harry");
		StudentClass sobject2=new StudentClass(2, 21, "Hermione");
		
		StudentClass sobject3=new StudentClass(3, "Ron", "Palm Lane");
		StudentClass sobject4=new StudentClass(4, "Ginny", "Bush Lane");
		
		SubjectClass subList1=new SubjectClass(1, "Maths");
		SubjectClass subList2=new SubjectClass(2, "Computers");
		SubjectClass subList3=new SubjectClass(3, "English");
		SubjectClass subList4=new SubjectClass(4, "Science");
		
		//for student1
		subjectList.add(subList1);
		subjectList.add(subList2);
		studentSubject.put(sobject1, subjectList);
		
		for (Map.Entry<StudentClass, List<SubjectClass>> perItem : studentSubject.entrySet()) 
		{
            System.out.println("Student: " + perItem.getKey());
            System.out.println("Subjects: " + perItem.getValue());
            System.out.println();
        }
		
		//for student2
		subjectList.clear();
		subjectList.add(subList1);
		subjectList.add(subList2);
		subjectList.add(subList3);
		subjectList.add(subList4);
		studentSubject.put(sobject2, subjectList);
		
		subjectList.clear();
		
//		for (Map.Entry<StudentClass, List<SubjectClass>> perItem : studentSubject.entrySet()) 
//		{
//            System.out.println("Student: " + perItem.getKey());
//            System.out.println("Subjects: " + perItem.getValue());
//            System.out.println();
//        }
		
		//for student3
		subjectList.clear();
		subjectList.add(subList1);
		studentSubject.put(sobject3, subjectList);
		
		for (Map.Entry<StudentClass, List<SubjectClass>> perItem : studentSubject.entrySet()) 
		{
            System.out.println("Student: " + perItem.getKey());
            System.out.println("Subjects: " + perItem.getValue());
            System.out.println();
        }
		
		//for student4
		subjectList.clear();
		subjectList.add(subList1);
		subjectList.add(subList3);
		subjectList.add(subList4);
		studentSubject.put(sobject4, subjectList);
		
		
		for (Map.Entry<StudentClass, List<SubjectClass>> perItem : studentSubject.entrySet()) 
		{
            System.out.println("Student: " + perItem.getKey());
            System.out.println("Subjects: " + perItem.getValue());
            System.out.println();
        }
		
	}

}
