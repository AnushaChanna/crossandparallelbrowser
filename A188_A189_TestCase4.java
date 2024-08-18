package crossandparallelbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class A188_A189_TestCase4 extends A188_A189_BM_AM_Test
{
	@Test
	public void hoverover()
	{
		WebElement h1=driver.findElement(By.linkText("EN"));
		Actions a1= new Actions(driver);
		a1.moveToElement(h1).perform();
	
		WebElement clickontelugu=driver.findElement(By.linkText("TE"));
		clickontelugu.click();
	}
}
