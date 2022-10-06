package tests.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.awt.*;

public class C02 extends TestBaseRapor {

    //https://www.bluerentalcars.com/ adresine git
    //login butonuna bas
    //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
    //login butonuna tiklayin
    //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et


    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"ayse@gmail.com","12345"},{"azra@gmail.com","45678"},{"fatma@gmail.com","98765"}};
    }
    @Test (dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        //login butonuna bas
        BrcPage brc = new BrcPage();
        brc.ilkLoginButonu.click();

        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin
        brc.emailTexBox.sendKeys(userEmail);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password)
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brc.ikinciLoginButonu.isDisplayed());





    }
}
