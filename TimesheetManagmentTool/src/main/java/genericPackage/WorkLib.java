package genericPackage;

import java.util.Random;

import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTestCase{
	public int random() {
		Random r = new Random();
		int no = r.nextInt(1000);
		return no;
		
	}

	
}
