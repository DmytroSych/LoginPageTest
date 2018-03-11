package Pages;

import Hepers.AfterloginHelper;
import Hepers.CommonHelper;
import Hepers.LoginHelper;
import Pages.AfterloginPage;
import Pages.LoginPage;
import Tests.BaseTest;

public class App {
    public LoginHelper login;
    public AfterloginHelper afterlogin;
    public CommonHelper common;

    public App(){
        login = new LoginHelper();
        afterlogin = new AfterloginHelper();
        common = new CommonHelper();
    }
}
