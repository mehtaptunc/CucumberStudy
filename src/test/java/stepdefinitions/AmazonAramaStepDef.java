package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonAramaStepDef {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://www.amazon.com/");
    }
    @Given("kullanici arama kutusuna iphone yazar")
    public void kullanici_arama_kutusuna_iphone_yazar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);

    }
    @Then("kullanici sonuc sayisini ekrana yazar")
    public void kullanici_sonuc_sayisini_ekrana_yazar() {
        String sonucSayisi =amazonPage.sonucSayisi.getText();
        System.out.println("SONUÇ SAYISI :" + sonucSayisi);
    }

}
