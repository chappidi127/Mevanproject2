package practice;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Links;

public class Broken_Links {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for(int i=0;i<links.size();i++) {
			
			
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			VerifyActivelink(url);
			
			
			
		}

	}
	
	public static void VerifyActivelink(String linkurl) {
		
		
		try {
			URL  url= new URL(linkurl);
			
			HttpsURLConnection  httpsURLConnect= (HttpsURLConnection)url.openConnection();
			httpsURLConnect.setConnectTimeout(3000);
			httpsURLConnect.connect();
			
			
			if(httpsURLConnect.getResponseCode()==200) {
				System.out.println(linkurl+"_"+httpsURLConnect.getResponseMessage());
				
			}
			
			if(httpsURLConnect.getResponseCode()==HttpsURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkurl+"_"+httpsURLConnect.getResponseMessage()+"-"+HttpsURLConnection.HTTP_NOT_FOUND);
				
			}
			
			
			
			
		}
		
		catch (Exception e){
			
		}
	}
	

}
