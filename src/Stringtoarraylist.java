package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stringtoarraylist 
{
	public static void main(String args[])
	{
		
				
				
				
				/*string to array list  method 2 */
				String ss ="SAICHAND";
				ArrayList<String> a = new ArrayList<String>(Arrays.asList(ss));		
				System.out.println("string to array list method 2 " + a.get(0));
				
				
				/*character to array list*/
				String sai ="SAICHAND";
				char[] namesai = sai.toCharArray();
				ArrayList<char[]> bl = new ArrayList<char[]>(Arrays.asList(namesai));	
				System.out.println(" test is "  + bl.get(0)); // This prints object
				char[] arr = bl.get(0);
				for(char c: arr) {
					System.out.println("Data after converting character arraylist "  + c);
				}
			
				
				
				
				
				
				/*String array to arraylist*/
				String[] words = {"ace", "boom", "crew", "dog", "eon"};  
			      List<String> wordList = Arrays.asList(words);  
			      for (String e : wordList)
			      {  
			         System.out.println("String array to arraylist"+ e);  
			      }    
			      
			      /*or*/
			      
			    String num = "22,33,44,55,66,77";
			  	String str[] = num.split(",");
			  	List<String> al = new ArrayList<String>();
			  	al = Arrays.asList(str);
			  	for(String saa: al)
			  	{
			  	   System.out.println("String array to arraylist"+ saa);
			  	}
				
				
				/*Array list to array*/
				ArrayList<String> al1 = new ArrayList<String>();
				al1.add("sai");
				String convname[]=al1.toArray(new String[al1.size()]);/*Here size is passed because string size is fixed*/							
				/*both are same methods*/				
				for(int i=0;i<convname.length;i++)
				{
					System.out.println("Converted arraylist to array value is " + convname[i]);
				}
}
}