package tests.US005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC02 extends TestBaseRapor {

    @Test
    public void testCase02() throws InterruptedException {

        extentTest = extentReports.createTest("virtual veya downloadable secenegini seçebilmeli","Store Manager olarak Products  menusunden  urun icin virtual veya downloadable secenegini gormeli  ve bu senecekleri secmeli");
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
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));

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


      // Kullanici Products'ta Add New ekranına  girdigini  dogrular
        WebElement actualAddProduct= productsPages.addProduct;
        Assert.assertTrue(actualAddProduct.isDisplayed());
        Assert.assertTrue(actualAddProduct.getText().contains("Add Product"));


      // Kullanici acilan Add Product ekranında Urun icin virtual ve  downloadable seceneklerinin oldugunu dogrular
        WebElement actualVirtual=productsPages.virtual;
        Assert.assertTrue(actualVirtual.isDisplayed());
        Assert.assertTrue(actualVirtual.getText().contains("Virtual"));

        WebElement actualdownloadable=productsPages.downloadable;
        Assert.assertTrue(actualdownloadable.isDisplayed());
        Assert.assertTrue(actualdownloadable.getText().contains("Downloadable"));


      // Kullanici Add Product ekranında virtual  ve downloadable seceneklerinin  secilebiliyor oldugunu  dogrular
        WebElement actualVirtualCheckBox=productsPages.virtualCheckBox;
        Assert.assertTrue(actualVirtualCheckBox.isEnabled());
        productsPages.virtualCheckBox.click();

        WebElement actualDownloadableCheckBox=productsPages.downloadableCheckBox;
        Assert.assertTrue(actualDownloadableCheckBox.isEnabled());
        productsPages.downloadableCheckBox.click();
        extentTest.info("Store Manager olarak Products  menusunden  urun icin virtual veya downloadable seceneklerini gorur  ve bu senecekleri secer");


      // Kullanici sayfayi kapatir
        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
