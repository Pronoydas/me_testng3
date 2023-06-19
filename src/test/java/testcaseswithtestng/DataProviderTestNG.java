package testcaseswithtestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.*;

public class DataProviderTestNG {

@DataProvider(name="Phone Details")
public Object[][] phonDetails(){
return new Object [][]{{"Iphon13",67000,"128GB"},{"Iphon13",99000,"256GB"}};
}

@Test(dataProvider = "Phone Details")
public void phoneDetails(String str ,int a,String gb){
    System.out.println(str+" "+a+" "+gb);
}

@Test(dataProvider = "Switch Case", dataProviderClass = DataProviderClass.class)
public void Sum(int a , int b , int result){
    Assert.assertEquals((a+b), result);
}

@Test(dataProvider = "Switch Case" , dataProviderClass =DataProviderClass.class)
public void Diff(int a , int b , int result){
    Assert.assertEquals((a-b), result);
}

    
}
