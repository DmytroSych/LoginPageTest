package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LoginTest() {
        app.login.loginValidUser();
        Assert.assertEquals(app.afterlogin.getUserEmail(), validUser.getEmail());
    }
}
