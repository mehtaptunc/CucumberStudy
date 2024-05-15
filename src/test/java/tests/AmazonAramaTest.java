package tests;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonAramaTest {
    AmazonPage amazonPage = new AmazonPage();
    @Test
    public void aramaTesti(){
        String url="https://www.amazon.com/";
        Driver.getDriver().get(url);

    }
}
