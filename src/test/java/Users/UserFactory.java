package Users;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class UserFactory {
    public static User getValidUser() {
        ResourceBundle resourceBundle = PropertyResourceBundle.getBundle("user");
        return new User(resourceBundle.getString("login"),
                resourceBundle.getString("password"),
                resourceBundle.getString("email"));
    }
}
