package Java;
public class Removeduplicates {

	public static void main(String[] args) {
		
		String s ="saaichannd";
		int l = s.length();
		System.out.println("length is" + l);
		
		String ans="";
		char ch;
		System.out.println("char is "  + s.charAt(0));
		
		for(int i=0;i<l;i++)
		{
			ch = s.charAt(i);
            if(ch!=' ')
            ans = ans + ch;
            s = s.replace(ch,' ');
		}
		System.out.println("Word after removing duplicate characters : " + ans);
	}

}
