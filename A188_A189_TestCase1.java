package crossandparallelbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class A188_A189_TestCase1 extends A188_A189_BM_AM_Test
{
@Test
public void shoes()
{
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoes");
	e1.sendKeys(Keys.ARROW_DOWN );
	e1.sendKeys(Keys.ENTER);
}
}
