package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTestCase;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class InvalidLoginTestCase extends BaseTestCase {
	@Test
	public void invalidLoginTC() throws IOException, EncryptedDocumentException, InterruptedException {
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");

		for (int i = 1; i < rc; i++) {
			lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0),
					flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
		}

	}

}
