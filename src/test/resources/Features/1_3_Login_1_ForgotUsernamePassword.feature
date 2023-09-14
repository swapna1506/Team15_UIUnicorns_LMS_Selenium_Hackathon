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

Feature: 1_Forgot username /password

Background: first background
Given Admin in login page after clicking login button in home page

Scenario: Verify forgot username or password link
Given Admin is in login page
When Admin clicks forgot username or password link
Then Admin should land on forgot username or password page

Scenario: verify broken link
Given Admin is in login page
When Admin clicks forgot username or password link
Then HTTP response >= 400. Then the link is broken

Scenario: verify input descriptive text for Email
Given Admin is in login page
When Admin clicks forgot username or password link
Then Admin should see "Email" text in gray color

Scenario: verify broken link
Given Admin is in login page
When Admin clicks forgot username or password link
Then Admin should see "Email" in text field

Scenario: verify broken link
Given Admin is in login page
When Admin clicks forgot username or password link
Then Admin should see "send Link"  button

Scenario: verify broken link
Given Admin is in login page
When Admin clicks forgot username or password link
Then Admin should see asterik symbol need Email

Scenario: verify broken link
Given Admin is in login page
When Admin clicks forgot username or password link
Then Admin should see correct spellings in all fields 

Scenario: verify broken link
Given Admin is in login page
When Admin clicks forgot username or password link
Then Admin should see send link button in center of the page
