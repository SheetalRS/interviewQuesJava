package Config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Keywords.UIKeywords;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public RemoteWebDriver driver=null;
	public UIKeywords keyword=UIKeywords.getInstance();
			
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void setup(String browserName,String url){
		keyword.launchBrowser(browserName);
		driver=keyword.getDriver();
		driver.get(url);
		
	}
	
	@AfterTest
	public void tearDown(){
		System.out.println("Inside tearDown");
		driver=keyword.getDriver();
		driver.close();
	}

}
