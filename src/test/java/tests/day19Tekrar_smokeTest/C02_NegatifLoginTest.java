package tests.day19Tekrar_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegatifLoginTest {

        @Test (priority = 1)
        public void yanlisSifreTest01() {
            // 1. Senaryo : Yanlış Sifre ve doğru kullanıcı adı ile  giriş yapıp test edin

            BrcPage brcpPage = new BrcPage();
            // https://www.bluerentalcars.com/ adresine git
            Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

            // login butonuna bas
            brcpPage.ilkLoginButonu.click();

            // test data user email: customer@bluerentalcars.com
            brcpPage.emailTexBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));

            // test data passeord: 12345
            brcpPage.passwordTexBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));

            // login butonuna tıklayın
            brcpPage.ikinciLoginButonu.click();

            // degerler girildiğinde sayfaya başarılı bir şekilde girilemediğini test edelim
            Assert.assertTrue(brcpPage.ikinciLoginButonu.isDisplayed());
            Driver.closeDriver();

        }


    @Test  (priority = 2)
    public void yanlisKullaniciAdiTest02() {
        // 2. Senaryo : Yanlış kullanıcı adı doğru şifre ile giriş yapıp test edin

        BrcPage brcpPage = new BrcPage();
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        // login butonuna bas
        brcpPage.ilkLoginButonu.click();

        // test data user email: customer@bluerentalcars.com
        brcpPage.emailTexBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));

        // test data passeord: 12345
        brcpPage.passwordTexBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));

        // login butonuna tıklayın
        brcpPage.ikinciLoginButonu.click();

        // degerler girildiğinde sayfaya başarılı bir şekilde girilemediğini test edelim
        Assert.assertTrue(brcpPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();

    }


    @Test (priority = 3)
    public void yanlisKullaniciAdiSifreTest03() {
        // 3. Senaryo : Yanlış Kullanıcı adı ve  Şifre şifre ile test edin

        BrcPage brcpPage = new BrcPage();

        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        // login butonuna bas
        brcpPage.ilkLoginButonu.click();

        // test data user email: customer@bluerentalcars.com
        brcpPage.emailTexBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));

        // test data passeord: 12345
        brcpPage.passwordTexBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));

        // login butonuna tıklayın
        brcpPage.ikinciLoginButonu.click();

        // degerler girildiğinde sayfaya başarılı bir şekilde girilemediğini test edelim
        Assert.assertTrue(brcpPage.ikinciLoginButonu.isDisplayed());
        Driver.closeDriver();

    }

 }
