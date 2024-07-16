Feature: Checkout Process
  As a user,
  I want to checkout my cart to complete my purchase through the given checkout process
  So that I can purchase it and arrange it for delivery

  Scenario: Complete the checkout process
    Given I have items in my shopping cart
    When I proceed to checkout
    Then I can review my cart before continuing
    And I follow through the steps for delivery address confirmation, payment method selection, and order review
    And upon successful payment, I receive a confirmation email with my order details