Feature: User Page Validation

Background:
  Given Admin is logged on the LMS portal
  And Admin is on the dashboard page after Login
  When Admin clicks "User" from navigation bar

Scenario: Validate landing in User page
  Then Admin should see "Manage User" in the URL

Scenario: Validate header in the User Page
  Then Admin should see "Manage User" in the header

Scenario: Validate pagination in the User Page
  Then Admin should see the pagination controls under the data table

Scenario: Validate data table headers in the User Page
  Then Admin should see the data table with headers Id, Name, location, Phone Number, Edit/Delete

Scenario: Validate Delete button in User Page
  Then Admin should see a "Delete" icon button that is disabled

Scenario: Validate "+ A New user" button in User Page
  Then Admin should see the "+ A New User" button

Scenario: Validate "+ Assign staff" button in User page
  Then Admin should see the "+ Assign staff" button

Scenario: Validate search box in User page
  Then Admin should see the search text box

Scenario: Validate checkboxes in data rows
  Then Each row in the data table should have a checkbox

Scenario: Validate edit icons in data rows
  Then Each row in the data table should have an edit icon that is enabled

Scenario: Validate delete icons in data rows
  Then Each row in the data table should have a delete icon that is enabled

Scenario: Validate pop up for adding a user
  When Admin clicks "+ A New User" button
  Then A popup with user details should appear
