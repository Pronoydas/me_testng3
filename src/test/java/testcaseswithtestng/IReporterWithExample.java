package testcaseswithtestng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IReporterWithExample {

    @BeforeMethod
    public void demo(){
        System.out.println("From BeforeMethod ::");
    }
    
    @Test(groups="smoke")
    public void testcase1() {
    System.out.println("This test case will pass");
    }
    
    @Test(groups="smoke")
    public void testcase2() {
    System.out.println("This test case will fail");
    Assert.assertTrue(true);
    }
    
    @Test
    public void testcase3() {
    System.out.println("this tet case does not belong to the group smoke");
    }
    
}
