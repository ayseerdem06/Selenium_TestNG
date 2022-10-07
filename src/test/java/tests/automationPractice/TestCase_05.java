package tests.automationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_05 {

    /*
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'New User Signup!' is visible
    6. Enter name and already registered email address
    7. Click 'Signup' button
    8. Verify error 'Email Address already exist!' is visible

    Ceviri :
    1. Tarayıcıyı başlatın
    2. 'http://automationexercise.com' URL'sine gidin
    3. Giriş sayfasının başarıyla göründüğünü doğrulayın
    4. 'Kayıt / Giriş' düğmesine tıklayın
    5. 'Yeni Kullanıcı Kaydı!' ifadesinin görünür olduğunu doğrulayın
    6. Adı ve önceden kayıtlı e-posta adresini girin
    7. 'Kaydol' düğmesine tıklayın
    8. 'E-posta Adresi zaten var!' hatasının görünür olduğunu doğrulayın
     */

    @Test
    public void test01() {

        AutomationPage aotomationPage=new AutomationPage();

        //2. 'http://automationexercise.com' URL'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("atmUrl"));

        // 3. Giriş sayfasının başarıyla göründüğünü doğrulayın
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl= "https://automationexercise.com/";
        Assert.assertEquals(actualUrl,expectedUrl);

        //4. 'Kayıt / Giriş' düğmesine tıklayın
       aotomationPage.login.click();

       // 5. 'Yeni Kullanıcı Kaydı!' ifadesinin görünür olduğunu doğrulayın
        Assert.assertTrue(aotomationPage.newUserSignup.isDisplayed());

        //  6. Adı ve önceden kayıtlı e-posta adresini girin
        aotomationPage.name.sendKeys("Ayse");
        aotomationPage.email.sendKeys("ayse002@gmail");

        // 7. 'Kaydol' düğmesine tıklayın
        aotomationPage.signupButton.click();

        //  8. Verify error 'Email Address already exist!' is visible
        //8. 'E-posta Adresi zaten var!' hatasının görünür olduğunu doğrulayın
        Assert.assertTrue(aotomationPage.emailAdressAlready.isDisplayed());




    }
}
