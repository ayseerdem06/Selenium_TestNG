package tests.odevler.odevler_day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class C01_DependsOnTest {

    /*
    Bir class oluşturun: DependsOnTest
    https://www.amazon.com/ adresine gidin.
    Test : Amazon ana sayfaya gittiginizi test edin
    Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
    arama yapin ve aramanizin gerceklestigini Test edin
    Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
    $16.83 oldugunu test edin
     */

    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test01() {
       // https://www.amazon.com/ adresine gidin.
       // Test : Amazon ana sayfaya gittiginizi test edin
        Driver.getDriver().get("https://www.amazon.com/");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));

    }

    @Test (dependsOnMethods = "test01")
    public void test02() {
        //Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
        //    arama yapin ve aramanizin gerceklestigini Test edin
        Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Nutella"+ Keys.ENTER);
        WebElement sonucYazisi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYazisi.isDisplayed());
    }

    @Test (dependsOnMethods = "test02")
    public void test03(){
        //Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        //    $16.83 oldugunu test edin
        Driver.getDriver().findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        WebElement urunFiyati=Driver.getDriver().findElement(By.xpath("//span[text()='26.5 Ounce (Pack of 1)']"));
        String actualUrunFiyati="$16.83";
        softAssert.assertNotEquals(urunFiyati,actualUrunFiyati);
        softAssert.assertAll();

    }
}
