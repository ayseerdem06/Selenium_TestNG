package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listeners implements ITestListener {

    @Override
    public void onStart(ITestContext arg) {
        System.out.println("onStart - Tum testlerden ONCE 1 sefer cagrilir => "+arg.getName());

    }

    @Override
    public void onFinish(ITestContext context){
        System.out.println("OnFinish - Tum testlerden ");

    }

}
