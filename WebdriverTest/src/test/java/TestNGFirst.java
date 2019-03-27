import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.*;

public class TestNGFirst
{
   Properties prop = new Properties();
   InputStream input = null;
	
	
   @Test
  public void f1() 
  {
  System.out.println("FirstTestNG:: This is main test Method");
     try
     {
	input = new FileInputStream("config.properties");
 // load a properties file
    prop.load(input);
    System.out.println(prop.getProperty("database"));
    System.out.println(prop.getProperty("dbuser"));
    System.out.println(prop.getProperty("dbpassword"));
    } 
    catch (Exception e)
    {
	e.printStackTrace();
	} 
    int a=3,b=4;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a);
    System.out.println(b);
     
  }
  
  @BeforeTest
  public void beforeTest()
  {
  System.out.println("FirstTestNG:: This is Before test Method");
  Set<String> hs1=new HashSet<String>();  
  hs1.add("Ravi");  
  hs1.add("Vijay");  
  hs1.add("Ravi");  
  hs1.add("Ajay");  
  Iterator<String> it=hs1.iterator();
 
     while(it.hasNext())
     {
	 System.out.println(it.next());
	 
     }
  }

  @AfterTest
  public void afterTest()
  {
  
  System.out.println("FirstTestNG:: This is After test Method");
  }

  
}
