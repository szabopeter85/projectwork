Feature: Language Switching
  As a user,
  I want to use the site in English and Hungarian
  So that I can view and buy products in both English and Hungarian

  Scenario: Switching language to Hungarian
    Given I am on the homepage
    When I set language to "Hungarian"
    Then the page should display content in Hungarian

  Scenario: Switching language to English
    Given I am on the homepage
    When I set language to "English"
    Then the page should display content in English