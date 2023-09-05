Feature: New User Registration1

 @T2
 Scenario: Test the Registration using Excel
 
 		Given user is on Registration1 page
 		When user enters Registration data from given sheetname "<SheetName>" and Rownumber <RowNumber>
    And click on Register1 button
    Then user should be land on home page1

Examples:
	|SheetName |RowNumber |
  |Register  |0|
  |Register  |1|
 