#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile 2 farklı senaryo ile kayıt yapınız.

Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario: Create a Citizenship with parameter 1
    When Create a CitizenShip name as "ism12CS121" shortKod as "ic2sk121"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter 2
    When Create a CitizenShip name as "ism12CS456" shortKod as "ic2sk566"
    Then Success message should be displayed