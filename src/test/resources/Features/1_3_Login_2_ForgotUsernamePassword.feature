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
Feature: 2_Forgot username /password

  Background: second background
    Given Admin Clicks forgot username and password after reaching login page

  Scenario Outline: Validate email sent for forgot password
    Given Admin is in forgot username and password page
    When Admin enters valid "<email>" id and clicks send link button
    Then Admin should receive link in mail for reset username / password
Examples:
|email|
|swap@gmail.com|
  Scenario: Validate email sent for forgot password with invalid email if
    Given Admin is in forgot username and password page
    When Admin enters invalid "<email>" id and clicks send link button
    Then Admin should not receive link in mail for reset username / password
 Examples:
|email|
|sw p@gmail.com|