import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowser {
    public static void main(String[] args) {
        
        // Browser names array
        String[] browsers = {"chrome", "firefox", "edge"};
        
        for(String browser : browsers) {
            WebDriver driver = null;
            
            // Browser select பண்ணு
            if(browser.equals("chrome")) {
                driver = new ChromeDriver();
            } else if(browser.equals("firefox")) {
                driver = new FirefoxDriver();
            } else if(browser.equals("edge")) {
                driver = new EdgeDriver();
            }
            
            // Test run பண்ணு
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            
            System.out.println("✅ " + browser + " - Login Success!");
            
            driver.quit();
        }
    }
}