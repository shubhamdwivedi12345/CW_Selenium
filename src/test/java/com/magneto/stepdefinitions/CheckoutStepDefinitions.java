package com.magneto.stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckoutStepDefinitions {

	WebDriver driver;

    @Given("I have added items to the cart")
    public void i_have_added_items_to_the_cart() {
        driver = new ChromeDriver();
        driver.get("https://www.magneto.com");
        WebElement product = driver.findElement(By.cssSelector(".product"));
        product.click();
        WebElement addToCart = driver.findElement(By.id("add-to-cart"));
        addToCart.click();
    }

    @Given("I have no items in the cart")
    public void i_have_no_items_in_the_cart() {
        driver = new ChromeDriver();
        driver.get("https://www.magneto.com");
    }

    @When("I proceed to checkout")
    public void i_proceed_to_checkout() {
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();
    }

    @Then("I should be on the checkout page and see the items")
    public void i_should_be_on_the_checkout_page_and_see_the_items() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("checkout"), "Not redirected to checkout page!");
        WebElement itemInCart = driver.findElement(By.cssSelector(".cart-item"));
        Assert.assertTrue(itemInCart.isDisplayed(), "Item not present in the cart!");
        driver.quit();
    }

    @Then("I should see a message {string}")
    public void i_should_see_a_message(String message) {
        WebElement emptyCartMessage = driver.findElement(By.cssSelector(".empty-cart"));
        Assert.assertEquals(emptyCartMessage.getText(), message, "Expected empty cart message not found!");
        driver.quit();
    }
	
}
