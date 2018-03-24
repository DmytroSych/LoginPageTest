package Pages;

import org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class LoginPage extends BasePage {
    @FindBy(name = "login")
    private WebElement inputlogin;

    @FindBy(name = "pass")
    private WebElement inputpassword;

    @FindBy(xpath = "//p/input[@type='submit']")
    private WebElement btnlogin;

    @FindBy(name = "domn")
    private WebElement domn;


    @FindBys(@FindBy(xpath = ""))
    private List<WebElement> mails;


    public void login(String name, String password) {

        log.info("set input name - " + name);
        driver.jsSetValue(inputlogin, name);
        log.info("set input name - " + password);
        driver.jsSetValue(inputpassword, password);
        btnlogin.click();
    }


}
