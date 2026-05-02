import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		dropdown.selectByVisibleText("Option 1");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Option 2");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.quit();
	}

}
