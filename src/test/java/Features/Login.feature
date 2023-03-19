Feature: Login
@success_login
  Scenario: Success login
    Given I open login page
    When I enter "standard_user" to username input field
    And I enter "secret_sauce" to password input field
    When I push the Login button
    Then I am on the page Inventory

  Scenario Outline: I open login page
    Given I open login page
    When I enter "<username>" to username input field
    And I enter "secret_sauce" to password input field
    When I push the Login button
    Then I am stay on the login page
    Then The error massage with text "<errorMessageText>" is displayed.
    Examples:
      | username                |errorMessageText                                            |
      | locked_out_user         |Sorry, this user has been locked out.                       |
      | standard_user67676767   |Username and password do not match any user in this service |


  Scenario: Success logout
    Given I open login page
    When I login successfully with username "standard_user" and password "secret_sauce"
    Then I am open sidebar and press logout button
    Then I success logout