package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_E2E {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoe");
		search.sendKeys(Keys.ENTER);
		WebElement shoeSearch=driver.findElement(By.xpath("//img[@data-image-index='6']"));
		shoeSearch.click();
		WebElement shoeSearch1=driver.findElement(By.xpath("//img[@data-image-index='10']"));
		shoeSearch1.click();
		//WebElement addToCart= driver.findElement(By.className("//input[@name='submit.add-to-cart']"));
		//addToCart.click();
		driver.get("https://www.amazon.in/Campus-Ignite-PRO-Running-Shoes/dp/B09VH53R5R/ref=sr_1_10?crid=YEY72VR0UORD&dib=eyJ2IjoiMSJ9.0vwPko9jKjIRTp5pKil1DpO7WNuyDAVVjPORXNgeQNz3Htopg2me0NxQ3MSQK5Huvz-BB3FRD3dMGg-RWyIDlyoIhXALIOq-zFQ1bkPvNnQQrIabJRaAFb00ipd48aVVCOR42le8qfcFeMLYwvx27AFu2te5vYWf9JHBX2TOj8PpY6XGiw2ker8s41GNtMS0HMsvKl7dniIbYsW-S-kbD_g6olRgRX5GcLgw3XILY2oaA2w6W2p7qr8D07O_YKwyKZpBgAIPuxu_6_dKhKF_SM3wx1dsc8_p63WhTIB4_i8.hyQXs5eWeofMm68Zlj2pqrHVwB4ZlxCOsUFY_trdSD4&dib_tag=se&keywords=Shoe&qid=1712672696&sprefix=shoe%2Caps%2C149&sr=8-10");
		WebElement buyNow= driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buyNow.click();
	}

}
