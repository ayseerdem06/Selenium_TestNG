package tests.US005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC03 extends TestBaseRapor {

    @Test
    public void testCase03() throws InterruptedException {

        extentTest = extentReports.createTest("yeni urunler yuklenebilmeli","Store Manager olarak product title ve   Price($) , Sale Price ($), Resim,Galery,Catagories ve  Product brands seçeneklere ait alanlar dolduruldugunda    urun eklendigini gormeli");
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
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.waitFor(2);
        productsPages.myAccount.click();

        //  Kullanici acilan sayfada Store Manager linkine  tiklar
        ReusableMethods.waitFor(1);
        productsPages.storeManager.click();

        //  Kullanici  acilan sayfada Products linkine  tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        productsPages.products.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Products ekranından Yeni urun ekle (Add new) butonuna tiklar
        ReusableMethods.waitFor(1);
        productsPages.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //   Kullanici product title kutusuna tiklar
        //   Kullanici product title kutusuna urun ismi  girisi yapar
        productsPages.productTitle.click();
        actions.sendKeys("Kalem").perform();

        //   Kullanici acilan Add Product ekranında Price ($) seceneginin oldugunu dogrular
        //   Kullanici Price ($) kutusuna urun satis fiyatini girer
        Assert.assertTrue(productsPages.price$.isDisplayed());
        Assert.assertTrue(productsPages.price$.getText().contains("Price ($)"));
        productsPages.priceSearchBox.click();
        actions.sendKeys("10").perform();

        //   Kullanici acilan Add Product ekranında Sale Price ($) seceneginin oldugunu dogrular
        //   Kullanici Sale Price ($)  kutusuna urun indirimli satis fiyatini girer
        Assert.assertTrue(productsPages.salePrice$.isDisplayed());
        Assert.assertTrue(productsPages.salePrice$.getText().contains("Sale Price ($)"));
        productsPages.salePriceSearchBox.click();
        actions.sendKeys("8").perform();

        //   Kullanici resim eklemek icin Bos Cikan Buyuk Resim Ekraninin üstüne tiklar
        productsPages.featuredImg.click();

        //   Kullanici  Choose image pencersinden Media Library sekmesine tiklar
        productsPages.mediaLibraryIlk.click();
        ReusableMethods.waitFor(2);

        //   Kullanici acilan ekranda bulunan resimlerden istedigi resmi secer ve tiklar.
        productsPages.imgClick1.click();

        //   Kullanici  Select  butonuna tiklar
        productsPages.select.click();

        //   Kullanici resim eklemek icin Bos Cikan Kucuk  Resim Ekranina  tiklar
        ReusableMethods.waitFor(1);
        productsPages.galeryImg.click();

        //   Kullanici  Choose image pencersinden Media Library sekmesine tiklar
        productsPages.mediaLibraryIkinci.click();

        //   Kullanici acilan pencerede eklemek istedigi resmi secer
        ReusableMethods.waitFor(2);
        productsPages.imgClick2.click();

        //   Kullanici sectigi resmi eklemek icin Add To Galery butonuna tiklar olusturur
        productsPages.addToGallery.click();

        //  Kullanici Categories sekmesinin oldugunu dogrular
        //   Kullanici Catagries sekmesinden herhangi bir katagori secer
        ReusableMethods.waitFor(1);
        Assert.assertTrue(productsPages.categories.isDisplayed());
        Assert.assertTrue(productsPages.categories.getText().contains("Categories*"));
        productsPages.bestSellerCheckBox.click();


        //   Kullanici Product brands sekmesinin oldugunu dogrular
        //   Kullanici Product brands sekmesinden herhangi bir brands secer
        Assert.assertTrue(productsPages.pruductBrands.isDisplayed());
        Assert.assertTrue(productsPages.pruductBrands.getText().contains("Product brands"));
        ReusableMethods.jsclick(productsPages.adidasCheckBox);
        ReusableMethods.waitFor(2);


        //   Kullanici Submit Butonuna  Tiklar
        ReusableMethods.jsclick(productsPages.submit);

        //   Kullanici "Product Successfully Published."mesajı ile istenilen bilgileri girdiginde Submit  yapabildigini dogrular
        ReusableMethods.waitForVisibility(productsPages.popUpMessageHappy,10);
        Assert.assertTrue(productsPages.popUpMessageHappy.isDisplayed());
        extentTest.info("Store Manager olarak product title ,  Price($) , Sale Price ($), Resim Galery,Catagories ve  Product brands seçeneklerine ait alanları bos birakildiginda  urun eklenemedigini gorur");

        //   Kullanici sayfayi kapatir
        ReusableMethods.waitFor(3);
        Driver.closeDriver();

    }
}
