package patterns.pageObject;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import patterns.decorator.ElementDecorator;
import patterns.factory.DriverFactory;

public class BasePage {

    private static WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),20);

    public BasePage() {
        PageFactory.initElements(new ElementDecorator(new DefaultElementLocatorFactory(DriverFactory.getDriver())),this);
    }
}
