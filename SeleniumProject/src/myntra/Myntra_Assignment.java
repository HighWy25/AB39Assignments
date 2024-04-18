package myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Assignment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.cssSelector(".desktop-searchBar"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		WebElement shoeselection=driver.findElement(By.partialLinkText("Mast & Harbour Men White Striped Sneakers"));
		shoeselection.click();
	}
	
	
	

}
