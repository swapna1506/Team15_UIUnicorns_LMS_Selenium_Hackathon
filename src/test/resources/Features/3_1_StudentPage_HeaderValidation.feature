Feature: Navigating Validation from Student Page to other Pages

Background: 
    Given Admin is logged into the LMS portal 
    And Admin is on the student details page

Scenario Outline: Validate navigation links from student page
    When Admin clicks on the <link_name> link on the student page
    Then Admin is redirected to the <target_page> page

Examples:
    | link_name    | target_page   |
    | Program      | Program       |
    | Batch        | Batch         |
    | Class        | Class         |
    | User         | Student       |  
    | Assignment   | Assignment    |
    | Attendance   | Attendance    |
    | Logout       | Logout        |
