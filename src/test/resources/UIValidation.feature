Feature: UI Validation on Magento Website

  Scenario: Validate presence of login button
    Given I am on the homepage
    When I check for the login button
    Then The login button should be visible

  Scenario: Validate presence of search bar
    Given I am on the homepage
    When I check for the search bar
    Then The search bar should be visible
