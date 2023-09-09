Feature: Student Page Verification

Background: 
    Given Admin is logged into the LMS portal
    And Admin is on the dashboard page after login

Scenario Outline: Validate navigations and elements on student page
    When Admin clicks Student on the navigation bar
    Then Admin should see <expected_outcome>

Examples:
    | expected_outcome                                               |
    | the Student details Page Title                                 |
    | Maximum navigation time in milliseconds, defaults to 30 seconds|
    | LMS-Learning management system as title                        |
    | Student Detail title in the center of the page                 |
    | Two dropdowns on the page                                      |
    | a search box inside the Student name dropdown                  |
    | a search box inside the batch ID dropdown                      |
    | correct spelling for "select student name"                     |
    | correct spelling for "select batch ID"                         |

Scenario: Validate the broken link
    When Admin clicks Student on the navigation bar
    Then if HTTP response is >= 400 the link is broken

Scenario Outline: Validate dropdown attributes
    When Admin clicks Student on the navigation bar
    Then Admin should see <dropdown_name> in <color> color and <other_attributes>

Examples:
    | dropdown_name        | color | other_attributes                                    |
    | select student name  | gray  | the correct spelling                                |
    | select batch ID      | gray  | only numbers                                        |
    | select student name  | gray  | as the first dropdown                               |
    | select batch ID      | gray  | as the second dropdown                              |
    | select student name  | gray  | scroll functionality                                |
    | select batch ID      | gray  | scroll functionality                                |

Scenario Outline: Dropdown interactions
    Given Admin is on the student details page
    When Admin selects <action> from the <dropdown>
    Then Admin should <result>

Examples:
    | action                        | dropdown             | result                                          |
    | a name                        | student name dropdown| be able to scroll down to select the name       |
    | a batch ID                    | batch ID dropdown    | be able to scroll down to select the batch ID   |
    | student name                  | student name dropdown| not see "select student name" text              |
    | batch ID                      | batch ID dropdown    | not see "select batch ID" text                  |
    | x alphabet in the search box  | student name dropdown| see student names starting with "x" listed below|
    | x number in the search box    | batch ID dropdown    | see batch IDs starting with "x" listed below   |
    | only the student name         | student name dropdown| not see student details displayed               |
    | only the batch ID             | batch ID dropdown    | not see student details displayed               |

Scenario: Display student info when both student name and batch ID are selected
    Given Admin is on the student details page
    When Admin selects both a student name and batch ID from their respective dropdowns
    Then The selected student information should be displayed
