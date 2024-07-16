Feature: GDPR Cookie Acceptance
  As a user,
  I want to use the page properly so I have to accept the GDPR cookies

  Scenario: Accepting GDPR cookies
    Given I am on the homepage
    When I accept cookies
    Then the GDPR cookies acceptance message should disappear