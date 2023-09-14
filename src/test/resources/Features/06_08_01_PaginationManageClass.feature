Feature: Pagination in manage class sc01
Background: Logged on the LMS portal as Admin



#1Verify sheet one is displayed on default in data table	Admin is on dashboard page after Login	Admin clicks "Class" button on the navigation bar	Data table should display 1 page  when entries available

Scenario: Verify sheet one is displayed on default in data table	
Given Admin is on dashboard page after Login	
When Admin clicks "Class" button on the navigation bar	
Then Data table should display 1 page  when entries available

#2Verify  right arrow is enable when sheet one is displayed in data table	Admin is on dashboard page after Login	Admin clicks "Class" button on the navigation bar	Right arrow should be enabled in page one  when entries are more than 5 available

Scenario: Verify  right arrow is enable when sheet one is displayed in data table
Given Admin is on dashboard page after Login
When Admin clicks "Class" button on the navigation bar	
Then Right arrow should be enabled in page one  when entries are more than 5 available

#3 Verify  left arrow is disable when sheet one is displayed in data table	Admin is on dashboard page after Login	Admin clicks "Class" button on the navigation bar	Left arrow should be disabled in page one  when entries are more than 5 available

Scenario: Verify  left arrow is disable when sheet one is displayed in data table
Given Admin is on dashboard page after Login
When Admin clicks "Class" button on the navigation bar
Then Left arrow should be disabled in page one  when entries are more than 5 available

#4Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10	Admin is on dashboard page after Login	Admin clicks "Class" button on the navigation bar	Right arrow should be enabled in page two when entries are more than 10 available

Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
Given Admin is on dashboard page after Login
When Admin clicks "Class" button on the navigation bar
Then Right arrow should be enabled in page two when entries are more than 10 available

#5 Verify left arrow is enable when sheet two is displayed in data table	Admin is on dashboard page after Login	Admin clicks "Class" button on the navigation bar	Left arrow should be enabled in page two 

Scenario: Verify left arrow is enable when sheet two is displayed in data table
Given Admin is on dashboard page after Login
When Admin clicks "Class" button on the navigation bar
Then Left arrow should be enabled in page two

#6Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10	Admin is on dashboard page after Login	Admin clicks "Class" button on the navigation bar	Data table should display  page 1  when entries available

Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
Given Admin is on dashboard page after Login
When Admin clicks "Class" button on the navigation bar
Then Data table should display  page 1  when entries available

#7 Verify pagination controls enabled	Admin is on dashboard page after Login	Admin clicks "Class" button on the navigation bar	When entries are more than 5 in data table pagination controls enabled
Scenario: Verify pagination controls enabled
Given Admin is on dashboard page after Login
When Admin clicks "Class" button on the navigation bar
Then if entries are more than 5 in data table pagination controls enabled

#8Verify pagination controls disabled	Admin is on dashboard page after Login	Admin clicks "Class" button on the navigation bar	When entries are less than 5 in data table pagination controls disabled

Scenario: Verify pagination controls disabled
Given Admin is on dashboard page after Login
When Admin clicks "Class" button on the navigation bar
Then if entries are less than 5 in data table pagination controls disabled

