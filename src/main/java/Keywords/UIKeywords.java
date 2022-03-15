package Keywords;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	
	public RemoteWebDriver driver=null;
	public static UIKeywords keyword=null;
	
	static {
		keyword= new UIKeywords();
	}
	private UIKeywords() {
		
	}
	public static UIKeywords getInstance() {
		return keyword;
	}
	
	public void launchBrowser(String browserName) {
		System.out.println("Inside setup");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			this.driver= new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			this.driver= new FirefoxDriver();
		}else {
			System.out.println("Enter browseName either chrome or firefox");
		}
	}
	
	public RemoteWebDriver getDriver() {
		return driver;
	}
	
	public void getBrokenLinks(String linkUrl,WebElement webElement) {
		
		try {
			URL url= new URL(linkUrl);
			HttpURLConnection httpConnection=(HttpURLConnection)url.openConnection();
			httpConnection.setConnectTimeout(5000);
			int  resCode=httpConnection.getResponseCode();
			if (resCode>400) {
				System.out.println(webElement.getText());
				System.out.println(url +" "+ httpConnection.getResponseMessage());
			} else {
				//System.out.println(url +" "+ httpConnection.getResponseMessage() + " Link is not Broken");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
