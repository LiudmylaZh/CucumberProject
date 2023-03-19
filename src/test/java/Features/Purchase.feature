Feature: Purchase


  Scenario: The products add to cart
    Given I open login page
    When I login successfully with username "standard_user" and password "secret_sauce"
    Then I anm open sidebar and press Reset App State button
    When I add first product to the cart
    Then cart icon with value "1" is displayed


  Scenario: The products from cart is deleted
    Given I open login page
    When I login successfully with username "standard_user" and password "secret_sauce"
    Then I anm open sidebar and press Reset App State button
    When I add first product to the cart
    Then cart icon with value "1" is displayed
    Then Added products successfully deleted
    Then The cart is empty

  @current_test
  Scenario: The products from cart is deleted
    Given I open login page
    When I login successfully with username "standard_user" and password "secret_sauce"
    Then I anm open sidebar and press Reset App State button
    When I add first product to the cart
    Then I open cart
    Then I continue checkout purchase
    Then I enter with first name "John", last name "Wick"and zipcode "12345"
    Then I successfully finish purchase






