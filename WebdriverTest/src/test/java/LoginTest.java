
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest 
{
  WebDriver driver=null;	
  String Mainwindow =null;
  
  @BeforeTest
  public void beforeTest()
  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ankur.dixit\\Desktop\\DriversList\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
  }
  
  
  @Test
  public void Test()
  {
	driver.get("http://www.way2automation.com/");
	try
    {
    Thread.sleep(3000);	
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
	
	Mainwindow=driver.getWindowHandle(); 
	driver.findElement(By.linkText("MEMBER LOGIN")).click(); 
	
	for (String winHandle : driver.getWindowHandles())
	{
	    driver.switchTo().window(winHandle); 
		System.out.println("Handles are as follows:  "+winHandle);
	}
		
	try
    {
    Thread.sleep(5000);	
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }	 		
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='user_email']")).click();
    driver.findElement(By.id("user_email")).clear();
    driver.findElement(By.id("user_email")).sendKeys("dacacib@idx4.com");
	driver.findElement(By.id("user_password")).click();
	driver.findElement(By.id("user_password")).clear();
	driver.findElement(By.id("user_password")).sendKeys("123456");
	driver.findElement(By.name("commit")).click();
	
	    try
        {
        Thread.sleep(5000);	
         }
        catch(Exception e)
        {
        	e.printStackTrace();
         }
		
	
	WebElement Logoutlink;	
	WebDriverWait wait = new WebDriverWait(driver,30);	
	Logoutlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='navbar']/div/div/div/ul/li[4]/a/img")));	
	Logoutlink.click();  
	try
    {
    Thread.sleep(5000);	
    driver.findElement(By.xpath("//li[@class='user-signout']")).click();	
    Thread.sleep(2000);
	}
    catch(Exception e)
    {
    e.printStackTrace();
    }

	
	driver.close();
	}
  

 @AfterTest
 public void afterTest()
 {
	  driver.switchTo().window(Mainwindow);  
	      
	  try
	      {
	       Thread.sleep(3000);	
	      }
	      catch(Exception e)
	      {
	       e.printStackTrace();
	      }
	      
	  driver.quit();
  }

}
