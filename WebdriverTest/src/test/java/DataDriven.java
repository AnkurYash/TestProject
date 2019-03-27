import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven
{
    WebDriver driver=null;	
    String Mainwindow =null;
   	 
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ankur.dixit\\Desktop\\DriversList\\chromedriver.exe");
	      System.out.println("This is beforeTest Method");
	      System.out.println("*************************************************");
		  
	  }
	
	  
	  @Test
	     public void Testfirst()
	    {
		  driver=new ChromeDriver();
	      driver.manage().window().maximize();
		  driver.navigate().to("http://10.26.2.105:8080/rms/dashboard/userdashboard");
	    }
	  
	  
     @Test
     public void execute()
    {
    	     	 
 		try
        {
 			File file =new File("C:\\Users\\ankur.dixit\\Desktop\\RRF-Deere.xlsx");    	 
 	        FileInputStream inputStream = new FileInputStream(file);
 	        Workbook  wb = new XSSFWorkbook(inputStream); 	
 	        Sheet sh = wb.getSheet("Sheet1");
 	        Iterator<Row> irow=sh.rowIterator();
 	        while(irow.hasNext())
 	        {
 	        	Row row =irow.next();
 	            Iterator<Cell> icell=row.cellIterator(); 
 	            while(icell.hasNext())
 	            {
 	           
 	            Cell cell=(Cell)icell.next();	
 	 	       
 	           if(cell.getCellType() == Cell.CELL_TYPE_BLANK)
 	            {
 	            	continue;
 	            }
 	            
 	            System.out.println(cell);      
 	            }
 	        }
 	        
 	        
          }	
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
    
    }
        
    	 
 
  @AfterTest
  public void afterTest()
  {
  //	  driver.close();
	  System.out.println("*************************************************");
	  System.out.println("This is AfterTest Method");
  }

}
