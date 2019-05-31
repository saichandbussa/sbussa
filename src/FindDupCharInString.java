package Java;
import java.util.HashMap;
import java.util.Set;

public class FindDupCharInString {
	
	public static void duplicateString(String InputString)
	{
		//creating hashmap to remove duplicates
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		//converting string to array
		char[] str = InputString.toCharArray();
		for(char c : str)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				charCountMap.put(c, 1);
			}
		}
		
		Set<Character> charsInString = charCountMap.keySet(); // this key.set() returns the unique keys contained in Hashmap
		
		System.out.println("Keys in "+charsInString);
		System.out.println("Duplicate Characters In "+InputString);
		
		for(Character cs:charsInString)
		{
			if(charCountMap.get(cs)>1)
			{
				System.out.println(cs +" : "+ charCountMap.get(cs));
			}
		}
	}

	public static void main(String[] args)
	{
		duplicateString("JavaJ2EE");

		duplicateString("Fresh Fish");

		duplicateString("Better Butter");

	}

}
