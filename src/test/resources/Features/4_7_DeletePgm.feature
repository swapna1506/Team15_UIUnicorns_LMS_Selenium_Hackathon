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

Feature: Delete program

 
Background: Admin is on Manage Program Page
	Given user is in LMS portal
  When user enters admin <UserName> and <Password> and clicks login button
  And Admin clicks "Program" on the navigation bar
  Then Admin should be on manage programe page with title "Manage Program"
 
 Scenario: Delete feature 
 When: Admin clicks Delete button on the data table for row {String}
 Then: Admin should see a alert page with heading "Confirm" along with YES and NO button for deletion
 
 Scenario: Validate details for Confirm Deletion form
 When: Admin clicks Delete button on the data table for row {String}
 Then: Admin should see a message "Are you sure you want to delete <Program name>?"
 
 Scenario: Click Yes on deletion window
 When: Admin clicks YES button on the alert
 Then: Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table
 
 Scenario: Click No on deletion window
 When: Admin clicks NO button on the alert
 Then: Admin can see the deletion alert disappears without deleting
 
 Scenario: Validate Cancel or Close icon on Confirm Deletion alert
 When: Admin clicks Cancel or Close Icon on Deletion alert
 Then: Admin can see the deletion alert disappears without any changes
 
