Feature: Test the Orange HRM Application

  Scenario: Validate Login Functionality
    Given user is on login page
    When user enter valid credentails
    Then user validate home page title