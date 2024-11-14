#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Validating Place API's

@AddPlace  @Regression
  Scenario Outline: Verify if Place is being sucessfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<lanugage>" "<address>"
    When user calls "AddPlaceAPI" with "Post" http request
    Then the API call is success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And Verify place_id created maps to "<name>" using "getPlaceApi"

    Examples: 
      | name    | lanugage | address            |
      | AAhouse | English  | World cross center |
   #   | BBhouse | French   | Sea cross center   |

@DeletePlace
   Scenario: Verify id delete place functionality is working 
   	Given DeletePlace payload 
   	When user calls "deletePlaceApi" with "Post" http request
   	Then the API call is success with status code 200
   	And "status" in response body is "OK"
   	
   	