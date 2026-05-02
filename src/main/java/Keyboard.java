import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='target']")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='target']")).sendKeys("Hello john");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='target']")).sendKeys(Keys.CONTROL,"c");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='target']")).sendKeys(Keys.CONTROL,"v");
	}

}
