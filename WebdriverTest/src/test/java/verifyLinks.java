import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.net.*;
public class verifyLinks
{
	WebDriver driver=null;	
    String Mainwindow =null;
		
	@BeforeClass
	public void beforeClass()
	{
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ankur.dixit\\Desktop\\DriversList\\chromedriver.exe");
	   System.out.println("This is beforeTest Method");
	   System.out.println("*************************************************");	
	   double a=2.05;
	   int b=(int)a;
	   System.out.print(b+"\n");
	}
	
		
  @Test
  public void f()
  {
      try
      {
    //    driver.get("http://www.way2automation.com/");
    	  URL url = new URL("http://learn-automation.com/find-broken-links-using-selenium/");
    	  url.openConnection();    	          	  
    	  HttpURLConnection httpURLConnect;
    	  httpURLConnect=(HttpURLConnection)url.openConnection();    	  
    	  System.out.println("URL Response Code is as follows:  "+httpURLConnect.getResponseCode());    	      	  
      }
     catch(Exception ex)
     {
    	 ex.printStackTrace();
     }        
  }
 

  @AfterClass
  public void afterClass()
  {
     System.out.println("*************************************************");	
     System.out.println("This is after class method");
     System.out.println("*************************************************");	
  }

}
