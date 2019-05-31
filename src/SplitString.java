package Java;

public class SplitString {
	
    public static void main(String[] args) {
    	
        String s ="{U1,U2,U3},{U5,U7},{U4,U6,U8}";
        String[] splitted = s.split("},");
        int length=splitted.length;
        System.out.println("length is " + length);
        
        
        // add the end brace for every entry except the last
        for (int i=0 ; i < splitted.length-1 ; i++) {
            splitted[i]=splitted[i] + "}";
        }

        // print out the string array
        for (int i=0; i< splitted.length ; i++) {
            System.out.println("String s"+i+" = "+splitted[i]);
        }
    }
}