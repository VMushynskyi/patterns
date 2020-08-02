package patterns.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.PageElement;
import patterns.pageObject.BasePage;

import static patterns.factory.DriverFactory.getDriver;

public class LeftMenuPage extends BasePage {

    @FindBy(xpath="//div[contains(text(),'Appearance')]")
    private PageElement appearanceLink;

    @FindBy(xpath="//a[contains(text(),'Themes')]")
    private PageElement themesLink;

    public void selectMenu(String menuItem) {
        getDriver().findElement(By.xpath(String.format("//div[contains(text(),'%s')]",menuItem))).click();
    }

    public void selectSubMenu(String subMenuItem) {
        getDriver().findElement(By.xpath(String.format("//a[contains(text(),'%s')]",subMenuItem))).click();
    }
}
