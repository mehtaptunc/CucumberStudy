package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        //test adımlarının bulunduğu klasör
        tags = "@tables",
        // feature kısmında senaryo tagımızdan alıyoruz.Bu testi çalıştırmak istediğimiz için yani seçilen tag koşturulur
        dryRun = false

        // true ise eksik olan bir adım varsa onu bana söyler stepdef daki adımları terminalde gösterir
        // false ise direkt teste başlar

)
public class Runner {
}
