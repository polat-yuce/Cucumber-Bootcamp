Feature: Datatable Ornek

  Scenario: User write
    When Write username "ismet"
    When Write username and password "ismet" and "1234"

    And Write username as Datatable
      | ismet   |
      | Ummuhan |
      | İbrahim |
      | Neşe    |
      | Engin   |

    And Write username and password as Datatable
      | ismet   |12344   |
      | Ummuhan |12345   |
      | İbrahim |12346   |
      | Neşe    |12347   |
      | Engin   |12348   |

 #  dataProvider (TestNG için), Senaryo Outline (cucumber)
 #  görevi verilen her değer için, tüm senayo çalışır
 #
 #  DataTable ise , sadece bir step e, çoklu parametre vermek
 #  için kullanılır, sadece 1 kez tüm parametreleri stepin içine atar