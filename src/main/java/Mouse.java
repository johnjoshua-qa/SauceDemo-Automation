import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    Actions action = new Actions(driver);
//	    driver.get("https://the-internet.herokuapp.com/context_menu");
//	    action.moveToElement(driver.findElement(By.xpath("//div[@class='figure']"))).perform();
//	    System.out.println("hover done");
	    
//	    Thread.sleep(2000);
//	    driver.get("https://the-internet.herokuapp.com/context_menu");
//	    action.contextClick(driver.findElement(By.xpath("//div[@id='hot-spot']"))).perform();
//	    Thread.sleep(2000);
//
//	    driver.switchTo().alert().accept();
//	    driver.quit();
	    
//	    Thread.sleep(2000);
	    driver.get("https://the-internet.herokuapp.com/double_click");
        action.doubleClick(driver.findElement(By.id("double-click"))).perform();
        System.out.println("✅ Double Click done!");
       
	    
	}

}
