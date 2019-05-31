package Java;
public class Accessmodifiers 
{
	private int data=40;  
	private void msg()
	{
		System.out.println("Hello java");
	}
	public static void main(String[] args) 
	{
		Accessmodifiers a= new Accessmodifiers();
		System.out.println(a.data); // compile time error
		 a.msg(); // compile time error  here compile time error is syntax error which can be found as that is wrong when .class file is processed

		 /************** Note ***************************/
		// If u make constructor as private u can't create object of that class
	}

}
