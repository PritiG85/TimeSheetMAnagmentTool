package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.BaseTestCase;

public class LoginPage extends BaseTestCase {
	@FindBy(name = "username") private WebElement usntbb;
	@FindBy(name = "pwd") private WebElement pwdtb;
	@FindBy(id = "loginButton") private WebElement loginButton;
	@FindBy(name = "remember") private WebElement remembermeChechBox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actimindLink;
	
	
	public WebElement getActimindLink() {
		return actimindLink;
	}


	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}


	public WebElement getUsntbb() {
		return usntbb;
	}


	public WebElement getPwdtb() {
		return pwdtb;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getRemembermeChechBox() {
		return remembermeChechBox;
	}
	public void validLoginMethod(String username,String password) throws InterruptedException
	{
		usntbb.sendKeys(username);
		Thread.sleep(1000);
		pwdtb.sendKeys(password);
		Thread.sleep(1000);
		loginButton.click();
		
	}
	public void invalidLoginMethod(String username,String password) throws InterruptedException
	{
		usntbb.sendKeys(username);
		Thread.sleep(1000);
		pwdtb.sendKeys(password);
		Thread.sleep(1000);
		loginButton.click();
		Thread.sleep(1000);
		usntbb.clear();
	}
	
	
}
