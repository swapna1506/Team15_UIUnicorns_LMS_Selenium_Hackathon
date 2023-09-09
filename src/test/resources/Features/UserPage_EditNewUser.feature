Feature: Edit User

Background:
  Given Admin is logged on the LMS portal
  And Admin is on the dashboard page after login
  And Admin clicks "User" from the navigation bar
  And Admin clicks the "+ A New User" button

Scenario: Validate row level edit icon functionality
  Given The edit icon on row level in the data table is enabled
  When Admin clicks the edit icon
  Then A popup with user details should appear

Scenario: Verify fields update successfully
  Given Admin triggers the user details popup by clicking the edit icon
  When Admin updates the fields with valid values and clicks submit
  Then The updated user details should be reflected in the data table

Scenario: Ensure error messages appear for invalid field updates
  Given Admin triggers the user details popup by clicking the edit icon
  When Admin updates fields with invalid values and clicks submit
  Then An error message should appear

Scenario: Confirm error message appearance when mandatory fields are emptied
  Given Admin triggers the user details popup by clicking the edit icon
  When Admin erases data from a mandatory field and clicks submit
  Then An error message should appear

Scenario: Verify that the description field is optional during update
  Given Admin triggers the user details popup by clicking the edit icon
  When Admin erases data from the description field and clicks submit
  Then The updated user details, without the description, should be reflected in the data table
