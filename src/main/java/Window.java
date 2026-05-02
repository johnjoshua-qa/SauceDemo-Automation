import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		String MainWindow = driver.getWindowHandle();
		System.out.println(MainWindow);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		for(String window : driver.getWindowHandles()) {
			if(!window.equals(MainWindow)) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		 System.out.println("✅ Back to Main Window: " + driver.getTitle());
		driver.quit();
		
	}

}
