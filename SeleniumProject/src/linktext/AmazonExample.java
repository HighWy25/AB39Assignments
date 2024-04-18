package linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExample {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(12000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobiles")).click();

	}

}
