package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement hover= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	hover.click();
	WebElement email = driver.findElement(By.id("ap_email"));
	email.click();
	email.sendKeys("+917038516594");
	WebElement con = driver.findElement(By.id("continue"));
	con.click();
	WebElement pass = driver.findElement(By.id("ap_password"));
	pass.click();
	pass.sendKeys("ABC");
	TakesScreenshot src= ((TakesScreenshot)driver);
	File srcfile = src.getScreenshotAs(OutputType.FILE);
	File destination1 = new File("C:\\Users\\61041845\\eclipse-workspace\\Interview\\SCRN\\amazon.png");
	FileUtils.copyFile(srcfile, destination1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.quit();
	
	
	
	
}
}
