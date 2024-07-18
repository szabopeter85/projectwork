Feature: Search for Products
  As a user,
  I want to search for products by name
  So that I can check the items I want to purchase

  Scenario: Use the search bar to find products
    Given I am on any page of the shopping site
    When I search for <product>
    Then I should see that the products belonging to <product> appear
    And <productNum> products are displayed with prices

Feature: Use the search bar to find products

  Scenario Outline: Searching for products using the search bar
#    Given I am on any page of the shopping site
#    When I search for <product>
#    Then I should see that the products belonging to <product> appear
#    And <productNum> products are displayed with prices

    Examples:
      | product | productNum |
      | alma    | 102        |
      | barack  | 10         |
      | banán   | 24         |