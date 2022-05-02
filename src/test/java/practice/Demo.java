package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static WebDriver driver;
	public static void main(String[] args) {
		
			
			driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		//this is for login 
		System.out.println("login done");
		
		driver.manage().window().maximize();
		Dimension d = new Dimension(500,700);
		
		driver.manage().window().setSize(d);
		
		WebElement  wb= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		  wb.sendKeys("Bangalore Kundalahalli");
		  
		  System.out.println("Using Get text");
		  
		  System.out.println(wb.getText());
		
			

	}

}
