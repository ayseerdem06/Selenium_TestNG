package tests.US005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC04 {


    @Test
    public void testCase04() throws InterruptedException {

        ProductsPages productsPages = new ProductsPages();
        Actions actions = new Actions(Driver.getDriver());

        //  Kullanici "https://pearlymarket.com/" Url'ine gider
        //  Kullanici Vendor hesabi ile giriş yapmak icin Sign In 'e  tiklar
        Driver.getDriver().get("https://pearlymarket.com/");
        productsPages.singIn.click();

        //  Kullanici gecerli  bir email , sifre  girer ve Sing İn Butonuna tiklar
        productsPages.username.sendKeys("kubraesra27@hotmail.com");
        productsPages.password.sendKeys("Esrakubra2!");
        productsPages.signInButton.click();

        //  Kullanici ana sayfada My Account linkine tiklar
        Thread.sleep(2000);
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        productsPages.myAccount.click();

        //  Kullanici acilan sayfada Store Manager linkine  tiklar
        Thread.sleep(1000);
        productsPages.storeManager.click();

        //  Kullanici  acilan sayfada Products linkine  tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        productsPages.products.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Products ekranından Yeni urun ekle (Add new) butonuna tiklar
        Thread.sleep(1000);
        productsPages.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici product title kutusunu boş birakir
        //  Kullanici Price ($) kutusunu bos birakir
        //  Kullanici Sale Price ($)  kutusunu bos birakir
        //  Kullanici resim eklemek icin Bos Cikan Buyuk Resim Ekranini bos birakir
        //  Kullanici sectigi resmi eklemek icin Add To Galery Ekranini bos birakir
        //  Kullanici Catagries sekmesini bos birakir
        //  Kullanici Product brands sekmesini bos birakir

        //  Kullanici Submit Butonuna  Tiklar
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsclick(productsPages.submit);

        //  Kullanici "Please insert Product Title before submit." mesaji ile product title eklemeden submit yapamadigini dogrular
        //  Kullanici "Gallery Images: This field is required."mesaji ile resim galery  eklenmeden Submit yapamadıgini dogrular
        //  Kullanici "Featured img: This field is required." mesaji ile resim eklenmeden Submit yapamadıgini dogrular
        //  Kullanici "Product cat: This field is required."mesaji ile Catagries sekmesini secmeden Submit yapılamadigini dogrular
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),8);
        wait.until(ExpectedConditions.visibilityOf(productsPages.popUpMessageNegative));
        Assert.assertTrue(productsPages.popUpMessageNegative.isDisplayed());

        //  Kullanici sayfayi kapatir

    }
}
