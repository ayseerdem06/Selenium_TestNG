package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_DependsOnMethod extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test02() {
    driver.get("https://www.")
    }

    @Test
    public void test03() {

    }

    @Test
    public void test04() {

    }
}
