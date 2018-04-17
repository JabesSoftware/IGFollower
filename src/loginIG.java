import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class loginIG {

	public static void login(String userName, String passWord) {

		//gets driver to make Firefox work and loads IG login page.
		WebDriver driverReturned = driverIG.getDriver();
		driverReturned.get("https://www.instagram.com/accounts/login/");

		//allows the page to finish building all frames (otherwise you will get a 
		//NoElementException error). 
		driverReturned.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		//finds the id of the text area and sends username/pass to each text area
		WebElement userArea = driverReturned.findElement(By.xpath("//input[@name='username']"));
		userArea.sendKeys(userName);
		WebElement userPass = driverReturned.findElement(By.xpath("//input[@name='password']"));
		userPass.sendKeys(passWord);

	}
	//ask if username and password will be saved for future
}
