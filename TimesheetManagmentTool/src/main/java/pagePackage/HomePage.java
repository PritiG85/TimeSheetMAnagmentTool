package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[text()='Time-Track'] /ancestor :: a/descendant :: img")
	private WebElement time;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling ::  img")
	private WebElement report;
@FindBy(xpath = "//div[text()='Tasks']/following-sibling :: img") private WebElement taskTab;
	public WebElement getTaskTab() {
	return taskTab;
}

	@FindBy(xpath = "//div[text()='Users'] /ancestor :: a/descendant :: img")
	private WebElement users;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling :: img")
	private WebElement workSchedule;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling :: img")
	private WebElement setting;
	@FindBy(partialLinkText = "Logout")
	private WebElement logout;
	

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	
	public WebElement getTime() {
		return time;
	}

	public WebElement getReport() {
		return report;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getWorkSchedule() {
		return workSchedule;
	}

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getLogout() {
		return logout;
	}


}
