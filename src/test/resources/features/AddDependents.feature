@AddDependents
Feature: test

  Scenario Outline: add dependents
    When login with valid credentials
    Then navigate to add employee list page
    When enter employee ID "8438"
    Then click on Search button
    When add new dependent, enter "<Name>", choose "<Relationship>", enter specification if needed "<Other>", and data birth, "<Month>", "<Date>", "<Year>" and verify if it is added
		
		
    Examples: 
      | Name  | Relationship | Other   | Month | Date | Year |
      | Asyl  | Child        |         | Jul   |   23 | 1985 |
      | Vasya | Other        | Brother | Apr   |   15 | 1986 |
      | Atai  | Child        |         | Jun   |   10 | 1984 |
