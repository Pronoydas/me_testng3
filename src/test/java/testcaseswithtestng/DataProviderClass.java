package testcaseswithtestng;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DataProviderClass {


    @DataProvider(name="Switch Case")
    public Object [][] dataProvider(Method m){

        switch(m.getName()){

            case "Sum" :
            return new Object[][] {{2,3,5},{3,7,10}};
            
            case "Diff" : 
            return new Object[][] {{2,3,-1},{3,7,-4}};
        }
        return null;
    }
    
}
