package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class TaskPage {
@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement projectAndCustomersLink;
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement CreateNewCustomerButton;
	@FindBy(name = "name") private WebElement CustomerName;
	@FindBy(name = "createCustomerSubmit") private WebElement createCutomerSubmitButton;
	@FindBy(xpath = " //input[contains(@value,'  Cancel')]") private WebElement createCutomerCancelButton;
	
	@FindBy(xpath = "//input[@value='Create New Project']") private WebElement createNewProjectLink;
	@FindBy(name = "customerId") private WebElement customerDropdown;
	@FindBy(name = "name") private WebElement projectNameTb;
	@FindBy(xpath = "//input[@name='createProjectSubmit']") private WebElement createProjectSubmitButton;
	@FindBy(xpath = "//input[contains(@value,'  Cancel ')]   ") private WebElement createProjectCancelButton;
	
	
	@FindBy(linkText = "All") private WebElement allCustomersAndPrjectLink;
	@FindBy(xpath = "//input[@value='Delete Selected']") private WebElement deleteSelectedCustomer;
	@FindBy(xpath = "//input[@value='Archive Selected']") private WebElement archiveProject;
	@FindBy(xpath = "//input[@id='deleteButton']") private WebElement deleteThisCustomerPopUps;
	
	
	@FindBy(id = "deleteButton") private WebElement deletePopup;
	
	public WebElement getProjectNameTb() {
		return projectNameTb;
	}


	public WebElement getDeletePopup() {
		return deletePopup;
	}


	public WebElement getAllCustomersAndPrjectLink() {
		return allCustomersAndPrjectLink;
	}


	public WebElement getDeleteSelectedCustomer() {
		return deleteSelectedCustomer;
	}


	public WebElement getDeleteThisCustomerPopUps() {
		return deleteThisCustomerPopUps;
	}


	public WebElement getArchiveProject() {
		return archiveProject;
	}


	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getProjectAndCustomersLink() {
		return projectAndCustomersLink;
	}


	public WebElement getCreateNewCustomerButton() {
		return CreateNewCustomerButton;
	}


	public WebElement getCustomerName() {
		return CustomerName;
	}


	public WebElement getCreateCutomerSubmitButton() {
		return createCutomerSubmitButton;
	}


	public WebElement getCreateCutomerCancelButton() {
		return createCutomerCancelButton;
	}


	public WebElement getCreateNewProjectLink() {
		return createNewProjectLink;
	}


	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}


	public WebElement getProjectName() {
		return projectNameTb;
	}


	public WebElement getCreateProjectSubmitButton() {
		return createProjectSubmitButton;
	}


	public WebElement getCreateProjectCancelButton() {
		return createProjectCancelButton;
	}
	public void createCutomer(String cName) throws InterruptedException
	{
		Thread.sleep(1000);
		projectAndCustomersLink.click();
		Thread.sleep(1000);
		CreateNewCustomerButton.click();
		Thread.sleep(1000);
		CustomerName.sendKeys(cName);
		Thread.sleep(1000);
		createCutomerSubmitButton.click();	
	}
	public void creadProject(String customerName,String projectName) throws InterruptedException {
		Thread.sleep(1000);
		projectAndCustomersLink.click();
		Thread.sleep(1000);
		createNewProjectLink.click();
		
		Select sel = new Select(customerDropdown);
		Thread.sleep(1000);
		sel.selectByVisibleText(customerName);
		Thread.sleep(1000);
		projectNameTb.sendKeys(projectName);
		Thread.sleep(5000);
		createProjectSubmitButton.click();
	}
	public void deleteProjectAndCutomer() throws InterruptedException {
		Thread.sleep(1000);
		projectAndCustomersLink.click();
		Thread.sleep(1000);
		allCustomersAndPrjectLink.click();
		Thread.sleep(1000);
		deleteSelectedCustomer.click();
		
		deletePopup.click();
	}
	
}
