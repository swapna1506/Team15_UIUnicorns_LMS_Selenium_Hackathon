Feature: Displays entries with that assignment name
Scenario: Verify Assignment details popup window
Given Admin logged into LMS portal and clicks assignment button on the navigation bar 
When Admin is on manage assignment Page
Then Admin should see a popup  with  heading "Assignment details"
Scenario: Verify input fields in Assignment details popup window
Given Admin logged into LMS portal and clicks assignment button on the navigation bar 
Then Admin should see input fields Text (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
Scenario: Verify text box present in Assignment details popup window
Given Admin logged into LMS portal and clicks assignment button on the navigation bar 
When Admin is on manage assignment Page
Then 8 textbox should be  present in Assignment details popup window
Scenario: Verify drop down in Batch Number  in Assignment details popup window
Given Admin logged into LMS portal and clicks assignment button on the navigation bar 
When Admin is on manage assignment Page
Then Admin should see  dropdown option for Batch Number
Scenario: Verify drop down in Program name  in Assignment details popup window
Given Admin logged into LMS portal and clicks assignment button on the navigation bar
When Admin is on manage assignment Page 
Then Admin should see  dropdown option for Program name
Scenario: Verify calendar icon in Assignment due date  in Assignment details popup window
Given Admin logged into LMS portal and clicks assignment button on the navigation bar 
When Admin is on manage assignment Page
Then Admin should see  calendar icon for assignment due date	
Scenario: Verify save button is present
Given Admin logged into LMS portal and clicks assignment button on the navigation bar 
When Admin is on manage assignment Page
Then Admin should see  calendar icon for assignment due date
Scenario: Verify cancel button is present
Given Admin logged into LMS portal and clicks assignment button on the navigation bar 
When Admin is on manage assignment Page
Then Admin should see  calendar icon for assignment due date
Scenario: Verify close button in  Assignment details popup window
Given Admin logged into LMS portal and clicks assignment button on the navigation bar 
When Admin is on manage assignment Page
Then Admin should see  calendar icon for assignment due date
