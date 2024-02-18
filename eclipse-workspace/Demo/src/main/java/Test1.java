import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[]args) throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		WebElement search=  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search.click();
		search.sendKeys("Testing");
		
		List <WebElement> autoSugg = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul"));		
		for(int i = 0 ; i< autoSugg.size();i++ ) {
   	  
        String s = autoSugg.get(i).getText();
        System.out.println("Text is: " + s);}
		
	     // }
		
		/*
		WebElement searchButton= driver.findElement(By.className("gNO89b"));
		searchButton.click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(1000); */
		driver.close();
	}
}
