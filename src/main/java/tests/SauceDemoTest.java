package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.DriverSetup;

public class SauceDemoTest {

	public class SauceDemotest {
		WebDriver driver;
		LoginPage loginpage;
		ProductPage productpage;
		CartPage cartpage;
		CheckoutPage checkoutpage;

		@BeforeTest
		public void Setup() {
			driver = DriverSetup.getDriver();
			driver.get("https://www.saucedemo.com/");
			loginpage = new LoginPage(driver);
			productpage = new ProductPage(driver);
			cartpage = new CartPage(driver);
			checkoutpage = new CheckoutPage(driver);
		}

		@Test(priority = 1)
		public void ValidLoginTest() {
			loginpage.validLogin("standard_user", "secret_sauce");
			Assert.assertEquals(productpage.getPageTitle(), "Products");
			System.out.println("Login Success");
		}

		@Test(priority = 2)
		public void addToCartTest() {
			productpage.addToCart();
			Assert.assertEquals(productpage.getcartCount(), "1");
			System.out.println("Item added successfuly");
		}

		@Test(priority = 3)
		public void cartVerifyTest() {
			productpage.goToCart();
			Assert.assertEquals(productpage.getPageTitle(), "Your Cart");
			System.out.println("✅ Cart Verify Test PASSED!");
		}

		@Test(priority = 4)
		public void checkoutPageTest() {
			cartpage.OutItem();
			checkoutpage.enterDetails("john", "joshua", "600001");
			checkoutpage.clickContinue();
			checkoutpage.clickFinish();
			Assert.assertEquals(checkoutpage.getSuccessMessage(), "Thank you for your order!");
			System.out.println("✅ Checkout Test PASSED!");
		}

		@AfterTest
		public void tearDown() {
			DriverSetup.quitDriver();
		}

	}

}
