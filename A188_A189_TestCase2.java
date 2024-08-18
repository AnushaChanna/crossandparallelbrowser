package crossandparallelbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class A188_A189_TestCase2 extends A188_A189_BM_AM_Test
{
	@Test
	public void dropdownbooks()
	{
		WebElement e2= driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e2);
		s1.selectByValue("search-alias=stripbooks");
		WebElement e3=driver.findElement(By.id("twotabsearchtextbox"));
		e3.sendKeys("comedy books");
		e3.sendKeys(Keys.ENTER);
		
	}
}
