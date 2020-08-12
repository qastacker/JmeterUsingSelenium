import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mageBl{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adol-sys-410\\Downloads\\ujars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://elastic-demo.magemint.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Create an Account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("First");
		driver.findElement(By.id("lastname")).sendKeys("Last");
		driver.findElement(By.name("email")).sendKeys("tester@adolmedia.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Tester@#123");
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Tester@#123");
		System.out.println("Proceed to click");
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
		
	}

}
