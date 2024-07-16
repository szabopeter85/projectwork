Feature: Browse Products
  As a user,
  I want to browse through categories of products
  So that I can find the items I need

  Scenario: Navigate through product categories after successful login
    Given I am successfully logged in and see my greeting message
    When I am going to use the "Bevásárlás" button for browsing products
    Then I should able to select categories
    And I should able to see a detailed list of products with their names under the category