Feature: Login
  As a User
  I want to see my home page
  So that i can update my profile

  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter my username and password correctly
    And I clik login button
    Then I am on the home page