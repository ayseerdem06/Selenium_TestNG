package tests.tekrarDersleri.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_ConfigReader {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
    }
}
