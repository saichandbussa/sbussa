package Java;

/*
 --This and super can't be used  in static methods
 -- IF any instance variable value is changed inside any method its changed value is effected to that method only and again out side that 
  	method it will be original value only
 --IF any static variable value is changed inside any method it value is changed through class level. 
 */
public class Allvariablesexample {
	int a =10; // will get memory each time when the instance is created 
	static String name="SAI"; // The static variable gets memory only once in the class area at the time of class loading. 
	static int b =20;
	 static
	 {
		 System.out.println("static block is invoked");  // exe b4 main method
     }  
	public void methodTesting()
	{
		
		
		System.out.println("Initial name is " + name);
		
		int b=this.a; // or
		String du=this.name;
		System.out.println("DU is "+ du);
		System.out.println(a); //here value will be 10 only
		
		b=30;
		System.out.println("methodTesting  b value" + b);
		int c = this.a=12;
		System.out.println(c); // here c value is 12 this value is fixed to method level only out of this method a value will be 10
		
		this.staticMethod2(); // here we can call static method from normal method
	}
	
	
	// below is other static method
		public static void staticMethod2()
		{
			b=30;
			//  this.a;// cannot use non static content from static method.
			// String cc= this.name; // this and super cant be used in static content
			System.out.println("staticMethod2bc value" + b);
		}
		
		
		public static void samplemethodTesting()
		{
			
			/*Static method only access static variables & static methods cannot access non static methods & non static variables */
			
			// this.methodTesting();  // can't call non static method in static method directly even if instance or if method is called by classname.methodname also
			// This and Super keywords can't be used in static methods
		
		
			/*Possibilities*/		
			System.out.println(name);  // static variables can b accessed only by static variables 
			staticMethod2();  //  we can call static method in other static method directly		
		}
	
		public static void main(String[] args)
		{
			Allvariablesexample c = new Allvariablesexample();
			System.out.println(c); // here a value will be 10 only
			c.samplemethodTesting();
			c.methodTesting();
			c.staticMethod2();
			System.out.println("class level static variable value" + c.b);
			
			
		}
	
	

}
