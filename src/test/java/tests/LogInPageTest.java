package tests;

import org.testng.annotations.Test;
import patterns.buisnessobjects.LogInBO;
import patterns.buisnessobjects.MainBO;

public class LogInPageTest extends BaseTest {
    @Test(description = "log in")
    public void verifyNewsPage() {
        MainBO mainBO = new MainBO();
        mainBO.startLogin();
        LogInBO logInBO = new LogInBO();
        logInBO.login("jokarp4556@gmail.com","ppppp55555");
    }
}
