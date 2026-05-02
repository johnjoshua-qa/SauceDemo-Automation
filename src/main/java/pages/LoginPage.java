package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.id("login-button");
	By errorMessage = By.cssSelector("[data-test='error']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}
	
	public void validLogin(String user,String pass) {
		enterUserName(user);
		enterPassword(pass);
		clickLogin();
	}
	
	public String getErrorMessage() {
		return driver.findElement(errorMessage).getText();
	}
}
