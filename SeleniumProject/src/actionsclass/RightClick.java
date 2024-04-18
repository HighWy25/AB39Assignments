package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement email=		driver.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(driver);
		a1.contextClick(email).perform();
	}

}
