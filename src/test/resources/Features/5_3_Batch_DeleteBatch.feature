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
Feature: Delete multiple batches

  Background: background
    Given Logged on the LMS portal.Admin is on dashboard page after Login
    When Admin clicks "Batch" from navigation bar

  Scenario: Validate row level delete icon
    Given The delete icon on row level in data table is enabled
    When Admin clicks the delete icon
    Then Alert appears with yes and No option

  Scenario: Validate accept alert
    Given Admin clicks the delete icon
    When You click yes option
    Then Batch deleted alert pops and batch is no more available in data table

  Scenario: Validate reject alert
    Given Admin clicks the delete icon
    When you click No option
    Then Batch is still listed in data table
