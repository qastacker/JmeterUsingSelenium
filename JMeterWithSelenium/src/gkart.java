import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adol-sys-410\\Downloads\\ujars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String[] items= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		

		List<WebElement> product=driver.findElement(By.cssSelector("h4.product-name"));
		for (int i=0; i<product.size(); i++) {

			String[] name=product.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			List reqproduct=Arrays.asList(items); 
			int j=0;
			if (reqproduct.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j==3) {
					break;
				}
			}

		}

	}

}
