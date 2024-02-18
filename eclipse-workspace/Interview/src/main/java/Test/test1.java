package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[]args) throws InterruptedException, AWTException, IOException {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");

		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search.click();
		search.clear();
		search.sendKeys("Testing");
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyPress(KeyEvent.VK_DOWN);
		
		List<WebElement> L1 = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul"));
		for(int i=0; i<L1.size() ; i++) {
			String auto = L1.get(i).getText();
			System.out.println(auto);
		}
		System.out.println("list is " + L1);
		Thread.sleep(0);
		WebElement t1= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		t1.click();
		WebElement serchicon= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		serchicon.click();
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
		
	}
}
