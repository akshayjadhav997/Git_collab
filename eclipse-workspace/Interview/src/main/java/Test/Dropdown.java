package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver1 = new ChromeDriver();
	driver1.get("https://www.amazon.com/");
	driver1.manage().window().maximize();
	Select dropdown = new Select(driver1.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
	dropdown.selectByIndex(3);
	
	TakesScreenshot scrShot =((TakesScreenshot)driver1 );
	//Call getScreenshotAs method to create image file
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	//Move image file to new destination
	File DestFile=new File("C://Users//61041845//eclipse-workspace//Interview//SCRN//test.png");
	//Copy file at destination
	FileUtils.copyFile(SrcFile, DestFile);
	
	
	//driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverWait wait1 = new WebDriverWait(driver1,1);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	
	Actions a= new Actions(driver1);
	a.doubleClick();
	
	driver1.quit();
}
}
