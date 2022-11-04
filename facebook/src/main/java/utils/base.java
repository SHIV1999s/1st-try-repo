package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class base {
public static WebDriver openChromeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	return driver;
	}

public static WebDriver openOperaBrowser() {
	System.setProperty("webdriver.opera.driver", "C:\\Users\\shivj\\Downloads\\operadriver_win64\\operadriver.exe");
	WebDriver driver=new OperaDriver();
	return driver;
	}
public static WebDriver openFireFoxBrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shivj\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	return driver;
	}
public static void main(String[] args) {
	openChromeBrowser().get("https://www.google.com");;
}
}
