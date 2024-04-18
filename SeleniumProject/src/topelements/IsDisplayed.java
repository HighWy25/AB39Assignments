package topelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));//search bar
		//search.sendKeys("India");
		if (search.isDisplayed()==true && search.isEnabled()==true)
		{
			search.sendKeys("India");
		}
	}

}








