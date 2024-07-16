Feature: Search for Products
  As a user,
  I want to search for products by name
  So that I can check the items I want to purchase

  Scenario: Use the search bar to find products
    Given I am on any page of the shopping site
    When I enter a search term in the search bar
    Then I should see a list of products matching the search term
    And each product should display its name, price, and an option to add it to the cart