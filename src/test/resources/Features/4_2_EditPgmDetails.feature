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

Feature: Edit Program Details
	Background: Admin is on Manage Program Page
			Given user is in internet browser
    	When user enters LMS portal URL
    	And user enters admin <UserName> and <Password> and clicks login button
    	And Admin clicks "Program" on the navigation bar
    	Then Admin should see URL with "Manage Program"


	Scenario: Validate Edit Feature
		Given: Admin is on Manage Program Page 
		When: Admin clicks <Edit> button on the data table for any row
		Then: Admin should see a popup open for Program details to edit


	Scenario: Edit Program Name
		Given: Admin is on Program Details Popup window to Edit
		When: Admin edits the Name column and clicks save button
		Then: Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program

	Scenario: Edit Program description
		Given: Admin is on Program Details Popup window to Edit
		When: Admin edits the Description column and clicks save button
		Then: Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program

	Scenario: Change Program Status
		Given: Admin is on Program Details Popup window to Edit
		When: Admin changes the Status and clicks save button
		Then: Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program

	Scenario: Validate invalid values on the text column
		Given: Admin is on Program Details Popup window to Edit
		When: Admin enters only numbers or special char in name and desc column
		Then: Admin gets a Error message alert 

	Scenario: Validate Cancel button on Edit popup
		Given: Admin is on Program Details Popup window to Edit
		When: Admin clicks <Cancel> button on edit popup
		Then: Admin can see the Program details popup disappears and can see nothing changed for particular program

	Scenario: Validate Save button on Edit popup
		Given: Admin is on Program Details Popup window to Edit
		When: Admin clicks <Save> button on edit popup
		Then: Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program









