package tests.US006;

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
        WebElement actualCatagories = productsPages.categories;
        Assert.assertTrue(actualCatagories.isDisplayed());
        Assert.assertTrue(actualCatagories.getText().contains("Categories*"));

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Besin takviyeleri seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Besin takviyeleri secenegini secer
        Thread.sleep(1000);
        WebElement actualBesinTakviyeleri = productsPages.besinTakviyeleriText;
        Assert.assertTrue(actualBesinTakviyeleri.isDisplayed());
        Assert.assertTrue(actualBesinTakviyeleri.getText().contains("Besin takviyeleri"));
        productsPages.besinTakviyeleriCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Cok satanlar seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Cok satanlar secenegini secer
        Thread.sleep(1000);
        WebElement actualCokSatanlar = productsPages.cokSatanlarText;
        Assert.assertTrue(actualCokSatanlar.isDisplayed());
        Assert.assertTrue(actualCokSatanlar.getText().contains("Cok satanlar"));
        productsPages.cokSatanlarCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Elektrik & Elektronik  seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Elektrik & Elektronik  secenegini secer
        Thread.sleep(1000);
        WebElement actualElektrikElektronik = productsPages.elektrikElektroniktext;
        Assert.assertTrue(actualElektrikElektronik.isDisplayed());
        Assert.assertTrue(actualElektrikElektronik.getText().contains("Elektrik & Elektronik"));
        productsPages.elektrikElektronikCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak Home&Life seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Home&Life  secenegini secer
        Thread.sleep(1000);
        WebElement actualHomeLife = productsPages.homeLifetext;
        Assert.assertTrue(actualHomeLife.isDisplayed());
        Assert.assertTrue(actualHomeLife.getText().contains("Home&Life"));
        productsPages.homeLifeCheckBox.click();
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak Discounted seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Discounted secenegini secer
        Thread.sleep(1000);
        WebElement actualDiscounted = productsPages.discountedtext;
        Assert.assertTrue(actualDiscounted.isDisplayed());
        Assert.assertTrue(actualDiscounted.getText().contains("Discounted"));
        productsPages.discountedCheckBox.click();
        actions.sendKeys(Keys.PAGE_UP).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Books & Music & Film seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Books & Music & Film secenegini secer
        Thread.sleep(1000);
        WebElement actualBooksMusicFilm = productsPages.booksMusicFilmtext;
        Assert.assertTrue(actualBooksMusicFilm.isDisplayed());
        Assert.assertTrue(actualBooksMusicFilm.getText().contains("Books & Music & Film"));
        productsPages.booksMusicFilmCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Cosmetics&Personal Care  seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Cosmetics&Personal secenegini secer
        Thread.sleep(1000);
        WebElement actualCosmeticsPersonal = productsPages.cosmeticstext;
        Assert.assertTrue(actualCosmeticsPersonal.isDisplayed());
        Assert.assertTrue(actualCosmeticsPersonal.getText().contains("Cosmetics&Personal Care"));
        productsPages.cosmeticsCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  Kullanici Catagries sekmesinden urun katagorisi olarak Fashion&Clothing seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Fashion&Clothing secenegini secer
        Thread.sleep(1000);
        WebElement actualFashionClothing = productsPages.fashionClothingtext;
        Assert.assertTrue(actualFashionClothing.isDisplayed());
        Assert.assertTrue(actualFashionClothing.getText().contains("Fashion&Clothing"));
        productsPages.fashionClothingCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak Toys & Games seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak Toys & Games secenegini secer
        Thread.sleep(1000);
        WebElement actualtoysGames = productsPages.toysGamestext;
        Assert.assertTrue(actualtoysGames.isDisplayed());
        Assert.assertTrue(actualtoysGames.getText().contains("Toys & Games"));
        productsPages.toysGamesCheckBox.click();
        actions.sendKeys(Keys.PAGE_UP).perform();


        //  Kullanici Catagries sekmesinden urun katagorisi olarak New Arrivals seceneginin oldugunu dogrular
        //  Kullanici Catagries sekmesinden urun katagorisi olarak New Arrivals  secenegini secer
        Thread.sleep(1000);

        WebElement actualNewArrivals = productsPages.newArrivalstext;
        Assert.assertTrue(actualNewArrivals.isDisplayed());
        Assert.assertTrue(actualNewArrivals.getText().contains("New Arrivals"));
        productsPages.newArrivalsCheckBox.click();


        //  Kullanici sayfayi kapatir
        Thread.sleep(3000);
        Driver.closeDriver();


    }
}
