Feature: Dashboard Functionality

@dash
  Scenario: Dasboard tab verification
    When login with valid credentials
    Then verify the followinf dashboard tabs
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |
      
