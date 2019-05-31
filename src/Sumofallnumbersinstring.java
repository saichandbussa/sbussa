package Java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Sumofallnumbersinstring {

	public static void main(String[] args) {
		
     
		String s ="sai1123chand1bus11a";
		int l =s.length();
		 String num = "";
		 int sum=0;
		for(int i=0;i<l;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				System.out.println(" number in string  is " + s.charAt(i));
				num=num+s.charAt(i);
				System.out.println(" number is " + num);
				sum=sum+Integer.parseInt(num);
				num=""; // here in this step we are making number value as empty again 
				
			}
		}
		System.out.println(sum);

	}

}
