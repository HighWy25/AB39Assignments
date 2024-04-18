package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("stbymkt@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();

	}

}
