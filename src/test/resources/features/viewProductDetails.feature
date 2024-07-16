Feature: View Product Details
  As a user,
  I want to view details of a product
  So that I can learn more about it before making a purchase

  Scenario: View detailed information of a product
    Given I am browsing products
    When I click on a product name
    Then I should see the product's price, description, and an add button