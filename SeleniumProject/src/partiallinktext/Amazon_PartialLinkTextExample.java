package partiallinktext;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_PartialLinkTextExample {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Service")).click();
		driver.quit();
	}

}
