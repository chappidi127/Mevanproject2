package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genaric_Method_Click_Button {
	public static WebDriver driver;
	
	
	public static void clickButton(String Xpath) {
		driver.findElement(By.xpath(Xpath)).click();;
		
	}

	public static void main(String[] args) {
		driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 clickButton("//img[@alt='LinkedIn OrangeHRM group']");
		 clickButton("//img[@alt='OrangeHRM on Facebook']");
		 clickButton("//img[@alt='OrangeHRM on youtube']");
		 clickButton("//img[@alt='OrangeHRM on twitter']");
		 
		 System.out.println("Test 12512");
		 
		
		

	}

}
