Feature: Search for Products
  As a user,
  I want to search for products by name
  So that I can check the items I want to purchase

  Scenario: Use the search bar to find products
    Given I am on any page of the shopping site
    When I search for "alma"
    Then I should see that the products belonging to "alma" appear
    And 92 products are displayed with prices

