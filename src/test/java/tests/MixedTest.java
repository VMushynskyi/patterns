package tests;

import org.testng.annotations.Test;
import patterns.TempalteMethod.Shop;
import patterns.TempalteMethod.SportsShop;
import patterns.builder.SignUpBuilder;
import patterns.buisnessobjects.LogInBO;
import patterns.buisnessobjects.MainBO;
import patterns.buisnessobjects.SportAndFitnessBO;
import patterns.pageObject.pages.ShippingAddressPage;
import patterns.strategy.CardStrategy;
import patterns.strategy.PayingMethods;

public class MixedTest extends BaseTest {
    @Test(description = "testing mixed patterns")
    public void verifySelectingSectionAndProduct() {
        MainBO mainBO = new MainBO();
        mainBO.startLogin();
        LogInBO logInBO = new LogInBO();
        logInBO.login("jokarp4556@gmail.com","ppppp55555");
        Shop manProduct = new SportsShop();
        manProduct.choosing("Sports and Outdoors","Sports & Fitness");
        SportAndFitnessBO sportAndFitnessBO = new SportAndFitnessBO();
        sportAndFitnessBO.orderedFirstProduct();
        logInBO.signInWithEmail("jokarp4556@gmail.com");
        ShippingAddressPage shippingAddressPage = new ShippingAddressPage();
        SignUpBuilder.newSignUp()
                .setFullName("Tom")
                .setFirstAddress("firstStreet")
                .setSecondAddress("secondStreet")
                .setCity("Lviv")
                .setRegion("Frankivskyi")
                .setZipCode("79000")
                .setCountry("Ukraine")
                .setPhoneNumber("0693216598")
                .build()
                .createAccount(shippingAddressPage);
        PayingMethods payingMethods = new PayingMethods();
        payingMethods.setPayingStrategy(new CardStrategy());
        payingMethods.doPay();
    }
}
