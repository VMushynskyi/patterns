package patterns.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.PageElement;
import patterns.pageObject.BasePage;

import java.util.List;

import static patterns.factory.DriverFactory.getDriver;

public class LeftMenuPage extends BasePage {

    @FindBy(xpath = "//a[@id = 'nav-hamburger-menu']")
    private PageElement menuLink;

    public  List<WebElement> getAllSection() {
        menuLink.click();
        return getDriver().findElements(By.xpath("//li//a[@class='hmenu-item']"));
    }

    public WebElement getDesiredSubSection(String productSectionName) {
       return getDriver().findElement(By.xpath("//a[contains(text(),'"+productSectionName+"')]"));
    }
}
