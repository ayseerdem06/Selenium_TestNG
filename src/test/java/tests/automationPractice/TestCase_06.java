package tests.automationPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_06 {

    /*
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Contact Us' button
    5. Verify 'GET IN TOUCH' is visible
    6. Enter name, email, subject and message
    7. Upload file
    8. Click 'Submit' button
    9. Click OK button
    10. Verify success message 'Success! Your details have been submitted successfully.' is visible
    11. Click 'Home' button and verify that landed to home page successfully

    Ceviri :
    1. Tarayıcıyı başlatın
    2. 'http://automationexercise.com' URL'sine gidin
    3. Giriş sayfasının başarıyla göründüğünü doğrulayın
    4. 'Bize Ulaşın' düğmesine tıklayın
    5. 'GET IN CONTACT' ifadesinin görünür olduğunu doğrulayın
    6. Ad, e-posta, konu ve mesaj girin
    7. Dosya yükle
    8. 'Gönder' düğmesine tıklayın
    9. tık OK düğmesi
    10. 'Başarılı! Bilgileriniz başarıyla gönderildi.' mesajı görüntülenir
    11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla ulaştığını doğrulayın
     */

    @Test
    public void test01() throws InterruptedException {
        AutomationPage automationPage=new AutomationPage();
        Actions actions = new Actions(Driver.getDriver());
        //2. 'http://automationexercise.com' URL'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("atmUrl"));

        // 3. Giriş sayfasının başarıyla göründüğünü doğrulayın
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl= "https://automationexercise.com/";
        Assert.assertEquals(actualUrl,expectedUrl);

        // 4. 'Bize Ulaşın' düğmesine tıklayın
        automationPage.contactUs.click();
        Driver.getDriver().getWindowHandle();

        // 5. 'GET IN CONTACT' ifadesinin görünür olduğunu doğrulayın
        Assert.assertTrue(automationPage.getInTouch.isDisplayed());

        // 6. Ad, e-posta, konu ve mesaj girin
        automationPage.getName.click();
        actions.sendKeys("Ayse").sendKeys(Keys.TAB).sendKeys("ayse002@gmail").
                sendKeys(Keys.TAB).sendKeys("ahahkjklsdl").sendKeys(Keys.TAB).
        sendKeys("hhkldhfkhfljlmkdşkfşf").perform();

        //7. Dosya yükle
        automationPage.uploadFile.click();

        //8. Click 'Submit' button
        automationPage.submitClick.click();







    }
}
