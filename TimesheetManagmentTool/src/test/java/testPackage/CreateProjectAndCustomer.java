package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTestCase;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskPage;

public class CreateProjectAndCustomer extends BaseTestCase {
	@Test
	public void createNewProjectManagerTC() throws IOException, InterruptedException {
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		String usn = lp.readDataFromProperty(PROP_PATH, "username");
		String pwd = lp.readDataFromProperty(PROP_PATH, "password");
		lp.validLoginMethod(usn, pwd);

		HomePage hp = new HomePage(driver);
		hp.getTaskTab().click();
		TaskPage tp = new TaskPage(driver);
		tp.createCutomer(flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 0));
		tp.creadProject(flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 0),flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 1));

		Thread.sleep(2000);
		tp.deleteProjectAndCutomer();
		

	}

}
