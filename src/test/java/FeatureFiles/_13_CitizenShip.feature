# CitizenShip menusunun kayıt ve silme özelliğini
# (DataTable ile) 5 farklı değer seti ile çalıştırınız.

Feature: CitizenShip Functionality DataTable ve Senaryo Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline:  CitizenShip Create and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name>  |
      | shortName | <short> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name   | short   |
      | is1CS31 | is1Sk31 |
      | is1CS32 | isC1Sk32 |
      | is1CS33 | isC1Sk33 |
      | is1CS34 | isC1Sk34 |
      | is1CS35 | isC1Sk3