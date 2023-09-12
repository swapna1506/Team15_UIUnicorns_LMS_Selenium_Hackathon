Feature: Add New Attendance

Background: Admin click +Add New Attendance button after reaching to Manage attendance page
 Given Admin is in  attendance details popup window
 
 Scenario: Validate admin able to create new attendance data
   When Admin fills all the values and click save
   Then Admin should see success message in popup window and sees new attendance details in manage attendance details DB
   
 Scenario: Validate admin able to create new attendance data without program name
   When Admin fills values missing program name and click save
   Then Program name is missing
   
  Scenario: Validate admin able to create new attendance data without class name
   When Admin fills values missing class name and click save
   Then class name is missing
   
 Scenario: Validate admin able to create new attendance data without student name
   When Admin fills values missing student name and click save  
   Then student name is missing
   
  Scenario: Validate admin able to create new attendance data without attendances
   When Admin fills values missing attendance and click save
   Then Attendance is missing
   
  Scenario: Validate admin able to create new attendance data without attendance date
   When Admin fills values missing attendance date  and click save  
   Then Attendance date is missing
   
  Scenario: Validate admin able to create new attendance by selecting future date
   When Admin fills values with future date  and click save  
   Then Invalidate attendance date

