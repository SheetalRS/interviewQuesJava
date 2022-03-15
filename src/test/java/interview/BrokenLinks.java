package interview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.testng.annotations.Test;

import Config.base;
import Keywords.UIKeywords;

public class BrokenLinks extends base{
	
	public UIKeywords keyword=UIKeywords.getInstance();
	
	
	public BrokenLinks(){
		PageFactory.initElements(driver, this);
	}
	@Test
	public void brokenLinksTest(){
		
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		System.out.println(l.size());
		for (WebElement webElement : l) {
			String linkUrl=webElement.getAttribute("href");
			
			if (linkUrl.startsWith("https:")) {
				
				keyword.getBrokenLinks(linkUrl,webElement);
				
			} else {
				System.out.println(webElement.getText());
				System.out.println("invalid Url "+linkUrl);
			}
			
			
			
		}
		
	}

}
