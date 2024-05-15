Feature: Amazon Arama
  @amazonarama
  Scenario: TC01_kullanici amazonda urun arar
    Given kullanici amazon sayfasina gider
    And kullanici arama kutusuna iphone yazar
    Then kullanici sonuc sayisini ekrana yazar