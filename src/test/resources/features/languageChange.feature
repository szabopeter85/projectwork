Feature: Language Switching
  As a user,
  I want to use the site in English and Hungarian
  So that I can view and buy products in both English and Hungarian

  Scenario: Switching language to Hungarian
    Given I am on the homepage
    When I click on the "Magyar" button
    Then the page should display content in Hungarian

  Scenario: Switching language to English
    Given I am on the homepage
    When I click on the "English" button
    Then the page should display content in English