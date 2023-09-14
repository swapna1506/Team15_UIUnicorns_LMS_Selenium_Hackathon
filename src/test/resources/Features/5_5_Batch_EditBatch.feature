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
#Sample Feature Definition Templ



Feature: Title of your feature
  I want to use this template for my feature file

  Background: Logged on the LMS portal
    Given Admin is on dashboard page after Login
    When Admin clicks "Batch" from navigation bar

  Scenario: Validate row level edit icon
    Given The edit icon on row level in data table is enabled
    When Admin clicks the edit icon
    Then A new pop up with Batch details appears

  Scenario: Check if the fields are updated
    Given Admin clicks the edit icon
    When Update the fields with valid values and click save
    Then The updated batch details should appear on the data table

  Scenario: Check if the update throws error with invalid valued
    Given Admin clicks the edit icon
    When Update the fields with valid values and click save
    Then Error message should appear

  Scenario: Check if you get error message when mandatory fields are erased
    Given Admin clicks the edit icon
    When Erase data from mandatory field
    Then Error message should appear

  Scenario: Check if description field is optional in update
    Given Admin clicks the edit icon
    When Erase data from mandatory field
    Then The updated batch details should appear on the data table
