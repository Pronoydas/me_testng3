package testcaseswithtestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {


    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed : "+ result.getName()+" Taking Screenshot ! ");
    }


}

