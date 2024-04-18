package launch.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://otter.ai/");
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close(); will close the parent or current browser which has control
		driver.quit();//this will close all the parent and child browsers
	}

}
