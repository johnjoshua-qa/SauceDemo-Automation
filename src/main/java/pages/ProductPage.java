package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	By pageTitle = By.xpath("//*[@class='title']");
	By firstProduct = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
//	By addtoCart = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	By cartIcon = By.className("shopping_cart_link");
	By cartCount = By.className("shopping_cart_badge");
//	By checkOut = By.xpath("");

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.findElement(pageTitle).getText();
	}

	public void addToCart() {
		driver.findElement(firstProduct).click();
	}

	public String getcartCount() {
		return driver.findElement(cartCount).getText();
	}

	public void goToCart() {
		driver.findElement(cartIcon).click();
	}

}
