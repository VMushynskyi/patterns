package patterns.factorymethod;

import consts.Configs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator extends WebDriverCreator {

    @Override
    public WebDriver setWebDriver() {
        System.setProperty(Configs.DriverConfigs.CHROME_NAME, Configs.DriverConfigs.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        return driver;
    }
}
