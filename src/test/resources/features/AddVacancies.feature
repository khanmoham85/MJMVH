Feature: add Vacancies

  Background: 
    Given I logged into OrangeHRM

  Scenario: check for vacancies
    When I click Recruitment Module and click Vacancies
    And Click Add
    And Select Job Title to any job Title
    And Enter Vacancy Name
    And Enter Hiring Manager to John Smith
    And Enter Number Of Positions one
    And Enter Description
    And I Click Save
    Then I see vacancy details are displayed

 