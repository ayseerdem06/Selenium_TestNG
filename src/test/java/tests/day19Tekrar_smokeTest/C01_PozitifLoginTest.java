package tests.day19Tekrar_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PozitifLoginTest {

    BrcPage brcpPage=new BrcPage();
    @Test
    public void pozitifTest01() {

        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        // login butonuna bas
        brcpPage.ilkLoginButonu.click();

        // test data user email: customer@bluerentalcars.com
        brcpPage.emailTexBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));

        // test data passeord: 12345
        brcpPage.passwordTexBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));

        // login butonuna tıklayın
        brcpPage.ikinciLoginButonu.click();

        // degerler girildiğinde sayfaya başarılı bir  şekilde girildiğini test edelim
        System.out.println(brcpPage.kullaniciProfilIsmi.getText());
        String actulanUserName= brcpPage.kullaniciProfilIsmi.getText();
        String expectedUserName=ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actulanUserName,expectedUserName);
        Driver.closeDriver();


    }
}
