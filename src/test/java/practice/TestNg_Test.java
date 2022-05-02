package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Test {

	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test 
	public void verifypagetitle() {
		
		String title=driver.getTitle();
		System.out.println("Title of the page"+title);
		
		if (title.equals("aaa")) {
			
		}
		
	}
	
	@Test 
	public void verifypagetitle3() {
		
		String title=driver.getTitle();
		System.out.println("Title of the page"+title);
		
		if (title.equals("aaa")) {
			
		}
		
	}
	
	
	@Test 
	public void verifypagetitle2() {
		
		String title=driver.getTitle();
		System.out.println("Title of the page"+title);
		
		if (title.equals("aaa")) {
			
		}
		
	}
	@Test 
	public void verifypagetitle4() {
		
		String title=driver.getTitle();
		System.out.println("Title of the page"+title);
		
		if (title.equals("aaa")) {
			
		}
		
	}
	
	@Test 
	public void verifypagetitle5() {
		
		String title=driver.getTitle();
		System.out.println("Title of the page"+title);
		
		if (title.equals("aaa")) {
			
		}
		
	}
	
}
