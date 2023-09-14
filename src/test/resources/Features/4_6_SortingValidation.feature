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

Feature: Sorting Validation

Background: Admin is on Manage Program Page 
			Given user is in internet browser
    	When user enters LMS portal URL
    	And user enters admin <UserName> and <Password> and clicks login button
    	And Admin clicks "Program" on the navigation bar
    	Then Admin should see URL with "Manage Program"


Scenario: Validates Sorting(data ordering) on the Program Data table
 	Given: Admin is on Manage Program page
	When: Admin clicks the sort icon of program name column
	Then: The data get sorted on the table based on the program name column values in ascending order

Scenario: Validates Sorting(data ordering) on the Program Data table
	Given: The data is in the ascending order on the table based on Program Name column
	When: Admin clicks the sort icon of program name column
	Then: The data get sorted on the table based on the program name column values in descending order

Scenario: Validates Sorting(data ordering) on the Program Data table
	Given: Admin is on Manage Program page
	When: Admin clicks the sort icon of program Desc column
	Then: The data get sorted on the table based on the program description column values in ascending order

Scenario: Validates Sorting(data ordering) on the Program Data table
	Given: The data is in the ascending order on the table based on Program Description column
	When: Admin clicks the sort icon of program Desc column
	Then: The data get sorted on the table based on the program description column values in descending order


Scenario: Validates Sorting(data ordering) on the Program Data table
	Given: Admin is on Manage Program page
	When: Admin clicks the sort icon of program Status column
	Then: The data get sorted on the table based on the program status column values in ascending order

Scenario: Validates Sorting(data ordering) on the Program Data table
	Given: The data is in the ascending order on the table based on Program Status column
	When: Admin clicks the sort icon of program Status column
	Then: The data get sorted on the table based on the program status column values in descending order
