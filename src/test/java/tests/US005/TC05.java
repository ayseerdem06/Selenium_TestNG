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

public class TC05 {

    @Test
    public void testCase05() throws InterruptedException {

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

        //  Kullanici product title kutusuna tiklar ve urun adini girer
        productsPages.productTitle.click();
        actions.sendKeys("Kalem").perform();

     //  Kullanici Price ($) kutusunu bos birakir
     //  Kullanici Sale Price ($)  kutusunu bos birakir


       // Kullanici resim eklemek icin Bos Cikan Buyuk Resim Ekraninin üstüne tiklar
        productsPages.featuredImg.click();

        //   Kullanici  Choose image pencersinden Media Library sekmesine tiklar
        productsPages.mediaLibraryIlk.click();
        Thread.sleep(2000);

        //   Kullanici acilan ekranda bulunan resimlerden istedigi resmi secer ve tiklar.
        productsPages.imgClick1.click();

        //   Kullanici  Select  butonuna tiklar
        productsPages.select.click();

        //   Kullanici resim eklemek icin Bos Cikan Kucuk  Resim Ekranina  tiklar
        Thread.sleep(1000);
        productsPages.galeryImg.click();

        //   Kullanici  Choose image pencersinden Media Library sekmesine tiklar
        productsPages.mediaLibraryIkinci.click();

        //   Kullanici acilan pencerede eklemek istedigi resmi secer
        Thread.sleep(2000);
        productsPages.imgClick2.click();

        //   Kullanici sectigi resmi eklemek icin Add To Galery butonuna tiklar olusturur
        productsPages.addToGallery.click();

     //  Kullanici Catagries sekmesinden herhangi bir katagori secer
        productsPages.bestSellerCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

       //  Kullanici Product brands sekmesinden brands katagorisini bos birakir

     //  Kullanici Submit Butonuna  Tiklar
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsclick(productsPages.submit);

     //  Kullanici "Product Successfully Published."mesajı ile Price ve Sale Price girisi ve  Product brands katagorisi seçmeden   urun eklendigini dogrular
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),8);
        wait.until(ExpectedConditions.visibilityOf(productsPages.popUpMessageHappy));
        Assert.assertTrue(productsPages.popUpMessageHappy.isDisplayed());

     //  Kullanici sayfayi kapatir
        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
