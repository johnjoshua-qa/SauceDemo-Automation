import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\johnj\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("johnjoshua");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12345");
		driver.findElement(By.className("signin-btn")).click();
//		driver.findElement(By.xpath("//*[@id='imagetext']")).sendKeys("EEEW");
//		driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
//		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
        String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct alert messg");
			
		}
		else{
			System.out.println("in-correct alert messg");
		}
		alert.accept();
	}

}
