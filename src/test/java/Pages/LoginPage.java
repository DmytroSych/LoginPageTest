package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage{
    @FindBy(name = "login")
    private WebElement inputlogin;

    @FindBy(name = "pass")
    private WebElement inputpassword;

    @FindBy(xpath = "//p/input[@type='submit']")
    private WebElement btnlogin;

    @FindBys(@FindBy(xpath = ""))
    private List<WebElement> mails;


    public void login(String name, String password) {
        inputlogin.sendKeys(name);
        inputpassword.sendKeys(password);
        btnlogin.click();
    }


}
