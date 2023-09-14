Feature: Pagination in manage class sc02
Background: Admin click +Add New Class button after reaching to Manage class page



#9 Verify next page is enabled	Admin is in add class details popup window	Admin creates 6 new class 	When total class entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)

Scenario: Verify next page is enabled
Given Admin is in add class details popup window
When Admin creates 6 new class
Then If total class entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)

#10 verify next page is disabled	Admin is in add class details popup window	Admin creates less than or equal to 5 new class 	When total class entries  5 or below next page is disabled

Scenario: Verify next page is disabled	
Given Admin is in add class details popup window
When Admin creates less than or equal to 5 new class
Then If total class entries  5 or below next page is disabled
