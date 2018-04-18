import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actionsOnIG {

	//sets up account to auto follow on

	//auto follows for 100 people

	public static void follow100() throws InterruptedException{

	

		WebElement followButton = driverIG.getDriver().findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/ul/div/li[1]/div/div[2]/span/button"));
		for (int i = 0; i <=3; i++){
			followButton.click();
			Thread.sleep(1000);
		}

	}


	//auto unfollows from your list for 100 people


	//saves your current list of followed so that auto unfollows can't unfollow your friends


	//auto actions without user input such as auto follow every 8am. 


	//to swap accounts so you can enter a list of accounts and have all of them auto follow without
	//re logging in and out. 


}
