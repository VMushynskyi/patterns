package tests;

import org.testng.annotations.Test;
import patterns.buisnessobjects.LogInBO;
import patterns.iterator.ThemeCollection;
import patterns.iterator.ThemesIterator;
import patterns.strategy.SelectingMethods;
import patterns.strategy.menustrategy.AppearanceStrategy;

public class IteratorTest extends BaseTest {
    @Test(description = "iterator pattern")
    public void verifySelectingSectionAndProduct() {
        LogInBO logInBO = new LogInBO();
        logInBO.login("opensourcecms","opensourcecms");
        SelectingMethods selectingMethods = new SelectingMethods();
        selectingMethods.setSelectingMenuStrategy(new AppearanceStrategy());
        selectingMethods.doSelecting("Themes");
        ThemeCollection themeCollection = new ThemeCollection();
        for (ThemesIterator iteration = themeCollection.createIterator(); iteration.hasNext();){
            System.out.println((String)iteration.getNext());
        }
    }
}
