
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	String driverPath = "/home/lab/Lab/resources/";
	public WebDriver driver;
	
	@Test
	public void launchBrowser() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver");
		driver = new FirefoxDriver();
	}

	@Test
	public void openApplication() {
		driver.navigate().to("http://www.google.com");
	}
	
	@Test
	public void closeDriver() {
		if(driver!=null) {
			driver.close();
		}
	}
}