Feature: Browse Products
  As a user,
  I want to browse through categories of products
  So that I can find the items I need

  Scenario: Navigate through product categories after successful login
    Given I am logged in successfully
    When I click on the "Bevásárlás" button
    Then I should be able to click through categories
    And see a list of products with their names and prices in each category