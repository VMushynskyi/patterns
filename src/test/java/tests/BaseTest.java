package tests;

import consts.Configs;
import org.testng.annotations.*;
import patterns.factory.DriverFactory;

import java.lang.reflect.Method;
import java.util.logging.Logger;

public abstract class BaseTest extends DriverFactory {

  private Logger LOG =  Logger.getLogger(String.valueOf(BaseTest.class));
  private Test test;

  @Parameters({"browserName"})
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod(@Optional(value = Configs.DriverConfigs.CHROME_NAME) final String browserName, Method method){
    initDriver(browserName);
    LOG = Logger.getLogger(String.valueOf(method.getDeclaringClass()));
    test = method.getAnnotation(Test.class);
    LOG.info(String.format("Test '%s' started.",method.getName()));
    LOG.info(String.format("Description: '%s'",test.description()));
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod(final Method method){
    LOG.info(String.format("Test '%s' completed.",method.getName()));
    quitDriver();
  }

}
