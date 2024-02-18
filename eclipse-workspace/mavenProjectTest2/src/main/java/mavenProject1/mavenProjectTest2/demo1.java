package mavenProject1.mavenProjectTest2;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

//import org.testng.annotations.Test;

public class demo1 {
//	@Test

	public void buildingTestMethod() {

//	System.setProperty("webdriver.chrome.driver", " C:\BrowserStack\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.navigate().to("https://www.browserstack.com/");

	String verifyBrowserStackTitle = driver.getTitle();
	System.out.println(verifyBrowserStackTitle);
	//system.out.println();

//	assertEquals("Most Reliable App & Cross Browser Testing Platform | BrowserStack",verifyBrowserStackTitle);

	}

	}
