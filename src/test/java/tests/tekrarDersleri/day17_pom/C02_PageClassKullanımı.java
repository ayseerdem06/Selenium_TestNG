package tests.tekrarDersleri.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C02_PageClassKullanımı {

    @Test
    public void test01() {
        FacebookPage facebookPage=new FacebookPage();

        // facebook anasayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");

        // kullanıcı mail kutusuna rastgele bir isim yazdırın.
        Faker faker=new Faker();
        facebookPage.email.sendKeys(faker.internet().emailAddress());

        // kullanıcı şifre kutusuna rastgele bir password yazdırın
        facebookPage.sifre.sendKeys(faker.internet().password());

        // login butonuna basın
        facebookPage.login.click();

        // giriş yapılamadığını  test edin
        Assert.assertTrue(facebookPage.girisYapilmadi.isDisplayed());

        Driver.closeDriver();
    }
}
