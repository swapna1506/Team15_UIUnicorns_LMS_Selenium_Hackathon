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
Feature: Navigation Validation From Manage Program To Others

Background: Admin is on Manage program Page
			Given user is in internet browser
    	When user enters LMS portal URL
    	And user enters admin <UserName> and <Password> and clicks login button
    	And Admin clicks "Program" on the navigation bar
    	Then Admin should see URL with "Manage Program"


	Scenario: Student link on navigation bar
		Given: Admin is on Manage Program page
		When: Admin clicks on Student link on Manage Program page
		Then: Admin is re-directed to Student page

	Scenario: Batch link on navigation bar
		Given: Admin is on Manage Program page
		When: Admin clicks on Batch link on Manage Program page
		Then: Admin is re-directed to Batch page

	Scenario: Class link on navigation bar
		Given: Admin is on Manage Program page
		When: Admin clicks on Class link on Manage Program page
		Then: Admin is re-directed to Class page

	Scenario: User link on navigation bar
		Given: Admin is on Manage Program page
		When:  Admin clicks on User link on Manage Program page
		Then: Admin is re-directed to User page

	Scenario: Assignment link on navigation bar
		Given: Admin is on Manage Program page
		When: Admin clicks on Assignment link on Manage Program page
		Then: Admin is re-directed to Assignment page

	Scenario: Attendance link on navigation bar
		Given: Admin is on Manage Program page
		When: Admin clicks on Attendance link on Manage Program page
		Then: Admin is re-directed to Attendance page

	Scenario: Logout link on navigation bar
		Given: Admin is on Manage Program page
		When: Admin clicks on Logout link on Manage Program page
		Then: Admin is re-directed to Login page












