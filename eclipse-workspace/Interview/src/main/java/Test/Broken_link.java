package Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_link {
public static void main(String[] args) throws UnknownHostException, MalformedURLException , IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.ggogle.com/");
	URL url =new URL("https://www.ggogle.com/");
	HttpURLConnection http= (HttpURLConnection) url.openConnection();
	http.connect();
	int statuscode = http.getResponseCode();
	if(statuscode == 200) {
		System.out.println("Link not broken");
	}else {
		System.out.println("Broken");
	}
	driver.quit();
	}
}
