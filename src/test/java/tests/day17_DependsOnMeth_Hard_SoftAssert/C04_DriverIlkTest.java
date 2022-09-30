package tests.day17_DependsOnMeth_Hard_SoftAssert;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {

    @Test
    public void test01() {

        /*
        TestBase class'ına extends ederek kullandığımız driver yerine artık Driver class'ından kullanacağımız
        getDriver() static methodu'unu kullanırız.
         */

        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://www.hepsiburada.com");
        Driver.closeDriver();

    }
}
