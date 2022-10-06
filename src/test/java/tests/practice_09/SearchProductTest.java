package tests.practice_09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearcProductPage;
import utilities.Driver;

import java.util.List;

public class SearchProductTest {

    // 1. Tarayıcıyı başlat
    // 2. 'https://automationexercise.com' url'sine gidin
    // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
    // 4. 'Ürünler' butonuna tıklayın
    // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
    // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
    // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
    // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın


    SearcProductPage searcProductPage;
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void searchProductPage() {
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get("https://automationexercise.com");

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        // 4. 'Ürünler' butonuna tıklayın
        searcProductPage=new SearcProductPage();
        searcProductPage.products.click();

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        String expectedUrlProducts="https://automationexercise.com/products";
        String actualUrlProducts=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrlProducts,expectedUrlProducts);
        // Hem Url ile hemde allPruduct ın görünür olup olmadığı ile test etmiş olduk
        Assert.assertTrue(searcProductPage.allPruductTitle.isDisplayed());

        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searcProductPage.searchPruduct.sendKeys("Blue Top");
        searcProductPage.submitSearch.click();
        // actions ile
        //actions.click(searcProductPage.submitSearch).perform();

        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(searcProductPage.textCenter.isDisplayed());
      /*
        List<WebElement> urunList=searcProductPage.urunListesi;
        for (WebElement w:urunList
             ) {
            Assert.assertTrue(w.isDisplayed());
        }

       */


        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
       searcProductPage.viewPruduct.click();
       Assert.assertTrue(searcProductPage.blueTop.isDisplayed());














    }
}
