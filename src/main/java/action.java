import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\johnj\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		Actions action = new  Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Add-ons')]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'SpiceMax')]")).click();
	}

}
