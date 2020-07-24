package tests;

import org.testng.annotations.Test;
import patterns.iterator.ProductCollection;
import patterns.iterator.ProductIterator;
import patterns.tempalteMethod.Shop;
import patterns.tempalteMethod.SportsShop;

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
