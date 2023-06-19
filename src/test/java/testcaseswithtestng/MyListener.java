package testcaseswithtestng;
import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;


public class MyListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
      System.out.println(" From OnStart Method from Listner class ::");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(" From OnTest Method");
    }

//     @Override
//     public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,String outputDirectory) {
//         // iterate though the all suite
//         for (ISuite suite :suites){
//        //caputre the suite name 
//        String suiteName = suite.getName();
//        // Get the Execution result in from of Map 
//        Map<String ,ISuiteResult> suiteResult = suite.getResults();
//        for (ISuiteResult result : suiteResult.values()){
//             ITestContext Context= result.getTestContext();
//             System.out.println("capture all pass test result->"+suiteName +" No. of Test cases->" 
//             +Context.getPassedTests().getAllResults().size());
//             System.out.println("capture all pass test result->"+suiteName +" No. of Test cases->" 
//             +Context.getFailedTests().getAllResults().size());
//             System.out.println("capture all pass test result->"+suiteName +" No. of Test cases->" 
//             +Context.getSkippedTests().getAllResults().size());
//        }


//     }
// }
}
