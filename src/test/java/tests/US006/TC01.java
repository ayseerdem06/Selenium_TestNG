package tests.US006;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;

public class TC01 {

    @Test
    public void testcase01() throws InterruptedException {

        ProductsPages productsPages=new ProductsPages();
        Actions actions = new Actions(Driver.getDriver());

     //  Kullanici "https://pearlymarket.com/" Url'ine gider
        Driver.getDriver().get("https://pearlymarket.com/");

     //  Kullanici Vendor hesabi ile giriş yapmak icin Sign In 'e  tiklar
        productsPages.singIn.click();

     //  Kullanici gecerli  bir email , sifre  girer ve Sing İn Butonuna tiklar
        productsPages.username.sendKeys("aayseerdem0633@gmail.com");
        Thread.sleep(1000);
        productsPages.password.sendKeys("ayse0712");
        Thread.sleep(1000);
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
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        productsPages.products.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

     //  Kullanici Products ekranından Yeni urun ekle (Add new) butonuna tiklar
        Thread.sleep(1000);
        productsPages.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

     //  Kullanici Categories sekmesinin oldugunu dogrular
        String expectedCatagories="Categories*";
        Thread.sleep(1000);
        String actualCatagories=productsPages.categories.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedCatagories,actualCatagories);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Besin takviyeleri seceneginin oldugunu dogrular
        String expectedBesinTakviyeleri="Besin takviyeleri";
        Thread.sleep(1000);
        String actualBesinTakviyeleri=productsPages.besinTakviyeleriText.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedBesinTakviyeleri,actualBesinTakviyeleri);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Besin takviyeleri secenegini secer
        Thread.sleep(1000);
        productsPages.besinTakviyeleriCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Cok satanlar seceneginin oldugunu dogrular
        String expectedCokSatanlar="Cok satanlar";
        Thread.sleep(1000);
        String actualCokSatanlar=productsPages.cokSatanlarText.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedCokSatanlar,actualCokSatanlar);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Cok satanlar secenegini secer
        Thread.sleep(1000);
        productsPages.cokSatanlarCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Elektrik & Elektronik  seceneginin oldugunu dogrular
        String expectedElektrikElektronik="Elektrik & Elektronik";
        Thread.sleep(1000);
        String actualElektrikElektronik=productsPages.elektrikElektroniktext.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedElektrikElektronik,actualElektrikElektronik);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Elektrik & Elektronik  secenegini secer
        Thread.sleep(1000);
        productsPages.elektrikElektronikCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Home&Life seceneginin oldugunu dogrular
        String expectedHomeLife="Home&Life";
        Thread.sleep(1000);
        String actualHomeLife=productsPages.homeLifetext.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedHomeLife,actualHomeLife);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Home&Life  secenegini secer
        Thread.sleep(1000);
        productsPages.homeLifeCheckBox.click();
        Thread.sleep(1000);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Discounted seceneginin oldugunu dogrular
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(1000);
        String expectedDiscounted="Discounted";
        Thread.sleep(1000);
        String actualDiscounted=productsPages.discountedtext.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedDiscounted,actualDiscounted);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Discounted secenegini secer
        Thread.sleep(1000);
        productsPages.discountedCheckBox.click();

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Books & Music & Film seceneginin oldugunu dogrular
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(1000);
        String expectedBooksMusicFilm="Books & Music & Film";
        Thread.sleep(1000);
        String actualBooksMusicFilm=productsPages.booksMusicFilmtext.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedBooksMusicFilm,actualBooksMusicFilm);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Books & Music & Film secenegini secer
        Thread.sleep(1000);
        productsPages.booksMusicFilmCheckBox.click();

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Cosmetics&Personal  seceneginin oldugunu dogrular
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        String expectedCosmeticsPersonal="Cosmetics&Personal Care";
        Thread.sleep(1000);
        String actualCosmeticsPersonal=productsPages.cosmeticstext.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedCosmeticsPersonal,actualCosmeticsPersonal);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Cosmetics&Personal secenegini secer
        Thread.sleep(1000);
        productsPages.cosmeticsCheckBox.click();

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Fashion&Clothing seceneginin oldugunu dogrular
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        String expectedFashionClothing="Fashion&Clothing";
        Thread.sleep(1000);
        String actualFashionClothing=productsPages.fashionClothingtext.getText();
        Thread.sleep(1000);
        Assert.assertEquals(expectedFashionClothing,actualFashionClothing);

     //  Kullanici Catagries sekmesinden urun katagorisi olarak Fashion&Clothing secenegini secer
        Thread.sleep(1000);
        productsPages.fashionClothingCheckBox.click();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak Toys & Games seceneginin oldugunu dogrular
     //  Kullanici Catagries sekmesinden urun katagorisi olarak Toys & Games secenegini secer
     //  Kullanici Catagries sekmesinden urun katagorisi olarak New Arrivals seceneginin oldugunu dogrular
     //  Kullanici Catagries sekmesinden urun katagorisi olarak New Arrivals  secenegini secer
     //  Kullanici sayfayi kapatir

    }
}
