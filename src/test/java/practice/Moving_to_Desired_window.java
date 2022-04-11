package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Moving_to_Desired_window {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
       
		
		  driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		  String parentwindowId= driver.getWindowHandle();
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		 
		 Set<String> handles= driver.getWindowHandles();
		 
		 List<String> hList=new ArrayList<String>(handles);
		 
		 if(SwitchToRightwindow("Facebook", hList)) {
		 System.out.println(driver.getCurrentUrl()+" ; "+driver.getTitle());
		 
		 driver.close();
		 }
		 
		 switchtoParentWindow(parentwindowId);
		 
		 System.out.println(driver.getCurrentUrl()+" ; "+driver.getTitle());
		 
		 }
	
	public static void switchtoParentWindow(String parentwindowId) {
		driver.switchTo().window(parentwindowId);
		
	}
	
	
	
	public static boolean SwitchToRightwindow(String windowTitile,List<String>hList) throws InterruptedException {
		for(String e:hList) {
			Thread.sleep(5000);
			
			String Title= driver.switchTo().window(e).getTitle();
		    System.out.println(Title);
			if(Title.contains(windowTitile)) {
				System.out.println("found right  window ");
				return true;
			}
		}
		return false;
		
	
	}


}
