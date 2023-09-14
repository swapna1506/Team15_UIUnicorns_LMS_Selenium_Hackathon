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

Feature: Add new Batch
Background: background
     Given       Logged on the LMS portal.Admin is on dashboard page after Login
                                                                                                                 
     When       Admin clicks "Batch" from navigation bar
     Then       Admin clicks "+ A New Batch" button
            
 Scenario: Check if the fields exist in pop
    Given A new pop up with Batch details appears 
     
    Then  The pop up should include the fields Name, Number of classes and Description as text box, Program Name as drop down Status as radio button Number of classes as text box     
   
      Scenario: Check if description is optional field
Given A new pop up with Batch details appears
When Fill in all the fields except description with valid values and click save
Then The newly added batch should be present in the data table in Manage Batch page

Scenario: Check if the program details are added in data table
Given A new pop up with Batch details appears
When Fill in all the fields with valid values and click save
Then The newly added batch should be present in the data table in Manage Batch page

Scenario: Check for error messages for invalid fields
Given A new pop up with Batch details appears 
When any of the fields have invalid values
Then Error message should appear

Scenario: Check for error messages for mandatory fields
Given A new pop up with Batch details appears 
When Any of the mandatory fields are blank
Then Error message should appear      
            



   