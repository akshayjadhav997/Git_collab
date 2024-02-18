package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
public static void main(String[] args) throws MalformedURLException {
	WebDriverManager.chromedriver().setup();
	URL	url =new URL("https://www.google.com/");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	//System.out.println(driver.getTitle());
	System.out.println(url.getHost());
	driver.manage().window().maximize();
	String originalw = driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.WINDOW);
	
	driver.get("https://www.youtube.com/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	
	
	
	//driver.close();
	driver.switchTo().window(originalw);
	System.out.println(driver.getTitle());
	driver.quit();
}
}
