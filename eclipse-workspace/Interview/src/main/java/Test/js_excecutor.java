package Test;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class js_excecutor {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	//WebDriverManager.firefoxdriver().setup();
	//WebDriver driver2 = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement searchbox= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	searchbox.clear();
	searchbox.click();
	driver.switchTo().activeElement().sendKeys("xyz");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
}
}
