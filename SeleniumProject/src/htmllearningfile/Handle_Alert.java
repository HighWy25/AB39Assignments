package htmllearningfile;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alert {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Study/learningHTML1.html");
		driver.switchTo().alert().accept();//yes
		//driver.switchTo().alert().dismiss()//no
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("IamMKT");

	}

}
