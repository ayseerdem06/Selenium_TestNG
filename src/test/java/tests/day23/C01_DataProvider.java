package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {

    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
        //site içinde aratmak istediğimiz kelimeleri tek tek (ana sayfaya dönerek yeniden) aratmak için
        //oluşturduğumuz method'dur.
    }

    @Test (dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler ) {
        AmazonPage amazonPage = new AmazonPage();
        //Amazon sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        Driver.getDriver().navigate().refresh();

        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler, Keys.ENTER);
        //sonuclarin aradigimiz kelime icerdigini test edelim
        String expectedKelime = kelimeler;
        String actualKelime = amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));
    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        //sayfayi kapatalim
        Driver.closeDriver();
    }
}


/*
    fake amazona takılmamak için eklenebilir
    try {
    amazonPage.searchBox.sendKeys(kelime, Keys.ENTER);
    } catch (Exception e) {
    Driver.getDriver().navigate().refresh();
    }
 */