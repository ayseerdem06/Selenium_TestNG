package tests.US005;


import org.testng.annotations.Test;
import pages.ProductsPages;
import utilities.Driver;

public class TC01 {

    @Test
    public void testcase01() {

        ProductsPages productsPages=new ProductsPages();

      //  Kullanici "https://pearlymarket.com/" Url'ine gider
        Driver.getDriver().get("https://pearlymarket.com/");

      //  Kullanici Vendor hesabi ile giriş yapmak icin Sign In 'e  tiklar
        productsPages.singIn.click();

      //  Kullanici gecerli  bir email , sifre  girer ve Sing İn Butonuna tiklar
        productsPages.username.sendKeys("aayseerdem0633@gmail.com");
        productsPages.password.sendKeys("ayse0712");
        productsPages.signInButton.click();

      //  Kullanici ana sayafaya basarili bir sekilde giris yaptigini dogrular


      //  Kullanici ana sayfada My Account linkine tiklar



      //  Kullanici My Account'a giris yaptigini dogrular
      //  Kullanici acilan sayfada Store Manager linkine  tiklar
      //  Kullanici Store Managera' giris yaptigini dogrular
      //  Kullanici  acilan sayfada Products linkine  tiklar
      //  Kullanici Products 'a giris yaptigini dogrular
      //  Kullanici Prpducts sayfasinda urun listesinin yer aldigi tabloda status, stok, price ve date baslıklarının oldugunu dogrular
      //  Kullanici sayfayi kapatir




    }
}
