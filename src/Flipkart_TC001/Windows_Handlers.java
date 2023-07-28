package Flipkart_TC001;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows_Handlers {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//Single window//
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> WindowHnadles = driver.getWindowHandles();
		Iterator <String> Iteraor = WindowHnadles.iterator();

		String Parenthandle = Iteraor.next();
		String Childhandle = Iteraor.next();
		driver.switchTo().window(Childhandle);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Arfath");
		//driver.findElement(By.id("firstName")).sendKeys("Arfath");
		driver.switchTo().window(Parenthandle);
		System.out.println(WindowHnadles);
		System.out.println(Iteraor);
		Thread.sleep(3000);
		driver.close();

	}

}





