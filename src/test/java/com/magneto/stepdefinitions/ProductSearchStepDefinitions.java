package com.magneto.stepdefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class ProductSearchStepDefinitions {
	
	WebDriver driver;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        driver = new ChromeDriver();
        driver.get("https://www.magneto.com");
    }

    @When("I search for {string} in the search bar")
    public void i_search_for_product_in_the_search_bar(String productName) {
        WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys(productName);
        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();
    }

    @Then("I should see product results related to {string}")
    public void i_should_see_product_results_related_to(String productName) {
        WebElement productResult = driver.findElement(By.cssSelector(".product-result"));
        Assert.assertTrue(productResult.getText().contains(productName), "Product search results mismatch!");
        driver.quit();
    }

    @Then("I should see a {string} message")
    public void i_should_see_a_message(String message) {
        WebElement noResultsMessage = driver.findElement(By.cssSelector(".no-results"));
        Assert.assertEquals(noResultsMessage.getText(), message, "Expected no results message not found!");
        driver.quit();
    }

}
