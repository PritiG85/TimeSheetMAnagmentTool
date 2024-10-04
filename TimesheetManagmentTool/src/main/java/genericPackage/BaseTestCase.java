package genericPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTestCase extends Flib implements IAutoConstant {
	
	public static WebDriver driver;
	
	public void setUp() throws IOException
	{
	Flib flib = new Flib();
	String browservalue=flib.readDataFromProperty(PROP_PATH, "browser1");
	String url = flib.readDataFromProperty(PROP_PATH, "url");
	
	
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		driver =new ChromeDriver();
	}
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browservalue.equalsIgnoreCase("edge"))
	{
	driver=new EdgeDriver();
	}
	else
	{
		System.out.println("enter valid Browser name !!!");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
	driver.get(url);
	}
	public void tearDown()
	{
	driver.quit();
	}
}
