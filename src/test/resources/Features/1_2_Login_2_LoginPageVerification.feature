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

Feature: 2_Login page verification

Background: second background
Given Admin in login page after clicking login button in home page

Scenario Outline: Validate login with valid credentials
   Given Admin is in home page
   When Admin enter valid "<sheetname>" "<Testcase>" and clicks login button 
   Then Admin should land on dashboard page
   
   Examples:
   |sheetname|Testcase|
   |login|1positive|

 Scenario Outline: Validate login with invalid credentials
   Given Admin is in home page
   When Admin enter invalid "<sheetname>" "<Testcase>" and clicks login button 
   Then Error message please check username password
   Examples:
   |sheetname|Testcase|
   |login|1negative|

 Scenario Outline: Validate login with valid credentials in username
   Given Admin is in home page
   When Admin enter valid "<sheetname>" "<Testcase>" and clicks login button 
   Then Error message please check password
   Examples:
   |sheetname|Testcase|
   |login|2negative|
   

  Scenario Outline: Validate login with valid credentials in password
   Given Admin is in home page
   When Admin enter valid "<sheetname>" "<Testcase>" and clicks a login button 
   Then Error message please check username
   Examples:
    |sheetname|Testcase|
    |login|3negative|
   

 Scenario Outline: Validate login with blank username credentials
   Given Admin is in home page
   When Admin enter blank in "<sheetname>" "<Testcase>"and clicks login button 
   Then Error message please check username
   Examples:
    |sheetname|Testcase|
    |login|4negative|

Scenario Outline: Validate login with blank password credentials
   Given Admin is in home page
   When Admin enter blank in "<sheetname>" "<Testcase>"and clicks a login button 
   Then Error message please check password
   Examples:
   |sheetname|Testcase|
   |login|5negative|


 Scenario Outline: validate login with empty values in both field
   Given Admin is in home page
   When Admin clicks Login button with empty values in "<sheetname>" "<Testcase>" columns
   Then Error message please check username password
    Examples:
   |sheetname|Testcase|
   |login|6negative|

 Scenario Outline: verify login button action through keyboard
   Given Admin is in home page
   When Admin enter valid "<sheetname>" "<Testcase>" and clicks login button through keyboard
   Then Admin should land on dashboard page
   Examples:
   |sheetname|Testcase|
   |login|1positive|
   

  Scenario Outline: verify login button action through mouse
   Given Admin is in home page
   When Admin enter valid "<sheetname>" "<Testcase>" and clicks login button through mouse
   Then Admin should land on dashboard page
   Examples:
   |sheetname|Testcase|
   |login|1positive|
   
   
   