package tests.US007;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;

public class TC01 {

    @Test
    public void testCase01() throws InterruptedException {

        ProductsPages productsPages=new ProductsPages();
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

        //   Kullanici Product brands sekmesinin oldugunu dogrular
        WebElement actualProductBrands=productsPages.pruductBrands;
        Assert.assertTrue(actualProductBrands.isDisplayed());
        Assert.assertTrue(actualProductBrands.getText().contains("Product brands"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //   Kullanici Product brands sekmesinden  Elegant Auto Group seceneginin oldugunu dogrular
        //   Kullanici Product brands sekmesinden urun brand'i olarak Elegant Auto Group secenegini secer
        Thread.sleep(2000);
        WebElement actualElegantAutoGroup=productsPages.elegantAutoGroupText;
        Assert.assertTrue(actualElegantAutoGroup.isDisplayed());
        Assert.assertTrue(actualElegantAutoGroup.getText().contains("Elegant Auto Group"));
        productsPages.elektrikElektronikCheckBox.click();


        //   Kullanici Product brands sekmesinden  Green Grass seceneginin oldugunu dogrular
        //   Kullanici Product brands sekmesinden urun brand'i olarak Green Grass secenegini secer
        Thread.sleep(1000);
        WebElement actualGreenGrass=productsPages.greenGrassText;
        Assert.assertTrue(actualGreenGrass.isDisplayed());
        Assert.assertTrue(actualGreenGrass.getText().contains("Green Grass"));
        productsPages.greenGrassCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //   Kullanici Product brands sekmesinden Node Js seceneginin oldugunu dogrular
        //   Kullanici Product sekmesinden urun katagorisi olarak Node Js  secenegini secer
        Thread.sleep(1000);
        WebElement actualNodeJs=productsPages.nodeJsText;
        Assert.assertTrue(actualNodeJs.isDisplayed());
        Assert.assertTrue(actualNodeJs.getText().contains("Node Js"));
        productsPages.nodeJsCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //   Kullanici Product brands sekmesinden NS8 seceneginin oldugunu dogrular
        //   Kullanici Product brands sekmesinden urun brand'i olarak NS8 secenegini secer
        Thread.sleep(1000);
        WebElement actualNS8=productsPages.nS8Text;
        Assert.assertTrue(actualNS8.isDisplayed());
        Assert.assertTrue(actualNS8.getText().contains("NS8"));
        productsPages.nS8CheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        //   Kullanici Product brands sekmesinden RED seceneginin oldugunu dogrular
        //   Kullanici Product brands sekmesinden urun brand'i olarak RED secenegini secer
        Thread.sleep(1000);
        WebElement actualRed=productsPages.redText;
        Assert.assertTrue(actualRed.isDisplayed());
        Assert.assertTrue(actualRed.getText().contains("RED"));
        productsPages.redCheckBox.click();

        //   Kullanici Product brands sekmesinden Skysuite Tech seceneginin oldugunu dogrular
        //   Kullanici Product brands sekmesinden urun brand'i olarak Skysuite Tech secenegini secer
        Thread.sleep(1000);
        WebElement actualSkysuiteTech=productsPages.skysuiteTechText;
        Assert.assertTrue(actualSkysuiteTech.isDisplayed());
        Assert.assertTrue(actualSkysuiteTech.getText().contains("Skysuite Tech"));
        productsPages.skysuiteTechCheckBox.click();

        //   Kullanici Product brands sekmesinden Sterling seceneginin oldugunu dogrular
        //   Kullanici Product brands sekmesinden urun brand'i Sterling secenegini secer
        Thread.sleep(1000);
        WebElement actualSterling=productsPages.sterlingText;
        Assert.assertTrue(actualSterling.isDisplayed());
        Assert.assertTrue(actualSterling.getText().contains("Sterling"));
        productsPages.sterlingCheckBox.click();

        //   Kullanici sayfayi kapatir
        Thread.sleep(3000);
        Driver.closeDriver();





    }
}
