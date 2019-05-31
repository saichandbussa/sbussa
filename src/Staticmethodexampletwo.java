package Java;

public class Staticmethodexampletwo extends Staticmethodclass
{
	/*THis two programs agenda is polymorphism i.e single/Method action in different ways*/
	/*Runtime poly: call to an overridden method is resolved at runtime i.e method of parent class is called in child class by changing 
	  its functionality in child class
	  --In this process, an overridden method is called through the reference variable of a superclass.  */
	/*compile  poly: overloading method in parent class in child class is compile time poly 
	 * 				 or call to method is resolved at compile time*/
	
	public  void methodOne()
	{
		System.out.println("This is 2nd class method one");
	}
	
	public static void methodtwo()
	{
		System.out.println("This is 2st class method two");
	}
	public static void main(String[] args) 
	{
		Staticmethodclass ES = new Staticmethodexampletwo();
		
		/******************One set of example********************/
		// As per overriding rules this should call to class Derive's static  
       // overridden method. Since static method can not be overridden, it  
       // calls Base's display() 
	   
		ES.methodOne(); // here as this method one is instance method in both the classes it calls child method i.e instance method can be overridden i.e here
						// methodOne in Staticmethodexampletwo class is overridden method 
						//o/p will be This is 1st class method two
		ES.methodtwo(); // here as this method two is static method in both the classes it calls parent method. As this is static method this can't be overridden in child class
		                // if tried to overridden here  the latest record is pulled i.e record of parent class is pulled. 
						//o/p will be This is 1st class method two
						// method overloading is compiletime poly  and method overriding is run time poly
		
		/*Why can we not override static method?
		It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.*/
	}

}
