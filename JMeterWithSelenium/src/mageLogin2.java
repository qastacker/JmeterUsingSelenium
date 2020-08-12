
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class mageLogin2 {

	@Test
	public void Demo() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\Adol-sys-410\\Downloads\\ujars\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adol-sys-410\\Downloads\\ujars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		WebElement clickElement=driver.findElement(By.id("button1"));

		for (int i=0; i<3; i++) {
			clickElement.click();
			Thread.sleep(3000);
		}
	}
}
