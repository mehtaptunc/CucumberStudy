package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
      // Hazır bazı methodlar yazıp tablomuz için oluşturduğumuz xpath'leri sabit hale getirmeliyiz.Bunu da ReusableMethods clasında yapmaya çalışacağız
      // W3Schools pages'ında kullnadığımız @FindBy gibi ama daha dinamik hale getirip her yerden kullanmak için bu methodu oluşturduk.
public class ReusableMethods {
          public static List<WebElement> getBasliklar() {
              return Driver.getDriver().findElements(By.xpath("(//table)[1]//th"));}

          public static List<WebElement> getSatirlar () {
              return Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody/tr"));}


          public static List<WebElement> getHucreler () {
              return Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody//td"));}


          public static List<WebElement> getSatirdakiHucreler ( int satir){
              return Driver.getDriver().findElements(By.xpath("((//table)[1]/tbody/tr)[" + satir + "]"));}


          public static List<WebElement>getSutun(int sutun ){
              return Driver.getDriver().findElements(By.xpath("(//table)[1]//tr/td["+sutun+"]"));
          }

          public static  WebElement getSatirSutun(int satir, int sutun){
              return Driver.getDriver().findElement(By.xpath("(//table)[1]//tr["+satir+"]/td["+sutun+"]"));
          }

}




