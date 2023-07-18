@Vesna
Feature: User Story 1

  Story: As a user, I should be able to login

  Scenario: HR user login
    Given I am on the login page
    When I login using HR email and password
    Then I land on the home page

  Scenario: Marketing user login
    Given I am on the login page
    When I login using marketing email and password
    Then I land on the home page

  Scenario: Helpdesk user login
    Given I am on the login page
    When I login using Helpdesk email and password
    Then I land on the home page

  Scenario: valid username - invalid password
    Given I am on the login page
    When I login using valid email and incorrect password
    Then I should see error message for invalid credentials

  Scenario: invalid username - valid password
    Given I am on the login page
    When I login using invalid email and valid password
    Then I should see error message for invalid credentials

  Scenario: invalid username - invalid password
    Given I am on the login page
    When I login using invalid email and invalid password
    Then I should see error message for invalid credentials

  Scenario: "Please fill out this field" error message should be displayed if the username is empty
    Given I am on the login page
    When I login with empty username and correct password
    Then I should see error message "Please fill out this field"

  Scenario: "Please fill out this field" error message should be displayed if the password is empty
    Given I am on the login page
    When I login with correct username and empty password
    Then I should see error message "Please fill out this field"



