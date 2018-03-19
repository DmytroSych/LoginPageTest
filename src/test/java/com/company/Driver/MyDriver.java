package com.company.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class MyDriver implements WebDriver {
    private static MyDriver myDriver;
    private static WebDriver driver;
    private JavascriptExecutor js = (JavascriptExecutor) driver;

    static public MyDriver getMyDriver() {
        if (driver == null) {
            driver = DriverFactory.getDriver();
            myDriver = new MyDriver();
            return new MyDriver();
        } else {
            return myDriver;
        }
    }

    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    public void jsSetValue(WebElement element, String value) {
        js.executeScript("arguments[0].value='" + value + "';", element);
    }
}
