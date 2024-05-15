package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        // Driverımızı Driver classımızdan alıp parametre olarak gönderiyoruz  yanına da this ifadesini ekleyerek sayfayı parametre olarak gönderiyoruz
    }
        @FindBy (id = "twotabsearchtextbox" )
        public WebElement aramaKutusu;
        @FindBy (xpath= "//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]" )
        public WebElement sonucSayisi;

}
