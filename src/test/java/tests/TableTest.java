package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.W3Schools;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TableTest {
    // CASE: Xpath yardımıyla web tablolarını kolay ve dinamik  bir şekilde incelemek
    W3Schools schools = new W3Schools();
    @Test
    public void tumBasliklar(){
        String url="https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        // List<WebElement> Liste şeklinde data geleceği için(tüm liste için for u kullandık )
        for (WebElement element : schools.basliklar){
            System.out.println(element.getText());
        }
    }

    @Test
    public void tumHucreler(){
        String url="https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);
        for (WebElement element: schools.hucreler){
            System.out.println(element.getText());
        }
    }

    @Test
    public void tumBasliklarReusableMethods(){
        String url="https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        List<WebElement>liste = ReusableMethods.getBasliklar();
        for (WebElement element : liste){
            System.out.println(element.getText());
        }

    }

    @Test
    public void satirSutunTesti(){
        String url="https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

       WebElement element = ReusableMethods.getSatirSutun(5,3);
        System.out.println(element.getText());
    }
}
