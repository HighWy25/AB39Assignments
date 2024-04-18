package classnamelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement WebElement = driver.findElement(By.className("gLFyf"));
		WebElement.sendKeys("Hungary");
	}

}
