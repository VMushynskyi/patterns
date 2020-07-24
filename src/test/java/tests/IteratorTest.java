package tests;

import org.testng.annotations.Test;
import patterns.Iterator.ProductCollection;
import patterns.Iterator.ProductIterator;
import patterns.TempalteMethod.Shop;
import patterns.TempalteMethod.SportsShop;

public class IteratorTest extends BaseTest {
    @Test(description = "iterator pattern")
    public void verifySelectingSectionAndProduct() {
        Shop manProduct = new SportsShop();
        manProduct.choosing("Sports and Outdoors","Sports & Fitness");
        ProductCollection productCollection = new ProductCollection();
        for (ProductIterator iteration = productCollection.createIterator(); iteration.hasNext();){
            System.out.println((String)iteration.getNext());
        }
    }
}
