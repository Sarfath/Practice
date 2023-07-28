package Flipkart_TC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver",
		"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			WebElement Admin = driver.findElement(By.linkText("Admin"));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(Admin).perform();
			Thread.sleep(3000);
WebElement DataImportExport = driver.findElement(By.linkText("Data Import/Export"));
Thread.sleep(3000);
action.moveToElement(DataImportExport).perform();
Thread.sleep(3000);
driver.findElement(By.linkText("Export")).click();
Thread.sleep(3000);
driver.quit();

	}

}
