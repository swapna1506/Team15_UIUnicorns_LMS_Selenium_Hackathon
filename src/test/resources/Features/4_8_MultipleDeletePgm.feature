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
Feature: Multiple Delete Program

Background: Admin is on Manage Program page
			Given user is in internet browser
    	When user enters LMS portal URL
    	And user enters admin <UserName> and <Password> and clicks login button
    	And Admin clicks "Program" on the navigation bar
    	Then Admin should see URL with "Manage Program"

Scenario: Validate multiple program deletion by selecting Single checkbox
	Given: Admin is on Confirm Deletion alert
	When: Admin clicks <YES> button on the alert
	Then: Admin should land on Manage Program page and can see the selected program is deleted from the data table
	
	
Scenario: Validate multiple program deletion by selecting Single checkbox
	Given: Admin is on Confirm Deletion alert
	When: Admin clicks <NO> button on the alert
	Then: Admin should land on Manage Program page and can see the selected program is not deleted from the data table

Scenario: Validate multiple program deletion by selecting multiple check boxes
	Given: Admin is on Confirm Deletion alert
	When: Admin clicks <YES> button on the alert
	Then: Admin should land on Manage Program page and can see the selected programs are deleted from the data table

Scenario: Validate multiple program deletion by selecting multiple check boxes
	Given: Admin is on Confirm Deletion alert
	When: Admin clicks <NO> button on the alert 
	Then: Admin should land on Manage Program page and can see the selected programs are not deleted from the data table

