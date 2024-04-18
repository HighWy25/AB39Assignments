package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Search_ById {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=	driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		search.sendKeys("Books");
		search.sendKeys(Keys.ENTER);
	}

}
