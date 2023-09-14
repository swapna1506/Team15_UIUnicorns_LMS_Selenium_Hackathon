Feature: Pagination in manage attendance

Background: Admin logged on the LMS portal

Scenario: Verify sheet one is displayed on default in data table
 Given Admin is on dashboard page after Login
 When Admin clicks "attendance" button on the navigation bar
 Then Data table should display first page when entries available
 
Scenario: Verify  right arrow is enable when sheet one is displayed in data table
  Given Admin is on dashboard page after Login
  When Admin clicks "attendance" button on the navigation bar
  Then Right arrow should be enabled in page one  when entries are more than 5 available
  
 Scenario: Verify left arrow is disable when sheet one is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then Left arrow should be disabled in page one  when entries are more than 5 available
    
  Scenario: Verify  right arrow is enable when sheet two is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then Right arrow should be enabled in page two when entries are more than 10 available
    
  Scenario: Verify  left arrow is enable when sheet two is displayed in data table
     Given Admin is on dashboard page after Login
     When Admin clicks "attendance" button on the navigation bar
     Then Left arrow should be enabled in page two when entries are more than 10 available
     
  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
      
     Given Admin is on dashboard page after Login
     When Admin clicks "attendance" button on the navigation bar
     Then Data table should display  page one when entries available
     
  Scenario: Verify pagination controls enabled
     Given Admin is on dashboard page after Login
     When Admin clicks "attendance" button on the navigation bar
     Then when entries are more than 5 in data table pagination controls enabled
     
   Scenario: Verify pagination controls enabled
     Given Admin is on dashboard page after Login
     When Admin clicks "attendance" button on the navigation bar
     Then when entries are less than 5 in data table pagination controls disabled
     
   Scenario: Verify next page is enabled
     Given Admin is in attendance details pop up after clicking +Add New attendance
     When Admin creates 6 new attendance
     Then when total attendance entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)
     
   Scenario: Verify next page is enabled
     Given Admin is in attendance details pop up after clicking +Add New attendance
     When Admin creates less than or equal to 5 new attendance
     Then when total attendance entries  5 or below next page is disabled
     
     