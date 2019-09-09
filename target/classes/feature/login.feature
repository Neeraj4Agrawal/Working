Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario

#Given When user already on Login Page
#When title of the page is Free CRM
#Then user enters "neeraj4agarwal@gmail.com" and "Neeraj4@"




Scenario Outline: Free CRM Login Test Scenario

Given When user already on Login Page
When title of the page is Free CRM
Then user enters "<username>" and "<password>"

Examples:
         | username               |password|
         |neeraj4agarwal@gmail.com|Neeraj4@|
         |neeraj                  |neeraj4@|
         |Neeraj                  |Neeraj4@|
         
                  
                                            
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         