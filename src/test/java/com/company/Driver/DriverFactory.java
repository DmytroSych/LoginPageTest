package com.company.Driver;

import com.company.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


public class DriverFactory {
    static WebDriver driver;

    public static WebDriver getDriver() {
        String property = System.getProperty("driver");
        if ("firefox".equals(property)) {
            System.setProperty("webdriver.gecko.driver", "src/driver/geckodriver.exe");
            DriverFactory.driver = new FirefoxDriver();
        } else if ("ie".equals(property)) {
            System.setProperty("webdriver.ie.driver", "src/driver/IEDriverServer.exe");
            DriverFactory.driver = new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
            DriverFactory.driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        DriverFactory.driver.get(Constants.BASE_URL);
        DriverFactory.driver.manage().window().maximize();
        return DriverFactory.driver;
    }
}
