Feature: Product Search on Magento Website

  Scenario: Search for a product and view details
    Given I am on the homepage
    When I search for "Laptop" in the search bar
    Then I should see product results related to "Laptop"

  Scenario: No results for an invalid product search
    Given I am on the homepage
    When I search for "InvalidProduct"
    Then I should see a "No results found" message
