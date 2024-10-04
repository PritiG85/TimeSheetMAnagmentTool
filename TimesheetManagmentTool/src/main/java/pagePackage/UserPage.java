package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Flib;

public class UserPage extends Flib{
	// Declaration
	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement CreateNewUserButton;
	@FindBy(name = "username")
	private WebElement username;
	@FindBy(name = "passwordText")
	private WebElement password;
	@FindBy(name = "passwordTextRetype")
	private WebElement retypePassword;
	@FindBy(name = "firstName")
	private WebElement firstName;
	@FindBy(name = "lastName")
	private WebElement lastName;
	@FindBy(id = "right12")
	private WebElement modifiedTimeTrack;
	@FindBy(id = "right2")
	private WebElement manageCustomerandProject;
	@FindBy(id = "right1")
	private WebElement generateReports;
	@FindBy(id = "right5")
	private WebElement manageUsers;
	@FindBy(id = "right7")
	private WebElement managerBillingType;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createUsersButtton;
	@FindBy(xpath = "//input[contains(@value,' Cancel ')]")
	private WebElement cancelButton;

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewUserButton() {
		return CreateNewUserButton;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRetypePassword() {
		return retypePassword;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getModifiedTimeTrack() {
		return modifiedTimeTrack;
	}

	public WebElement getManageCustomerandProject() {
		return manageCustomerandProject;
	}

	public WebElement getGenerateReports() {
		return generateReports;
	}

	public WebElement getManageUsers() {
		return manageUsers;
	}

	public WebElement getManagerBillingType() {
		return managerBillingType;
	}

	public WebElement getSubmitButtton() {
		return createUsersButtton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
public void createNewUserMethod(String usn,String pwd,String fname,String lname) throws InterruptedException {
	Thread.sleep(1000);
	username.sendKeys(usn);
	Thread.sleep(1000);
	password.sendKeys(pwd);
	retypePassword.sendKeys(pwd);
	firstName.sendKeys(fname);
	lastName.sendKeys(lname);
	modifiedTimeTrack.click();
	manageCustomerandProject.click();
	generateReports.click();
	manageUsers.click();
	managerBillingType.click();
	createUsersButtton.click();
	
}
}
