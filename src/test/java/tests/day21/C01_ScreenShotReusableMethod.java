package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    @Test
    public void test01() throws IOException {
        // HepsiBurada sayfasına gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");
        // Ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //Amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amznPage=new AmazonPage();
        //Nutella aratiniz
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazisini Webelementinin resmini aliniz
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amznPage.aramaSonucWE);
        Driver.closeDriver();

    }
}
