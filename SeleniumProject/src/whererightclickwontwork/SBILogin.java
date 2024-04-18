package whererightclickwontwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//where right click wont work we use F12 and then top left arrow to inspect the element
public class SBILogin {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement login=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		login.click();
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("Sana");
		//driver.switchTo().alert().accept();//yes, if alert is there can make use of it
		WebElement pw= driver.findElement(By.id("label2"));
		pw.sendKeys("Sana");
		Thread.sleep(10000);
		WebElement button=driver.findElement(By.id("Button2"));
		button.sendKeys(Keys.ENTER);
		String s1=driver.getTitle();
		//String s1 =driver.getWindowHandle();
		System.out.println(s1);
		
	}

}
