Feature: Delete User from LMS Portal

Background:
  Given Admin is logged on the LMS portal
  And Admin is on the dashboard page
  And Admin has navigated to "User" from the navigation bar

Scenario: Validate row level delete icon prompts a confirmation alert
  Given The delete icon on row level in the data table is enabled
  When Admin clicks the delete icon
  Then An alert appears with "yes" and "no" options

Scenario: Validate user deletion after confirming from the alert
  Given The delete icon on row level in the data table is enabled
  When Admin clicks the "yes" option on the confirmation alert
  Then A "User deleted" alert pops up
  And The user is no more available in the data table

Scenario: Validate user is not deleted when declining from the alert
  Given Admin has triggered the delete confirmation alert
  When Admin clicks the "no" option
  Then The user is still listed in the data table