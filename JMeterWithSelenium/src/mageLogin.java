
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class mageLogin {

	@Test
	public void Demo() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\Adol-sys-410\\Downloads\\ujars\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adol-sys-410\\Downloads\\ujars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		// driver.get("https://firstbyte-testing.adoltech.com");
		driver.get("https://redis-testing.adoltech.com/");	
		driver.findElement(By.xpath("//a[contains(text(),'Charcoal Chicken Lunch or Dinner Packs in Doncaste')]")).click();
		Thread.sleep(1000L);
		driver.findElement(By.id("product-addtocart-button")).sendKeys(Keys.ENTER);
		Thread.sleep(1000L);
		WebElement msg=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		String text=msg.getText();
		System.out.println(text);
//		driver.quit();
		// driver.findElement(By.id("product-addtocart-button")).click();
	}
}
