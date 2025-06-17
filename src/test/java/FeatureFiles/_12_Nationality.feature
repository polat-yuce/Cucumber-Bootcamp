Feature: Nationality DataTable ve Senaryo Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create Nationality and Delete

    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name    |
      | isN1K11 |
      | isN1K21 |
      | isN1K31 |
      | isN1K41 |

