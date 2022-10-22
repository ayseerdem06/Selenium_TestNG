package tests.US005;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TC06 {

    @Test
    public void testCase06() throws InterruptedException {

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

        //   Kullanici kisa tanımlama (short description)secenegini  gorur
        Assert.assertTrue(productsPages.shortDescription.isDisplayed());
        Assert.assertTrue(productsPages.shortDescription.getText().contains("Short Description"));


        //   Kullanici short description secenegine  kisa aciklama girer
        Driver.getDriver().switchTo().frame(productsPages.iframe.get(0));
        productsPages.shortDescriptionBox.get(0).click();
        productsPages.shortDescriptionBox.get(0).sendKeys("Takim birlikteligi basarinin sirridir.");
        Thread.sleep(3000);
        Driver.getDriver().switchTo().parentFrame();

        //   Kullanici genis tanimlama (Description) secenegini gorur
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(productsPages.description.isDisplayed());
        Assert.assertTrue(productsPages.description.getText().contains("Description"));

        //   Kullanici  Description secenegine uzun aciklama girer
        Driver.getDriver().switchTo().frame(productsPages.iframe.get(1));
        productsPages.shortDescriptionBox.get(0).click();
        productsPages.shortDescriptionBox.get(0).sendKeys("Proje12 Ekibi ve Team8 ile biz bu basariyi yakaladik. Herşey Cok Guzel olacak :))");

        //   Kullanici sayfayi kapatir
        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
