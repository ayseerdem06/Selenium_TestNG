package tests.day17Tekrar_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_YeniİlkDriver {

    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();

        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // nutella aratalım
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sonuc yazısının nutella içerdiğini test edin
        String actualSonuc= amazonPage.aramaSonucWE.getText();
        String arananKelime="Nutella";

        Assert.assertTrue(actualSonuc.contains(arananKelime));
        Driver.closeDriver();


    }
}
