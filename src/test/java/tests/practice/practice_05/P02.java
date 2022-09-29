package tests.practice.practice_05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P02 extends TestBaseBeforeMethodAfterMethod {


    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
    // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
    // 3. Açılır metni alın
    // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
    // 5. Açılır pencereyi kabul edin


    @Test
    public void test1() {

        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.xpath("//span[@id='button1']")).click();

        // 3. Açılır metni alın
        String alertMetni=driver.switchTo().alert().getText();
        System.out.println(alertMetni);

        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedMetin="I am an alert box!";
        Assert.assertEquals(expectedMetin,alertMetni);

        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();





    }
}
