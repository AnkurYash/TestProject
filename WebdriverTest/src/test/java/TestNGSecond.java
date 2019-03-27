import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.*;


public class TestNGSecond 
{
	WebDriver driver=null;
  
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\ankur.dixit\\Desktop\\DriversList\\IEDriverServer.exe");
      driver=new InternetExplorerDriver();
      driver.manage().window().maximize();
  }

  @Test
  public void f()
  {
	 
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get("https://www.google.com");
	  try
	  {
		  Thread.sleep(5000);
	  }
	  catch(Exception ex)
	  {
		  ex.printStackTrace();
	  }
	  	  	  
      String Childwindow =driver.getWindowHandle();     
  	  driver.switchTo().window(Childwindow);	      	   	  
 //   driver.findElement(By.className("gb_wa gb_kd gb_od")).click();
  	  // NO THANKS
  	driver.findElement(By.linkText("NO THANKS")).click();
  	 
  	try
	  {
		  Thread.sleep(5000);
	  }
	  catch(Exception ex)
	  {
		  ex.printStackTrace();
	  }
  }
  
  
  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
