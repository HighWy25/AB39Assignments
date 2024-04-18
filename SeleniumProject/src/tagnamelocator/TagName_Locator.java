package tagnamelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//finding the tagname for the HTML file which MKT shared over
public class TagName_Locator {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Study/learningHTML1.html");
		driver.switchTo().alert().accept();//yes
		driver.manage().window().maximize();
		WebElement tag=	driver.findElement(By.tagName("a"));
		tag.click();
		driver.navigate().back();
		driver.switchTo().alert().accept();//yes
		Actions a1= new Actions(driver);
		a1.contextClick(tag).perform();//suppose to perform right click on the link but its not working as expected will check
		

	}

}
