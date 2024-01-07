package assignment;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class question5 
{
	public static void main(String args[])
	{	
		String localDate=""+LocalDate.now();
		
		LocalDate todayDate=LocalDate.parse(localDate);
		
		DateTimeFormatter oldFormat=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		DateTimeFormatter newFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter newFormat1=DateTimeFormatter.ofPattern("MM-dd-yyyy");
		
		
		String newFormatDate=todayDate.format(newFormat);
		String newFormatDate1=todayDate.format(newFormat1);
		
		System.out.println("Old Format Date is: "+todayDate);
		System.out.println("\nNew Format Date is: "+newFormatDate);
		System.out.println("\nAlternative New Format Date: "+newFormatDate1);
		
	}

}
