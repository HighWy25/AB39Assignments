package navigate;
//navigate methods back,forward,refresh
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Back {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");//this can also be done instead of Get method
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
