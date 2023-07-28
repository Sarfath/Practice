package Flipkart_TC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_101_Verification_Mouseover {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/a/span"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		WebElement ele1=driver.findElement(By.linkText("Data Import/Export"));
		Thread.sleep(5000);
		act.moveToElement(ele1).perform();
		WebElement ele2= driver.findElement(By.linkText("Export"));
		act.moveToElement(ele2).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}

}
