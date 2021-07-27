package base;

import utils.DriverFactory;

public class BasePage {

    public static DriverFactory driverFactory;

    public static void driverInitialize(){
        driverFactory.getDriver();
    }

    public static void navigateToUrl(String url){
        driverFactory.navigateToUrl(url);
    }

}
