package Flipkart_TC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver",
		"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//*[@id=\"navbtn_exercises\"]/i[1]")).click();
		Thread.sleep(3000);
		driver.quit();
		


	}

}
