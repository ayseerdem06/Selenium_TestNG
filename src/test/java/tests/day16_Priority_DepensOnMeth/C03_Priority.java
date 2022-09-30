package tests.day16_Priority_DepensOnMeth;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
/*
 TestNG (default) olarak @Test methodlarıni alfabetik sıraya göre run eder. (Yukardan asagi degil!)
 priority annotation Testlere öncelik vermek için kullanılır.
Kucuk olan Numara daha once calisir priority yazmayan Test method'u varsa oncelikle o calisir,
sonra priority yazan testler siralanir

 */


    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test  // Burayı 0 kabul eder bu yüzden ilk bu method çalışır
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }


    @Test (priority = -1)
    public void hepsiburadaTest() {
        driver.get("https://www.hepsiburada.com");
    }
}
