package Flipkart_TC001;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Hnadlers {

	
	
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			driver.findElement(By.id("newWindowBtn")).click();
			Set<String> Windowhandles = driver.getWindowHandles();
			Iterator <String> iterator= Windowhandles.iterator();
			String parentwindowhandle = iterator.next();
			String Childwindowhandle =iterator.next();
			driver.switchTo().window(Childwindowhandle);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.id("firstName")).sendKeys("Arfath");
			driver.findElement(By.id("lastName")).sendKeys("Khan");
			Thread.sleep(3000);
			driver.switchTo().window(parentwindowhandle);
			driver.quit();
		
	}

}
