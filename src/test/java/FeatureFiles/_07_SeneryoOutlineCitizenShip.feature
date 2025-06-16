Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario Outline: Create a Citizenship with parameter

    When Create a CitizenShip name as "<name>" shortKod as "<shortName>"
    Then Success message should be displayed
    When Create a CitizenShip name as "<name>" shortKod as "<shortName>"
    Then Already exist message should be displayed
    When user delete name as "<name>"
    Then Success message should be displayed

    Examples:
      | name    | shortName    |
      | is71m5672CS1 | is71mCSor1t |
      | is71m5672CS2 | is71mCSor1t |
      | is71m5672CS3 | is71mCSor1t |
      | is71m5672CS4 | is71mCSor1t |
      | is71m5672CS5 | is71mCSor1t |

     #  dataProvider (TestNG için), Senaryo Outline (cucumber)
     #  görevi verilen her değer için, tüm senayo çalışır

  # TODO : Sates menusu create,update,delete olarak, Senaryo outline şeklinde 5 kez çalıştırınız