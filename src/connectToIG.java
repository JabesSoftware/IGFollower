import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class connectToIG {

    public WebDriver driverConnect(String string)

    { //gets driver to make Firefox work and loads IG login page.
        System.setProperty("webdriver.gecko.driver","C:\\Users\\gabes\\IdeaProjects\\geckodriver.exe");
        WebDriver driverIG = new FirefoxDriver();
          driverIG.get(string);
        return driverIG;
    }
}
	

