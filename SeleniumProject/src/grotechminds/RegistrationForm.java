package grotechminds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("email")).sendKeys("stbymkt@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("Present-Address")).sendKeys("1234");
		driver.findElement(By.id("Permanent-Address")).sendKeys("1234");
		driver.findElement(By.id("Pincode")).sendKeys("1234");
		driver.findElement(By.className("btn btn-primary")).click();
	}

}
