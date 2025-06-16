Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Country

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | ismetUlkesi18981 |
      | codeInput | ismetKod1        |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | ismetUlkesi18981 |

    Then Success message should be displayed


  Scenario:  CitizenShip Create and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | is12SCUlk1912 |
      | shortName | is11SC11      |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | is12SCUlk1912 |

    Then Success message should be displayed

  Scenario: Create Nationality and Delete

    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | isNTUlk19 |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | isNTUlk19 |

    Then Success message should be displayed


  Scenario: Fee Functionality and Delete

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | isFee42123 |
      | codeInput       | 1736612 |
      | integrationCode | 1221    |
      | priorityCode    | 45555561  |

    And Click on the Element in Dialog
      | toggleBar  |
      | saveClose |

    Then Success message should be displayed

    And User delete the element from dialog
      | isFee2123 |

    Then Success message should be displayed






















