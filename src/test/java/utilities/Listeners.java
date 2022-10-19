package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listeners implements ITestListener {

    public void onStart(ITestContext arg) {
        System.out.println("onStart - Tum testlerden ONCE 1 sefer cagirrilir => "+ arg.getName());

    }
}
