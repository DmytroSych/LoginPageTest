package Hepers;

import Pages.LoginPage;
import Users.User;
import Users.UserFactory;

public class LoginHelper extends LoginPage {
    public void loginValidUser() {
        User validUser = UserFactory.getValidUser();
        login(validUser.getLogin(), validUser.getPassword());
    }


}
