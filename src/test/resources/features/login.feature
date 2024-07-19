Feature: Login to the Page
  As a user,
  I want to login providing my username and password
  So that I can use the shopping page properly

  Scenario: Display login page after authentication
    Given I am on the loginpage
    When I login with my credentials "peterteszt013@gmail.com" and "Teszt@2024"
    Then the login page should be displayed with "Üdvözlünk Péter"