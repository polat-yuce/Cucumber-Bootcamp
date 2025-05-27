# Login fonksiyon Kontrolü
# Önce Siteye git (driver get)
# Sonra Login bilgilerini gir (useranme password sendKeys)
# Sonra giriş yaptığını kontrol et (verify, Assert)

Feature: Login Functionality


  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully