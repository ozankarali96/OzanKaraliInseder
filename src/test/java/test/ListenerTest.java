package test;

import base.BaseTest;
import org.testng.*;

public class ListenerTest extends BaseTest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test fail");
        testFail();
    }
}
