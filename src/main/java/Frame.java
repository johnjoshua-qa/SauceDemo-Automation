import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\johnj\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
//		driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		driver.findElement(By.name("email")).sendKeys("johnjoshuajwin121@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Joshua@1512");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click() ;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		
		
	}

}
