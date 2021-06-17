Feature: Hotel Booking In Adactin Application

Scenario: 
	Given user Launch The Application
    When user Enter The "rebelnaveen06" In Username Field
    And user Enter The "301113028" In Password Field 
    Then user Click On The Login Button And It Navigates To The Search Hotel Page
    
        
Scenario: 
    When user Select The Location In Location Field
    And user Select The Hotel In Hotel Field
    And user Select The Room Type In Room Type Field
    And user Select The No Of Rooms In Number Of Rooms Field
    And user Select The Check In Date In Check In Field
    And user Select The Check Out Date In Check Out Field
    And user Select The Adults Per Room In Adults Room Field
    And user Select The Child Per Room In Child Room Field
    Then user Click On The Submit Button And It Navigates To The Select Hotel Page
     
Scenario: 
    When user Click The Radio Button 
    Then user Click The Continue Button And It Navigate To The Book A Hotel Page

Scenario: 
    When user Enter The First Name In First Name Field
    And user Enter The Last Name Inn Last Name Field
    And user Enter The Address In The Address Field
    And user Enter The Ccno In Cridit Card No Field
    And user Select The Cc Type In Cridit Card Type Field  
    And user Select The Cridit Card Expiry Month In Select Month Field
    And user Select The Cridit Card Expiry Year In Select Year Field
    And user Enter The Cridit Card Cvv number In Cvv Number Field 
    Then user Click The Book Now Button And It Navigates To The Book Confirmation Page

Scenario: 
    When user Click The My Itinenary Button
    Then It Navigates To Booked Itinenary Page
    
Scenario: 
    When user Click The Logout Button 
    Then It Navigates To Login Again Page    


