
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class mageLoginHL1 {

	@Test
	public void Demo1() throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adol-sys-410\\Downloads\\ujars\\chromedriver.exe");
		//WebDriver driver=new HtmlUnitDriver();
		WebDriver driver= new ChromeDriver(new ChromeOptions().setHeadless(true));
		driver.get("https://redis-testing.adoltech.com/");
		//WebElement e1=driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div/div/ol/li[1]/div/div/strong/a"));
		WebElement e1=driver.findElement(By.xpath("//a[contains(text(),'Charcoal Chicken Lunch or Dinner Packs in Doncaste')]"));
		e1.click();
		Thread.sleep(1000L);
		WebElement e2=driver.findElement(By.id("product-addtocart-button"));
		e2.sendKeys(Keys.ENTER);
		Thread.sleep(1000L);
				//driver.quit();
		
	}
}
