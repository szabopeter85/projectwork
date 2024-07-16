Feature: Login to the Page
  As a user,
  I want to login providing my username and password
  So that I can use the shopping page properly

  Scenario: Display login page after clicking "Bejelentkezés" button
    Given I am on the homepage
    When I click on the "Bejelentkezés" button
    Then the login page should be displayed with the required fields and login button