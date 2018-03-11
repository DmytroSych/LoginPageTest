package Hepers;

import Pages.BasePage;

public class CommonHelper extends BasePage {
    public void stopApplication() {
        driver.quit();
    }
}
