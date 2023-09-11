Feature: Add New User

Background:
  Given Admin is logged on the LMS portal
  And Admin is on the dashboard page after login
  And Admin clicks "User" from the navigation bar
  And Admin clicks the "+ A New User" button

Scenario: Check if the required fields exist in the popup
  Given A popup with user details appears
  Then The popup should have the following text boxes:
    | FN            |
    | MN            |
    | LN            |
    | Location      |
    | Phone         |
    | Email         |
    | LinkedIn Url  |
    | Undergraduate |
    | Postgraduate  |
    | Time zone     |
    | User comments |
  And The popup should have the following drop-downs:
    | User Role   |
    | Role status |
    | Visa status |

Scenario: Validate optional fields in the user popup
  Given A popup with user details appears
  When Admin fill in all fields except MN, LinkedIn Url, Email, User comments, Undergraduate, Postgraduate, and Time zone with valid values and click submit
  Then The newly added user should be visible in the data table on the Manage User page

Scenario: Ensure program details are added to the data table
  Given A popup with user details appears
  When Admin fill in all fields with valid values and click submit
  Then The newly added user should be visible in the data table on the Manage User page

Scenario: Check for error messages when providing invalid field values
  Given A popup with user details appears
  When Admin enter invalid values in any of the fields
  Then An error message should appear

Scenario: Validate error messages for unfilled mandatory fields
  Given A popup with user details appears
  When Admin leave any of the mandatory fields blank
  Then An error message should appear
