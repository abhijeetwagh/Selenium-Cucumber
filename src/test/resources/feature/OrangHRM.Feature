#StoryType=WEB
#Owner=Abhijeet
#CreationDate=26-01-2019 Saturday
@OrangeHRM

Feature: Login Feature

  Background: user is successfully logged in
   When user opens the "Chrome" browser
   And user enters the url "https://opensource-demo.orangehrmlive.com/"
   When user enters "Admin" as username
   And user enters "admin123" as password
   And user clicks on login button
   
  @EndToEnd
  Scenario: User Check Admin Functionality
     Given user is on the application Dashboard page
     Then user click on Admin tab
     Then user moves a cursor on the User Management
     Then user click on Users
     Then user is on application Users page
     And user enter "Admin"
     And user select user Role
     And user enter "Hannah" Name
     And user select Status
     Then user click on Search
      
      
      