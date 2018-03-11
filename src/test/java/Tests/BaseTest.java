package Tests;

import Pages.AfterloginPage;
import Pages.App;
import Pages.LoginPage;
import Users.User;
import Users.UserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    protected static User validUser = UserFactory.getValidUser();
    protected static App app = new App();

    @AfterSuite
    public void tearDownSuite() throws Exception{
        app.common.stopApplication();
    }
}
