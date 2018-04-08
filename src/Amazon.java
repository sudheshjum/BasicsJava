package facebook;

import java.awt.Desktop.Action;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Opening the Mozilla Firefox Driver :
		System.setProperty("webdriver.gecko.driver", "D://SeleniumProject/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		//WebDriver driver = new FirefoxDriver(capabilities);
		WebDriver driver = new FirefoxDriver();
		
		// Opening the url "www.amazon.com" by using get method:
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath(".//a[@id='nav-link-accountList']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		WebElement order = element.findElement(By.linkText("Your Orders"));
		System.out.println("Your Order link is Displayed : "+order.isDisplayed());
		//Thread.sleep(7000);
		// Click on Sign in and Enter the valid id & password:
		driver.findElement(By.xpath(".//a[@id='nav-link-accountList']")).click();
		//driver.findElement(By.xpath(".//a[@id='nav-link-accountList']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("xyz@gmail.com");
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input")).click();
		
		// Take the USER input Password from the USER.
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("password");
		
		driver.findElement(By.id("signInSubmit")).click();		

	}

}
