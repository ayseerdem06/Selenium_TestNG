package tests.US005;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;

public class TC01 {

    @Test
    public void testcase01() throws InterruptedException {

        ProductsPages productsPages = new ProductsPages();
        Actions actions = new Actions(Driver.getDriver());

        //  Kullanici "https://pearlymarket.com/" Url'ine gider
        //  Kullanici Vendor hesabi ile giriş yapmak icin Sign In 'e  tiklar
        Driver.getDriver().get("https://pearlymarket.com/");
        productsPages.singIn.click();

        //  Kullanici gecerli  bir email , sifre  girer ve Sing İn Butonuna tiklar
        //  Kullanici ana sayafaya basarili bir sekilde giris yaptigini dogrular
        productsPages.username.sendKeys("kubraesra27@hotmail.com");
        productsPages.password.sendKeys("Esrakubra2!");
        productsPages.signInButton.click();
        String expectedUrl = "https://pearlymarket.com/";
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());


        //  Kullanici ana sayfada My Account linkine tiklar
        //  Kullanici My Account'a giris yaptigini dogrular
        Thread.sleep(2000);
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        productsPages.myAccount.click();
        WebElement actualAccountText = productsPages.myAccountText;
        Assert.assertTrue(actualAccountText.isDisplayed());


        //  Kullanici acilan sayfada Store Manager linkine  tiklar
        //  Kullanici Store Manager'a giris yaptigini dogrular
        Thread.sleep(1000);
        productsPages.storeManager.click();
        WebElement actualStoreManager = productsPages.storeManagerText;
        Assert.assertTrue(actualStoreManager.isDisplayed());

        //  Kullanici  acilan sayfada Products linkine  tiklar
        //  Kullanici Products 'a giris yaptigini dogrular
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        productsPages.products.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement actualProductsText = productsPages.productsText;
        Assert.assertTrue(actualProductsText.isDisplayed());

        //  Kullanici Prpducts sayfasinda urun listesinin yer aldigi tabloda
        //  status, stok, price ve date baslıklarının oldugunu dogrular
        Thread.sleep(1000);
        WebElement actualStatus = productsPages.status;
        Assert.assertTrue(actualStatus.isDisplayed());

        Thread.sleep(1000);
        WebElement actualStok = productsPages.stok;
        Assert.assertTrue(actualStok.isDisplayed());

        Thread.sleep(1000);
        WebElement actualPrice = productsPages.price;
        Assert.assertTrue(actualPrice.isDisplayed());

        Thread.sleep(1000);
        WebElement actualDate = productsPages.date;
        Assert.assertTrue(actualDate.isDisplayed());



        //  Kullanici sayfayi kapatir
        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
