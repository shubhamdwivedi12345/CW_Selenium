package com.magneto.stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class UIValidationStepDefinitions {

	

    WebDriver driver;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        driver = new ChromeDriver();
        driver.get("https://www.magneto.com");
    }

    @When("I check for the login button")
    public void i_check_for_the_login_button() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Assert.assertTrue(loginButton.isDisplayed(), "Login button not displayed on the homepage!");
    }

    @When("I check for the search bar")
    public void i_check_for_the_search_bar() {
        WebElement searchBar = driver.findElement(By.id("search"));
        Assert.assertTrue(searchBar.isDisplayed(), "Search bar not displayed on the homepage!");
    }

    @Then("The login button should be visible")
    public void the_login_button_should_be_visible() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Assert.assertTrue(loginButton.isDisplayed(), "Login button should be visible!");
        driver.quit();
    }

    @Then("The search bar should be visible")
    public void the_search_bar_should_be_visible() {
        WebElement searchBar = driver.findElement(By.id("search"));
        Assert.assertTrue(searchBar.isDisplayed(), "Search bar should be visible!");
        driver.quit();
    }
}
