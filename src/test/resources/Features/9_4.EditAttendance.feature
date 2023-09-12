Feature: Edit Attendance

Background: Admin click +Add New Attendance button after reaching to Manage attendance page
 Given Admin is in  attendance details popup window
 
 Scenario: Validate admin able to update new attendance data
   When Admin fills all the values and click save to update
   Then Admin should see success message in popup window and sees updated attendance details in manage attendance details DB
   
 Scenario: Validate admin able to update new attendance data without program name
   When Admin fills values missing program name and click save to update
   Then Program name is missing
   
  Scenario: Validate admin able to update new attendance data without class name
   When Admin fills values missing class name and click save to update
   Then class name is missing
   
 Scenario: Validate admin able to update new attendance data without student name
   When Admin fills values missing student name and click save to update 
   Then student name is missing
   
  Scenario: Validate admin able to update new attendance data without attendances
   When Admin fills values missing attendance and click save to update
   Then Attendance is missing
   
  Scenario: Validate admin able to update new attendance data without attendance date
   When Admin fills values missing attendance date  and click save to update 
   Then Attendance date is missing
   
  Scenario: Validate admin able to update new attendance by selecting future date
   When Admin fills values with future date  and click save to update 
   Then Invalidate attendance date
 