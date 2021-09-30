Feature: Adding item to cart
  Scenario: Adding the lowest price item to the cart from the wishlist

    Given I add 4 different products to my wishlist
    When  I view my wishlist table
    Then I find total 4 selected item in my wishlist
    When I search for lowest priced product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart
