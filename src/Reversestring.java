package Java;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reversestring {

	public static void main(String[] args) {
		 
		String s ="saichand";	
		int l = s.length();
		System.out.println("length is   : " + l);
		String reverse="";
		for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
		System.out.println("reverse  : " + reverse);
	}

}
