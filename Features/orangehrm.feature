@regression
Feature: To validate the fields
  

 
  Scenario: login with valid credentials
    Given user launches the URL
    And entering the value in USERNAME
    And entering the value in PASSWORD
    Then clicking on the login button
    And landed in the nextpage
    
 Scenario: validating the Admin field
    Given user launches the URL
    And entering the value in USERNAME
    And entering the value in PASSWORD
    Then clicking on the login button
    When landed in the nextpage
    Then validating the Admin field by clicking on it whether its redirecting to the required page or not
    
    Scenario: validating the PIM field
     Given user launches the URL
    And entering the value in USERNAME
    And entering the value in PASSWORD
    Then clicking on the login button
    When landed in the nextpage
     Then validating the PIM field by clicking on it whether its redirecting to the required page or not
   
     Scenario: validating the Leave field
     Given user launches the URL
    And entering the value in USERNAME
    And entering the value in PASSWORD
    Then clicking on the login button
    When landed in the nextpage
     Then validating the Leave field by clicking on it whether its redirecting to the required page or not
    

  
