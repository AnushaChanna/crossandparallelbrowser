package crossandparallelbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class A188_A189_TestCase5 extends A188_A189_BM_AM_Test
{
	@Test
	public void clickonfashion()
	
	{
		WebElement click = driver.findElement(By.linkText("Fashion"));
		click.click();
	}
}
