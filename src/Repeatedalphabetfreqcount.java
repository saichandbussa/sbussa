package Java;
public class Repeatedalphabetfreqcount {

	public static void main(String[] args)
	{
		String s = "saaischaand";
		int l=s.length();
		int count=0;
		char ch;
		for(char i='a'; i<='Z'; i++)
		{
			count=0;
			for(int j=0;j<l;j++)
			{
				ch=s.charAt(j);  // below 3 lines are the main logic
				if(ch==i)
					count++;
			}
			if(count!=0)
			{
				System.out.println(i+"\t\t"+count);
			}
			System.out.println(i+"\t\t"+count);
		}

	}

}
