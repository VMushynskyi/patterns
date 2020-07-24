package patterns.factory;

import consts.Configs;
import org.openqa.selenium.WebDriver;
import patterns.factorymethod.ChromeDriverCreator;
import patterns.factorymethod.WebDriverCreator;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver webdriver;

    protected void initDriver(final String browserName) {
        if(webdriver==null) {
            if ((Configs.DriverConfigs.CHROME_NAME).equalsIgnoreCase(browserName)) {
                WebDriverCreator creator = new ChromeDriverCreator();
                webdriver = creator.setWebDriver();
            }
        }
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().implicitlyWait(Configs.DriverConfigs.IMPLICITY_WAIT_VALUE, TimeUnit.SECONDS);
        webdriver.get(Configs.BusinessConfigs.BASE_URL);
    }

    public static WebDriver getDriver() {
        return webdriver;
    }

    protected void quitDriver() {
        if (webdriver != null) {
            webdriver.quit();
            webdriver = null;
        }
    }
}
