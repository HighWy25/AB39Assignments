package cssselector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SearchByTagNameClassName {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement className=driver.findElement(By.cssSelector(" textarea.gLFyf"));
		className.sendKeys("Hungary");
		className.sendKeys(Keys.ENTER);


	}

}
