package tests;

import org.testng.annotations.Test;
import patterns.builder.RegisterBuilder;
import patterns.buisnessobjects.LogInBO;
import patterns.buisnessobjects.MainBO;
import patterns.pageObject.pages.users.AddNewUserPage;
import patterns.strategy.SelectingMethods;
import patterns.strategy.menustrategy.PagesStrategy;
import patterns.strategy.menustrategy.ToolsStrategy;

public class MixedTest extends BaseTest {
    @Test(description = "testing mixed patterns")
    public void verifySelectingSectionAndProduct() {
        LogInBO logInBO = new LogInBO();
        logInBO.login("opensourcecms","opensourcecms");
        SelectingMethods selectingMethods = new SelectingMethods();
        selectingMethods.setSelectingMenuStrategy(new ToolsStrategy());
        selectingMethods.doSelecting("Export");
        MainBO mainBO = new MainBO();
        mainBO.startLogin();
        AddNewUserPage addNewUserPage = new AddNewUserPage();
        RegisterBuilder.newUser()
                .setUserName("Heo")
                .setFirstName("Tom")
                .setLastName("To")
                .setEmail("fitona507@mailvk.net")
                .setWebSite("https://s1.demo.opensourcecms.com/")
                .setRole("Editor")
                .build()
                .createAccount(addNewUserPage);
//        selectingMethods.setSelectingMenuStrategy(new PagesStrategy());
//        selectingMethods.doSelecting("All Pages");
    }
}
