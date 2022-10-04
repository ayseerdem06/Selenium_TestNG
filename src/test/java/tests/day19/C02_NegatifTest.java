package tests.day19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegatifTest {

    @Test
    public void test01() {
/*
        1 ) Bir Class olustur : NegativeTest
        2) Bir test method olustur NegativeLoginTest()
        https://www.hotelmycamp.com/ adresine git
        login butonuna bas
        test data username: manager1 ,  test data password : manager1!
                Degerleri girildiginde sayfaya girilemedigini test et

 */

        //  https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage = new HmcPage();

        // login butonuna bas
        hmcPage.login.click();

        // test data username: manager1 ,  test data password : manager1!
        //  Degerleri girildiginde sayfaya girilemedigini test et
        hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
                .sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        Driver.closeDriver();


    }
}
