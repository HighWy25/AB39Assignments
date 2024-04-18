package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("Shoe");
		List<WebElement> auto = driver.findElements(By.xpath("//input[@id='nav-bb-search']"));
		Thread.sleep(3000);
		int count = auto.size();
		Thread.sleep(3000);
		System.out.println(count);
	}

}
