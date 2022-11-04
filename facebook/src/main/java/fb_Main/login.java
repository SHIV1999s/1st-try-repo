package fb_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
@FindBy(xpath="//input[@id=\"email\"]")private WebElement un;
@FindBy(xpath="//input[@id=\"pass\"]")private WebElement pass;
@FindBy(xpath="//button[@value=\"1\"]")private WebElement button;

public login(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

public void enter_credentials(String userid,String password) {
un.sendKeys(userid);
pass.sendKeys(password);
}
public void enter() {
	button.click();

}

}
