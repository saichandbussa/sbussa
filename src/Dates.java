
package Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {

	public static void printCurrentDate()
	{
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss"); 
		Date date = new Date();   
		System.out.println("Date is "+ date);
		String finaldate =sd.format(date);
        System.out.println(finaldate);
	}
	
	public static void printCurrentMonth()
	{
		SimpleDateFormat sd = new SimpleDateFormat("MM"); 
		Date date = new Date();  
		String finaldate =sd.format(date);
        System.out.println(finaldate);
	}
	
	public static void printCurrentyear()
	{
		SimpleDateFormat sd = new SimpleDateFormat("YY"); 
		Date date = new Date();  
		String finaldate =sd.format(date);
        System.out.println(finaldate);
	}
	
	public static int  getMonthJavaInt(String monthName) throws ParseException 
	{

		Date date = new SimpleDateFormat("MMMM").parse(monthName);
		Calendar cal = Calendar.getInstance(); // Gets calendar using  the default time zone and locale.
		cal.setTime(date);
		return cal.get(Calendar.MONTH)+1;
		
		 
	}
	public static void main(String[] args) throws ParseException {
		
		Dates.printCurrentDate();
		Dates.printCurrentMonth();
		Dates.printCurrentyear();
		System.out.println("Month is "+ Dates.getMonthJavaInt("december"));
	}

}
