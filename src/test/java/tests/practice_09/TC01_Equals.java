package tests.practice_09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;

public class TC01_Equals {

    @Test
    public void testcase01() throws InterruptedException {

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

        //  Kullanici Categories sekmesinin oldugunu dogrular
        String expectedCatagories = "Categories*";
        String actualCatagories = productsPages.categories.getText();
        Assert.assertEquals(expectedCatagories, actualCatagories);

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Besin takviyeleri seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Besin takviyeleri secenegini secer
        Thread.sleep(1000);
        String expectedBesinTakviyeleri = "Besin takviyeleri";
        String actualBesinTakviyeleri = productsPages.besinTakviyeleriText.getText();
        Assert.assertEquals(expectedBesinTakviyeleri, actualBesinTakviyeleri);
        productsPages.besinTakviyeleriCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Cok satanlar seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Cok satanlar secenegini secer
        Thread.sleep(1000);
        String expectedCokSatanlar = "Cok satanlar";
        String actualCokSatanlar = productsPages.cokSatanlarText.getText();
        Assert.assertEquals(expectedCokSatanlar, actualCokSatanlar);
        productsPages.cokSatanlarCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Elektrik & Elektronik  seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Elektrik & Elektronik  secenegini secer
        Thread.sleep(1000);
        String expectedElektrikElektronik = "Elektrik & Elektronik";
        String actualElektrikElektronik = productsPages.elektrikElektroniktext.getText();
        Assert.assertEquals(expectedElektrikElektronik, actualElektrikElektronik);
        productsPages.elektrikElektronikCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak Home&Life seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Home&Life  secenegini secer
        Thread.sleep(1000);
        String expectedHomeLife = "Home&Life";
        String actualHomeLife = productsPages.homeLifetext.getText();
        Assert.assertEquals(expectedHomeLife, actualHomeLife);
        productsPages.homeLifeCheckBox.click();
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak Discounted seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Discounted secenegini secer
        Thread.sleep(1000);
        String expectedDiscounted = "Discounted";
        String actualDiscounted = productsPages.discountedtext.getText();
        Assert.assertEquals(expectedDiscounted, actualDiscounted);
        productsPages.discountedCheckBox.click();
        actions.sendKeys(Keys.PAGE_UP).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Books & Music & Film seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Books & Music & Film secenegini secer

        Thread.sleep(1000);
        String expectedBooksMusicFilm = "Books & Music & Film";
        String actualBooksMusicFilm = productsPages.booksMusicFilmtext.getText();
        Assert.assertEquals(expectedBooksMusicFilm, actualBooksMusicFilm);
        productsPages.booksMusicFilmCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Cosmetics&Personal Care  seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Cosmetics&Personal secenegini secer
        Thread.sleep(1000);
        String expectedCosmeticsPersonal = "Cosmetics&Personal Care";
        String actualCosmeticsPersonal = productsPages.cosmeticstext.getText();
        Assert.assertEquals(expectedCosmeticsPersonal, actualCosmeticsPersonal);
        productsPages.cosmeticsCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Fashion&Clothing seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Fashion&Clothing secenegini secer

        Thread.sleep(1000);
        String expectedFashionClothing = "Fashion&Clothing";
        String actualFashionClothing = productsPages.fashionClothingtext.getText();
        Assert.assertEquals(expectedFashionClothing, actualFashionClothing);
        productsPages.fashionClothingCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak Toys & Games seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Toys & Games secenegini secer
        String expectedtoysGames = "Toys & Games";
        Thread.sleep(1000);
        String actualtoysGames = productsPages.toysGamestext.getText();
        Assert.assertEquals(expectedtoysGames, actualtoysGames);
        productsPages.toysGamesCheckBox.click();
        actions.sendKeys(Keys.PAGE_UP).perform();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak New Arrivals seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak New Arrivals  secenegini secer
        Thread.sleep(1000);
        String expectedNewArrivals = "New Arrivals";
        String actualNewArrivals = productsPages.newArrivalstext.getText();
        Assert.assertEquals(expectedNewArrivals, actualNewArrivals);
        productsPages.newArrivalsCheckBox.click();


        //  Kullanici sayfayi kapatir
        Thread.sleep(3000);
        Driver.closeDriver();


    }
}
