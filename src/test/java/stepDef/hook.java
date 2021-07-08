package stepDef;

import Base.Config;
import io.cucumber.java.Before;
import org.testng.util.Strings;


public class hook extends Config {


    public static String url ;
    public static String baseURL;
    public static String browserType;

    public static String defaultBrowser = "ch";
    public static String defaultEnv = "qa";



    @Before
    public void openBrowser (){


        if (Strings.isNullOrEmpty(browserType)){

            browserType = defaultBrowser;
        }

        if (Strings.isNullOrEmpty(baseURL)){

            baseURL = defaultEnv;
        }


        driver = initDriver(browserType);

        if (baseURL == defaultEnv){

            url = "http://qa.taltektc.com/home/signup";
        }




              driver.get(url);




}
}
