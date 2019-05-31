
package Java;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Noofrowsandcols {
    public static void main(String[] args) throws ParseException, InterruptedException {
    	WebDriver wd;
		System.setProperty("webdriver.chrome.driver","D:\\Auto\\drivers\\chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("http://demo.guru99.com/test/web-table-element.php"); 
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        
	        //No.of rows
	        List  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr"));
	        System.out.println("Total No of rows are : " + rows.size());
	        for (int i =1;i<rows.size();i++)
	        {    
	        	Thread.sleep(2000);
	            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	            
	            NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m; // to get the highest value of all 
	                //r=r+m;// sum of all in that specific colomn
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
		    
    }
}
