package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SearchBySubString {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement className=driver.findElement(By.cssSelector("textarea[id^='APjF']"));//substring where we can give partial of the Attribute Value
		className.sendKeys("Hungary");
		className.sendKeys(Keys.ENTER);

	}

}
