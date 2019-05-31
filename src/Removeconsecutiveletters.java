package Java;
public class Removeconsecutiveletters {

	public static void main(String[] args) {
		String s = "saaiiiichaannd";
		s = s + " ";  /* here we are adding space to existing string bcaz this space is checked with b4 letter i.e at s.charAt(i+1)*/
		int l=s.length();
		String ans ="";
		for(int i=0;i<l-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i+1))   /* Remove consecutive letters */
			{				
				ans =ans+s.charAt(i);
			}
			
		}
		System.out.println("word is " +ans);		

	}

}
