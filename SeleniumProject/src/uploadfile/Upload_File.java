package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement upload =driver.findElement(By.xpath("//input[@id='file']"));
		upload.sendKeys("C:\\Users\\user\\Desktop\\Assignments");
		driver.quit();
	}

}
