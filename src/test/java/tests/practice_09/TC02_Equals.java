package tests.practice_09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;

public class TC02_Equals {

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
        String expectedProductBrands="Product brands";
        String actualProductBrands=productsPages.pruductBrands.getText();
        Assert.assertEquals(expectedProductBrands,actualProductBrands);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //   Kullanici Product brands sekmesinden  Elegant Auto Group seceneginin oldugunu dogrular
        //   Kullanici Product brands sekmesinden urun brand'i olarak Elegant Auto Group secenegini secer
        Thread.sleep(1000);
        String expectedElegantAutoGroup="Elegant Auto Group";
        String actualElegantAutoGroup=productsPages.elegantAutoGroupText.getText();
        Assert.assertEquals(expectedElegantAutoGroup,actualElegantAutoGroup);
        productsPages.elektrikElektronikCheckBox.click();


    //   Kullanici Product brands sekmesinden  Green Grass seceneginin oldugunu dogrular
    //   Kullanici Product brands sekmesinden urun brand'i olarak Green Grass secenegini secer
        Thread.sleep(1000);
        String expectedGreenGrass="Green Grass";
        String actualGreenGrass=productsPages.greenGrassText.getText();
        Assert.assertEquals(expectedGreenGrass,actualGreenGrass);
        productsPages.greenGrassCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    //   Kullanici Product brands sekmesinden Node Js seceneginin oldugunu dogrular
    //   Kullanici Product sekmesinden urun katagorisi olarak Node Js  secenegini secer
        Thread.sleep(1000);
        String expectedNodeJs="Node Js";
        String actualNodeJs=productsPages.nodeJsText.getText();
        Assert.assertEquals(expectedNodeJs,actualNodeJs);
        productsPages.nodeJsCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    //   Kullanici Product brands sekmesinden NS8 seceneginin oldugunu dogrular
    //   Kullanici Product brands sekmesinden urun brand'i olarak NS8 secenegini secer
        Thread.sleep(1000);
        String expectedNS8="NS8";
        String actualNS8=productsPages.nS8Text.getText();
        Assert.assertEquals(expectedNS8,actualNS8);
        productsPages.nS8CheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

    //   Kullanici Product brands sekmesinden RED seceneginin oldugunu dogrular
    //   Kullanici Product brands sekmesinden urun brand'i olarak RED secenegini secer
        Thread.sleep(1000);
        String expectedRed="RED";
        String actualRed=productsPages.redText.getText();
        Assert.assertEquals(expectedRed,actualRed);
        productsPages.redCheckBox.click();

    //   Kullanici Product brands sekmesinden Skysuite Tech seceneginin oldugunu dogrular
    //   Kullanici Product brands sekmesinden urun brand'i olarak Skysuite Tech secenegini secer
        Thread.sleep(1000);
        String expectedSkysuiteTech="Skysuite Tech";
        String actualSkysuiteTech=productsPages.skysuiteTechText.getText();
        Assert.assertEquals(expectedSkysuiteTech,actualSkysuiteTech);
        productsPages.skysuiteTechCheckBox.click();

    //   Kullanici Product brands sekmesinden Sterling seceneginin oldugunu dogrular
    //   Kullanici Product brands sekmesinden urun brand'i Sterling secenegini secer
        Thread.sleep(1000);
        String expectedSterling="Sterling";
        String actualSterling=productsPages.sterlingText.getText();
        Assert.assertEquals(expectedSterling,actualSterling);
        productsPages.sterlingCheckBox.click();

    //   Kullanici sayfayi kapatir
        Thread.sleep(3000);
        Driver.closeDriver();





    }
}
