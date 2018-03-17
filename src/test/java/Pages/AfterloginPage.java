package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterloginPage extends BasePage{
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement userEmail;

   public String getUserEmail() {
        return userEmail.getText();
    }
}


