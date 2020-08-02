package patterns.pageObject.pages.menupages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import patterns.pageObject.BasePage;

import static patterns.factory.DriverFactory.getDriver;

public class AllPagesPage extends BasePage {

    public void editDesiredPolicy(String pageName){
        Actions action = new Actions(getDriver());
        WebElement webElement = getDriver().findElement(By.xpath(String.format("//a[contains(text(),'%s')]",pageName)));
        action.moveToElement(webElement).perform();
        action.moveToElement(getDriver().findElement(By.xpath("//a[contains(@aria-label,'Edit “Privacy Policy”')]"))).click().perform();
    }
}
