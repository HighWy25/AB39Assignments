package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Study/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a)[1]")).click();

	}

}
