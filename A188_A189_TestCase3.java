package crossandparallelbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class A188_A189_TestCase3 extends A188_A189_BM_AM_Test
{
	@Test
	public void mobiles()
	{
		WebElement e1=driver.findElement(By.linkText("Mobiles"));
		e1.click();
	}
}
