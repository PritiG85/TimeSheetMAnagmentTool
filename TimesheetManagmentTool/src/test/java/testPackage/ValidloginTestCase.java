package testPackage;

import java.io.IOException;
import org.testng.annotations.Test;
import genericPackage.BaseTestCase;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;

public class ValidloginTestCase extends BaseTestCase {

	@Test
	public void loginTestCase() throws IOException, InterruptedException {

		Flib flib = new Flib();
		LoginPage lb = new LoginPage(driver);
		lb.validLoginMethod(flib.readDataFromProperty(PROP_PATH,"username"),flib.readDataFromProperty(PROP_PATH, "password"));

		HomePage hp = new HomePage(driver);
		hp.getUsers().click();
		hp.getLogout().click();
	}

}
