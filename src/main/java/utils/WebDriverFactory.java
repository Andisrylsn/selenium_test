package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory{
    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){
            String browser = "chrome";

            if (browser.equalsIgnoreCase("chrome")) {
                String dir = System.getProperty("user.dir");
                System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
        return driver;
    }
}