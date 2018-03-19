package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AfterloginPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement userEmail;

    public String getUserEmail() {
        new WebDriverWait(driver, 20);
                /*.until(s->s{s.findElement (By.xpath())}*/
        return userEmail.getText();
    }
}


