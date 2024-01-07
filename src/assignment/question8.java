package assignment;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class question8 
{
	public static void main(String args[])
	{
		//creating a pool of 2 threads here we are considering number of threads to be equal to number of tasks
		ExecutorService executorService= Executors.newFixedThreadPool(2);
		
		//ways of creating a task: runnable and callable 
		
		//first task created 
		Runnable firstTask = () -> 
		{
			System.out.println("First task has started");
			
			//first task is printing each character of hello good morning
			String word="Hello! Good Morning";
			for(int var=0; var<word.length();var++)
			{
				System.out.println("Task 1: Character is: "+word.charAt(var));
				
				try 
				{
					Thread.sleep(200);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println("The word is: "+word);
			System.out.println("Task 1 has completed");
		};
		
		
		//second task created 
		Runnable secondTask = () -> 
		{
			System.out.println("Second task has started");
			
			//first task to print numbers 
			for(int var=1; var<=19;var++)
			{
				System.out.println("Task 2: Printing  "+var);
				
				try 
				{
					Thread.sleep(200);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println("The numbers from 1 to 19 printed");
			System.out.println("Task 2 has completed");
		};
		
		
		//running the tasks 
		executorService.submit(firstTask);
		executorService.submit(secondTask);
		
		
		//shutting down/ closing the tasks
		executorService.shutdown();
		
	}

}
