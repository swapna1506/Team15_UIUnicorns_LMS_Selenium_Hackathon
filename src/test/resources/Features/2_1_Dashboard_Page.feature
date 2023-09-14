Feature: Dashboard Page

Background:
    Given Admin visits the correct URL
    And Admin clicks on login button to navigate to login page
    When Admin enters valid credentials
    And Admin clicks the login button

Scenario: Verify after login admin lands on manage program as dashboard page
    Then Admin should see "manage program" as the header

Scenario: Verify the response time
    Then Maximum navigation time in milliseconds should default to 30 seconds

Scenario: Verify broken link
    Then if HTTP response is >= 400 the link is broken

Scenario: Verify LMS title
    Then Admin should see "LMS - Learning Management System" as the title

Scenario: Verify LMS title alignment
    Then LMS title should be on the top left corner of the page assuming top left is 10,10

Scenario: Validate navigation bar text
    Then Admin should see correct spelling in navigation bar text

Scenario: Validate LMS title has correct spelling and space
    Then Admin should see correct spelling and space in the LMS title

Scenario: Validate alignment for navigation bar
    Then Admin should see the navigation bar text container is on the top right side

Scenario Outline: Validate navigation bar order
    Then Admin should see "menu_item" in the "expectedIndex" place

Examples:
    | menu_item   | expectedIndex |
    | Student    | 0   |
    | Program    | 1   |
    | Batch      | 2   |
    | Class      | 3   |
    | User       | 4   |
    | Assignment | 5   |
    | Attendance | 6   |
    | Logout     | 7   |

