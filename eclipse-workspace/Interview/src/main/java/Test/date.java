package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class date  {
public static void main(String[] args)throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.timeanddate.com/date/dateadd.html");
	driver.manage().window().maximize();
	WebElement cal= driver.findElement(By.xpath("//*[@class='btn-datepicker']"));
	//WebDriverWait w = new WebDriverWait(driver, 2);
//	w.until(ExpectedConditions.visibilityOfElementLocated((By) cal));
	
	cal.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//table[@class='calendar']/tbody/tr[4]/td[2]")).click();
	driver.quit();

}
}
