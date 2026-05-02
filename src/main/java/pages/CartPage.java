package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;

	By cartTitle = By.className("title");
	By cartItem = By.className("inventory_item_name");
	By checkOutItem = By.id("checkout");
	By continueShopping = By.id("continue-shopping");
	By removeItem = By.xpath("//button[contains(text(),'Remove')]");

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getCartTitle() {
		return driver.findElement(cartTitle).getText();
	}

	public String getCartItem() {
		return driver.findElement(cartItem).getText();
	}

	public void OutItem() {
		driver.findElement(checkOutItem).click();
	}

	public void addcontinueShopping() {
		driver.findElement(continueShopping).click();
	}

	public void deletItem() {
		driver.findElement(removeItem).click();
	}

}
