package tagnamelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open Amazon.in locate the element with the tagname 'a' and perform click action
 * check if its clicking the first element
 * is it clicking all elements
 * random element will be clicked
 * throws exception 
 * check the result
 * it wil come as Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
 */
public class Amazon {
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement tagName=	driver.findElement(By.tagName("a"));
		tagName.click();
	}

}
