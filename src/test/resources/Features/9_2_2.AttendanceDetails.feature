Feature: AttendenceDetails popup window validation

Background: Admin click +Add New Attendance button after reaching to Manage attendance page
   Given Admin is in  attendance details popup window
   
 Scenario: Validate all program name is reflecting in the dropdown
   When Admin clicks  program name dropdown
   Then Program Name in the drop down should match with  program name in  manage program page table
   
 Scenario: Validate all class name  is reflecting in the dropdown
   When Admin clicks class name dropdown
   Then Class Name in the drop down should match with  class name in  manage class page table
   
 Scenario: Validate attendance field dropdown all mandatory keywords
   When Admin clicks attendance dropdown
   Then Attendance field should have keywords such as - present, absent, late, excused
   
 Scenario: Verify spellings in the attendance field drop down 
   When Admin clicks attendance dropdown
   Then Admin should see correct spellings in dropdown text
   
 Scenario: Validate date picker
   When Admin clicks date from date picker
   Then selected date should be their in class date text box
   
 Scenario: validate date picker should be correct format
   When Admin clicks date from date picker
   Then selected date should be in  mm/dd/yyyy format
   
 Scenario: Validate right arrow in data picker to navigate to next month
   When Admin clicks right arrow in the date picker near month
   Then Next month calender should visible
   
 Scenario: Validate left arrow in data picker to navigate to previous month
   When Admin clicks left arrow in the date picker near month
   Then previous month calender should visible
   
  Scenario: Validate current date is highlighted in the date picker
   When Admin clicks date picker button
   Then Admin should see current date is highled in the date picker
   
  Scenario: Validate selected date is highlighted in the date picker
     When Admin clicks date picker button
     Then Admin should see selected date is highled in the date picker
   
   
