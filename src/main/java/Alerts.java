import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		driver.switchTo().alert();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		if(s.equals("I am a JS Alert")) {
			Thread.sleep(2000);
		driver.switchTo().alert().accept();
		}
		else {
			System.out.println("error");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		 Alert alert = driver.switchTo().alert(); 
		 Thread.sleep(2000);
		 alert.sendKeys("Johnjoshua");
		 Thread.sleep(2000);
		 alert.accept();
		
	}

}
