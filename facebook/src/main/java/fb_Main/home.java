package fb_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	@FindBy(xpath="//div[@aria-label=\"More options\"]")private WebElement navigate_to_log;
	@FindBy(xpath="//span[text()='Log Out']")private WebElement logout;
	@FindBy(xpath="//span[text()='Log Out']")private WebElement final_logout;
//thisis pull request
	
	public home(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	public void logout_navigate() throws InterruptedException {
		navigate_to_log.click();
		Thread.sleep(1000);
			}
	
	public void logout() {
logout.click();
	}
	public void final_logouts() {
		final_logout.click();
		}

}
