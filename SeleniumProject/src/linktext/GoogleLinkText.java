package linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkText {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(12000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();

	}

}
