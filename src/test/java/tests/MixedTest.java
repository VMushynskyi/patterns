package tests;

import org.testng.annotations.Test;
import patterns.pageObject.pages.AddNewUserPage;
import patterns.builder.RegisterBuilder;
import patterns.buisnessobjects.LogInBO;
import patterns.buisnessobjects.MainBO;

public class MixedTest extends BaseTest {
    @Test(description = "testing mixed patterns")
    public void verifySelectingSectionAndProduct() {
        LogInBO logInBO = new LogInBO();
        logInBO.login("opensourcecms","opensourcecms");
        MainBO mainBO = new MainBO();
        mainBO.startLogin();
//        Shop manProduct = new SportsShop();
//        manProduct.choosing("Sports and Outdoors","Sports & Fitness");
//        SportAndFitnessBO sportAndFitnessBO = new SportAndFitnessBO();
//        sportAndFitnessBO.orderedFirstProduct();
//        logInBO.signInWithEmail("jokarp4556@gmail.com");
        AddNewUserPage addNewUserPAge = new AddNewUserPage();
        RegisterBuilder.newUser()
                .setUserName("Heoo")
                .setFirstName("Tom")
                .setLastName("To")
                .setEmail("fitonap507@mailvk.net")
                .setWebSite("https://s1.demo.opensourcecms.com/")
                .setRole("Editor")
                .build()
                .createAccount(addNewUserPAge);

//        PayingMethods payingMethods = new PayingMethods();
//        payingMethods.setPayingStrategy(new CardStrategy());
//        payingMethods.doPay();
    }
}
