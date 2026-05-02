import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/iframe");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
//		driver.findElement(By.id("tinymce")).clear();
//		driver.findElement(By.id("tinymce")).sendKeys("JOHN");
//		driver.findElement(By.id("tinymce")).clear();
//        driver.findElement(By.id("tinymce")).sendKeys("Hello from iFrame!");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.quit();
	}

}
