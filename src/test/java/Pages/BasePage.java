package Pages;

import com.company.Driver.DriverFactory;
import com.company.Driver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class BasePage {
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());
    protected static MyDriver driver = MyDriver.getMyDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
