package assignment;

import java.util.*;

class Subject 
{
	private int id;
	private String name;
	
	Subject(int id, String name)
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
	
	public String toString()
	{
		return "Subject-> "+"ID: "+id+" Name: "+name;
	}
}

class Student 
{
	private int id;
	private int age;
	private String name;
	
	Student(int id, int age, String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
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
	
	@Override
	public String toString()
	{
		return "Student-> "+"ID: "+id+" Name: "+name+" Age: "+age;
	}
}


public class question4 
{
	public static void main(String args[])
	{
		Student sobject1=new Student(1, 20, "Harry");
		Student sobject2=new Student(2, 19, "Ginny");
		Student sobject3=new Student(3, 21, "Ronald");
		Student sobject4=new Student(4, 21, "Hermione");
		
		Subject subobject1=new Subject(1, "Physics");
		Subject subobject2=new Subject(2, "Maths");
		Subject subobject3=new Subject(3, "Chemistry");
		
		Map<Student, List<Subject>> studentSubjectMap= new HashMap<Student, List<Subject>>();
		
		List<Subject> listSubject=new ArrayList<Subject>();
		
		//creating list of subjects for student 1
		listSubject.add(subobject1);
		studentSubjectMap.put(sobject1, listSubject);
		
		listSubject.clear();
		//creating list of subjects for student 2
		listSubject.add(subobject2);
		listSubject.add(subobject3);
		studentSubjectMap.put(sobject2,  listSubject);
		
		listSubject.clear();
		//creating list of subjects for student 3
		listSubject.add(subobject2);
		listSubject.add(subobject3);
		studentSubjectMap.put(sobject3, listSubject);
		
		listSubject.clear();
		//creating list of subject for student 4
		listSubject.add(subobject1);
		listSubject.add(subobject2);
		listSubject.add(subobject3);
		studentSubjectMap.put(sobject4, listSubject);
		
		
		System.out.println(studentSubjectMap+"\n");
		
		//iterating through the map
		for (Map.Entry<Student, List<Subject>> entry : studentSubjectMap.entrySet()) 
		{
            System.out.println("Student: " + entry.getKey());
            System.out.println("Subjects: " + entry.getValue());
            System.out.println();
        }

		
	}

}
