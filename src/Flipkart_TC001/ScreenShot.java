package Flipkart_TC001;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver",
	"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
    driver.findElement(By.name("txtUserName")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    driver.findElement(By.name("Submit")).click();
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest = new File
    ("C:\\Users\\Lenovo\\eclipse-workspace\\Practice\\ScreenShot\\Test.png");
    FileUtils.copyFile(src, dest);
    System.out.println("Screenshot Successfully");
    driver.quit();
    
	}

}
