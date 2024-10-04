package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTestCase;
import genericPackage.Flib;
import genericPackage.WorkLib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;

public class CreateUserManager extends BaseTestCase{
@Test
	public  void createUserManagerTC() throws IOException, InterruptedException {
		
		Flib flib= new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readDataFromProperty(PROP_PATH, "username"), flib.readDataFromProperty(PROP_PATH, "password"));
HomePage hp = new HomePage(driver);
		hp.getUsers().click();
		
	UserPage up = new UserPage(driver);
	up.getCreateNewUserButton().click();
	
	WorkLib wl = new WorkLib();
	int no = wl.random();
	
	String usn = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 0);
	String pwd = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 1);
	String fname = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 2);
	String lname = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 3);
	
	up.createNewUserMethod(usn+no, pwd+no ,fname+no, lname+no);
	
	
	}

}
