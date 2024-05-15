package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class W3SchoolsStepDef {
    @Given("kullanici w3schools sayfasina gider")
    public void kullanici_w3schools_sayfasina_gider() {
        Driver.getDriver().get("https://www.w3schools.com/html/html_tables.asp");
    }

    @Then("kullanici birinci sutundaki sirket isimlerini ekrana yazar")
    public void kullanici_birinci_sutundaki_sirket_isimlerini_ekrana_yazar() {
        List<WebElement>liste = ReusableMethods.getSutun(1);

            for (WebElement element: liste){
                System.out.println(element.getText());
            }
        }

    }

