package google;
/*
 * launch Chrome browser
 * Navigate to Google
 * Type India in text field
 * click on search button
 */
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_One {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
		

	}

}
