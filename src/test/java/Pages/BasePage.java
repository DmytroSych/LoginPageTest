package Pages;

import com.company.Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static public WebDriver driver= DriverFactory.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
