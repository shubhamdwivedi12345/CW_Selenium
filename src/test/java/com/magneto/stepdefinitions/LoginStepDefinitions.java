package com.magneto.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {

	WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Setup WebDriver
        driver = new ChromeDriver();
        driver.get("https://www.magneto.com/login");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("validUser");
        driver.findElement(By.id("password")).sendKeys("validPass");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be redirected to the homepage")
    public void i_should_be_redirected_to_the_homepage() {
        String currentUrl = driver.getCurrentUrl();
        AssertionError.assertTrue(currentUrl.contains("home"));
        driver.quit();
    }
		
		
		
	}


