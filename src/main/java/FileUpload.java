import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		JavascriptExecutor js= (JavascriptExecutor)driver; 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		String file = "C:\\Users\\johnj\\Downloads\\newjj.txt";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(file);
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();

	}

}
