package consts;

public interface Configs {
  interface DriverConfigs {
    String CHROME_NAME = "webdriver.chrome.driver";
    String CHROME_DRIVER_LOCATION = "src/main/resources/drivers/chromedriver.exe";

    int IMPLICITY_WAIT_VALUE = 10;
  }

  interface BusinessConfigs {
    String BASE_URL="https://www.amazon.com";
  }
}
