package tests;
import java.util.Iterator;
import java.util.Set;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {
		  
		 	public static void main(String[] args) {
		 		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 //driver.quit();
		 driver.manage().window().maximize();
		 driver.get("https://www.yahoo.com/");
		 driver.manage().window().maximize();
		 String currentwinid = driver.getWindowHandle();
		/*  
		 Set<String> windowids = driver.getWindowHandles();
		 String desiredwindow = "";
		 Iterator<String> itr = windowids.iterator();
		 while(itr.hasNext()) {
		 	String out = itr.next();
		 	if(!out.equals(currentwinid)) {
		 		desiredwindow = out;
		 		
		 	}
		 }
		  
		 driver.switchTo().window(desiredwindow);
		  
		  
		  */
		  
		 	}
		  
		 }


