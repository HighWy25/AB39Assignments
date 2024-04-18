package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShoesSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		Thread.sleep(12000);
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("Shoes");
		driver.findElement(By.xpath("(//div)[20]")).click();
		driver.findElement(By.xpath("//div[@class=\"a-section aok-relative s-image-tall-aspect\"][1]")).click();
		driver.quit();
	}

}
