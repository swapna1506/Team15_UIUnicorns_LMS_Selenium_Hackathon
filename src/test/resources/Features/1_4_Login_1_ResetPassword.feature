#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: 1_Reset password

  Background: first background
    Given Admin in login page after clicking login button in home page

  Scenario: Verify  reset password link
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should land on reset password page

  Scenario: Verify  reset password link
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see correct spellings in all fields

  Scenario: Verify  reset password link
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see "submit"  button

  Scenario: Verify  reset password link
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see submit button in center of the page

  Scenario: Verify  reset password link
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see two text box

  Scenario: reset password
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see "Type in new password" in the first label text

  Scenario: reset pass
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see "Retype password" in the second label text

  Scenario: reset password login 
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see text box in disabled state 

   
