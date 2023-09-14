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
Feature: 2_Reset password

Background: second background
Given Admin clicks reset password link after  reaching in login page

Scenario: verify text box is in enabled in new password field
Given Admin reset password page
When Admin clicks on type in new password field
Then Admin should see text box is enabled state


Scenario:
Given Admin reset password page
When Admin clicks on retype password field
Then Admin should see text box is enabled state

Scenario:
Given Admin reset password page
When Admin enters same password on both field and clicks submit button
Then Admin should recieve  : "Your password has been reset". Please click here to login

Scenario:
Given Admin reset password page
When Admin enters same password on both field with invalid details and clicks submit button
Then Error message " Please try agin"

Scenario:
Given Admin reset password page
When Admin enters  empty details on both fieldand clicks submit button
Then Error message " Please try agin"

Scenario:
Given Admin reset password page
When Admin enters  mismatch values and clicks submit button
Then Error message " Please try agin"
