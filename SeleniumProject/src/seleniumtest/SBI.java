package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBI {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement an=driver.findElement(By.xpath("//input[@id='accountNo']"));
		an.sendKeys("8574985874");
		WebElement cif=driver.findElement(By.xpath("//input[@id='cifNo']"));
		cif.sendKeys("54785");
		WebElement bc=driver.findElement(By.xpath("//input[@id='branchCode']"));
		bc.sendKeys("87541");
		WebElement dd = driver.findElement(By.xpath("(//select)[1]"));
		Select s1 = new Select(dd);
		s1.selectByIndex(3);
		WebElement mn=driver.findElement(By.xpath("//input[@id='mobileNo']"));
		mn.sendKeys("748585652147");
		WebElement em=driver.findElement(By.xpath("//input[@id='emailId']"));
		em.sendKeys("stbymkt@gmail.com");
		WebElement dd1 = driver.findElement(By.xpath("(//select)[1]"));
		Select s2 = new Select(dd1);
		s2.selectByIndex(1);
		Thread.sleep(5000);
		
	}

}
