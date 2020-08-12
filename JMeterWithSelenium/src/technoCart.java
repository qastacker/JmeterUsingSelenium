import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class technoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adol-sys-410\\Downloads\\ujars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		 /* ChromeOptions options=new ChromeOptions();
		  options.addArguments("--headless"); 
		  ChromeDriver driver=new ChromeDriver(options);
*/		 
		 
		//WebDriver driver= new ChromeDriver(new ChromeOptions().setHeadless(true));
		driver.get("https://www.technocart.adoltech.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(1000);
		
		Actions actions = new Actions(driver);
		WebElement covid19 = driver.findElement(By.xpath("//span[contains(text(),'Covid19')]"));
		actions.moveToElement(covid19);
		
		WebElement subMenu = driver.findElement(By.xpath("//a[@class='title-cat-mega-menu']//span[contains(text(),'Face Masks')]"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		
		//System.out.println(subMenu.getText());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement mask = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Non-Woven 3Ply Face Mask with Nose Clip and SSMMS')]")));
		//WebElement mask = driver.findElement(By.xpath("//a[contains(text(),'Non-Woven 3Ply Face Mask with Nose Clip and SSMMS')]"));
		System.out.println(mask.getText());
		
		js.executeScript("window.scrollBy(0,250)", mask);
		
		mask.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement qty_up = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("qty-up")));
		WebElement qty_up = driver.findElement(By.className("qty-up"));
		WebElement buy_now = driver.findElement(By.id("product-addtocart-button"));
		//WebElement buy_now = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
		 
		 js.executeScript("window.scrollBy(0,200)", buy_now);
		 
		 Thread.sleep(2000);
		 
		 for(int i=1;i<=5;i++) { qty_up.click(); }
		 
		 Thread.sleep(1000);
		 
		 buy_now.click();
		 WebElement view_cart=driver.findElement(By.xpath("//a[@class='button btn-viewcart']"));
		  
		 Thread.sleep(1000);
		 view_cart.click();
		 
		 WebElement subTotal=driver.findElement(By.xpath("//td[@class='col subtotal']/span/span/span"));
		 WebElement Total=driver.findElement(By.xpath("//tr[@class='grand totals']//td[@class='amount']/strong/span"));
		 System.out.println(subTotal.getText());
		 System.out.println(Total.getText());
	}
}
		 