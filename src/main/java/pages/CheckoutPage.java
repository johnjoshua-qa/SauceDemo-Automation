package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	WebDriver driver;

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By continueButton = By.id("continue");
	By finishButton = By.id("finish");
	By successMessage = By.className("complete-header");
	By cancel = By.id("cancel");
//	By backtohome = By.id("back-to-products");

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterDetails(String fname, String lname, String postal) {
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		driver.findElement(postalCode).sendKeys(postal);
	}

	public void clickContinue() {
		driver.findElement(continueButton).click();
	}

	public void clickFinish() {
		driver.findElement(finishButton).click();
	}

	public String getSuccessMessage() {
		return driver.findElement(successMessage).getText();
	}

	public void clickCancel() {
		driver.findElement(cancel).click();
	}
	
//	public void backToHome() {
//		driver.findElement(backtohome).click();
//	}

}
