package crossandparallelbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class A188_A189_BM_AM_Test
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void LaunchAmazon(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeamazon() throws InterruptedException

	{
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	
	
}
