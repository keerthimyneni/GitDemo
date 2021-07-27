Feature: Add products to cart
  As a user, I should have ability to add products
  to my wish list and to the cart

  Background: Launch url
    Given I navigate to "https://testscriptdemo.com"

  Scenario: Add products to wishlist
    Given I add four products to my wish list
    When I view my wishlist table
    Then I find total four selected items in my Wishlist
    When I search for lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart