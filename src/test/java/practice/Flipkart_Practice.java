package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Practice {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
		String str=driver.findElement(By.xpath("//div[@cel_widget_id='UPPER-RESULT_INFO_BAR-0']/h1/div/div/div/div/span")).getText();
		System.out.println(str);
		
	  String [] strarr=str.split(" ");
	  System.out.println("Test");
	  System.out.println(strarr[2]);
		
		
		
		}

}
