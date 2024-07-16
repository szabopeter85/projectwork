Feature: Managing the Shopping Cart
  As a user,
  I want to add items to my shopping cart and view them and adjust their quantities
  So that I can manage it before the checkout

  Scenario: Add and adjust items in the shopping cart
    Given I am on the product listing or detail page
    When I add a product to my cart
    And I view my cart
    Then I should see all added items, their prices, and total cost
    And I can change the quantity of each item or remove items from the cart