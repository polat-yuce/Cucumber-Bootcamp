# TODO : Country menusu create,delete olarak, Senaryo outline şeklinde 5 kez çalıştırınız

Feature: Country Senaryo Outline

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country

  Scenario Outline: Country with Parameter
    When Create a country name as "<name>" code as "<code>"
    Then Success message should be displayed
    When Create a country name as "<name>" code as "<code>"
    Then Already exist message should be displayed
    When user delete name as "<name>"
    Then Success message should be displayed

    Examples:
      | name        | code    |
      | Is112T451y  | is1112m |
      | Is1m13T451y | i1s212m |
      | Is1m14T451y | i1s312m |
      | Is1m15T451y | i1s412m |
      | Is1m16T451y | i1s512m |



