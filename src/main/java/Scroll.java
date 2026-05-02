import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver; 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		System.out.println("✅ Scrolled to bottom!");
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,0)");
		System.out.println("✅ Scrolled to bottom!");
        Thread.sleep(1000);
	}

}
