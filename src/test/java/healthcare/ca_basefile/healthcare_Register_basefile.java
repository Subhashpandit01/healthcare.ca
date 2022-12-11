package healthcare.ca_basefile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class healthcare_Register_basefile {
 
public WebDriver driver;
	
	@BeforeSuite
	public WebDriver launch() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://healthsnap.ca/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

	public WebDriver closepage() {
		
		driver.close();
		return driver;
		
	}
	
}
