package tests;

import org.testng.annotations.Test;
import patterns.TempalteMethod.Shop;
import patterns.TempalteMethod.SportsShop;

public class TemplatePatternTest extends BaseTest {
    @Test(description = "test template method pattern")
    public void verifySelectingSectionAndProduct() {
        Shop manProduct = new SportsShop();
        manProduct.choosing("Sports and Outdoors","Sports & Fitness");
    }
}
