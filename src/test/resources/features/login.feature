Feature: Login Functionality


	@regressivo
  Scenario: Valid login
    Given the user is on the login page
    When the user enters "standard_user" and "secret_sauce"
    Then the user should see the home screen
