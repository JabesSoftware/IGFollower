import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class loginIG {
	
	public static void login(String userName, String passWord, String account) throws InterruptedException {

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
		
		//pauses for a second then clicks log in button/
		driverReturned.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement clickLogIn = driverReturned.findElement(By.xpath("/html/body/span/section/main/div/article/div/div[1]/div/form/span[1]/button"));
		clickLogIn.click();
		
		Thread.sleep(5000);

		driverReturned.navigate().to("https://www.instagram.com/" + account);
		WebElement accessFollowers = driverReturned.findElement(By.xpath("/html/body/span/section/main/article/header/section/ul/li[2]/a"));
		accessFollowers.click();
		Thread.sleep(5000);
		
	}
	//ask if username and password will be saved for future
}
