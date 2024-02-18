package Test;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open_new_tab {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.chromedriver();
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement search=  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	search.clear();
	search.click();
	search.sendKeys("Testing");
	//List<WebElement> li= new ArrayList<WebElement>(driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul")));
	//li.get(2).click();
	//Robot class approach
	Thread.sleep(1000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER); 
	Thread.sleep(1000);
	String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div/div[1]/div/div/span/a/h3")).sendKeys(clicklnk);
	//driver.quit();
	
	
}
}
