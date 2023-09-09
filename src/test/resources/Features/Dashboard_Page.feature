Feature: Dashboard Page

Background:
    Given Admin visits the correct URL
    And Admin is on the login page
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
    Then LMS title should be on the top left corner of the page

Scenario: Validate navigation bar text
    Then Admin should see correct spelling in navigation bar text

Scenario: Validate LMS title has correct spelling and space
    Then Admin should see correct spelling and space in the LMS title

Scenario: Validate alignment for navigation bar
    Then Admin should see the navigation bar text on the top right side

Scenario Outline: Validate navigation bar order
    Then Admin should see <menu_item> in the <order> place

Examples:
    | menu_item   | order |
    | student    | 1st   |
    | program    | 2nd   |
    | batch      | 3rd   |
    | class      | 4th   |
    | user       | 5th   |
    | assignment | 6th   |
    | attendance | 7th   |
    | logout     | 8th   |

Scenario: Verify Admin remains on login page after login
    Then Admin should land on the login page
