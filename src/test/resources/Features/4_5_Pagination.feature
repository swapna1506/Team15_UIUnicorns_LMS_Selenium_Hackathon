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

Feature: Pagination

Background: Admin is on Manage Program Page 
Given: 
When: 
Then: 

Scenario: Verify Next page link
Given: Admin is on Manage Program page
When: Admin clicks Next page link on the program table 
Then: Admin should see the Pagination has "Next" link

Scenario: Verify Last page link
When: Admin clicks Last page link
Then: Admin should see the last page record on the table with Next page link are disabled

Scenario: Verify First page link
Given: Admin is on last page of Program table
When: Admin clicks First page link
Then: Admin should see the previous page record on the table with pagination has previous page link

Scenario: Verify Start page link
Given: Admin is on Previous Program page 
When: Admin clicks Start page link
Then: Admin should see the very first page record on the table with Previous page link are disabled


 