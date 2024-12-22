Feature: Checkout Process on Magento Website

  Scenario: Successful checkout with valid items
    Given I have added items to the cart
    When I proceed to checkout
    Then I should be on the checkout page and see the items

  Scenario: Checkout with no items in the cart
    Given I have no items in the cart
    When I try to proceed to checkout
    Then I should see a message "Your cart is empty"
