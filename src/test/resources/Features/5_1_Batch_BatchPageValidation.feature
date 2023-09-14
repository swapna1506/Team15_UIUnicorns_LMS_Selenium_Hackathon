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
Feature: Batch Page Validation

  Background: background
    Given Logged on the LMS portal

  Scenario: Verify after login  admin lands on manage program as dashboard page
    Given Admin is on dashboard page after Login
    When Admin clicks Batch from navigation bar
    Then Admin should see the Manage Batch in the URL

  Scenario: Validate header in the Batch Page
    Given Admin is on dashboard page after Login
    When Admin clicks Batch from navigation bar
    Then Admin should see the Manage Batch in the header

  Scenario: Validate pagination in the Batch Page
    Given Admin is on dashboard page after Login
    When Admin clicks Batch from navigation bar
    Then Admin should see the pagination controls under the data table

  Scenario: Validate data table headers in the Batch Page
    Given Admin is on dashboard page after Login
    When Admin clicks Batch from navigation bar
    Then Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete

  Scenario: Validate Delete button in Batch Page
    Given Admin is on dashboard page after Login
    When Admin clicks Batch from navigation bar
    Then Admin should be able to see the "Delete" icon button that is disabled

  Scenario: Validate "+ A New batch" in Batch Page
    Given Admin is on dashboard page after Login
    When Admin clicks Batch from navigation bar
    Then Admin should be able to see the "+ A New batch" button

  Scenario: Validate data rows
    Given Admin is on dashboard page after Login
    When Admin clicks Batch from navigation bar
    Then Each row in the data table should have a checkbox

  Scenario: Validate data rows
    Given Admin is on dashboard page after Login
    When Admin clicks "Batch" from navigation bar
    Then Each row in the data table should have a edit icon that is enabled

  Scenario: Validate data rows
    Given Admin is on dashboard page after Login
    When Admin clicks "Batch" from navigation bar
    Then Each row in the data table should have a delete icon that is enabled

  Scenario: Validate pop up for adding batch
    Given Admin is on dashboard page after Login
    When Admin clicks "+ A New Batch" button
    Then A new pop up with Batch details appears
