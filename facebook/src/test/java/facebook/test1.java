package facebook;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fb_Main.home;
import fb_Main.login;
import utils.base;
import utils.utility;

public class test1 extends base{
	int testID;
	WebDriver driver;
	login log;
	home hme;
@BeforeClass
public void all_objects() {
	
	driver=openChromeBrowser();
	log=new login(driver);
	hme=new home(driver);
	
	driver.get("https://www.facebook.com/");
	
}
@BeforeMethod
public void login_page() throws EncryptedDocumentException, IOException, InterruptedException {
	driver.get("https://www.facebook.com/");
	String un = utility.getExcelData("Sheet1", 0, 0);
	String pw = utility.getExcelData("Sheet1", 0, 1);
	log.enter_credentials(un, pw);

	log.enter();
	
}
@Test
public void validate_home_page() throws InterruptedException {
	testID=123;
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
}
@Test
public void validate_home_page1() throws InterruptedException {
	testID=124;
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
}
@AfterMethod
public void logout_(ITestResult ss) throws InterruptedException, IOException {
	if(ITestResult.FAILURE==ss.getStatus()) {
	utility.captureScreenSHot(driver, testID);}
	
	hme.logout_navigate();
	hme.logout();
	hme.final_logouts();
}
@AfterClass
public void close_browser() {
	System.out.println("this is after methpd");
}
}
