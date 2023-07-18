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