package patterns.decorator.elements;

import org.openqa.selenium.*;

import java.util.List;
import java.util.NoSuchElementException;

public class PageElement implements WebElement {

  WebElement webElement;

  public PageElement(WebElement webElement)
  {
    this.webElement=webElement;
  }

  @Override
  public void click(){
    webElement.click();
  }

  @Override
  public void submit() {

  }

  @Override
  public void sendKeys(CharSequence... charSequences) {
    webElement.sendKeys(charSequences);
  }

  @Override
  public void clear() {
    webElement.clear();
  }

  @Override
  public String getTagName() {
    return webElement.getTagName();
  }

  @Override
  public String getAttribute(String s) {
    return webElement.getAttribute(s);
  }

  @Override
  public boolean isSelected() {
    return webElement.isSelected();
  }

  @Override
  public boolean isEnabled() {
    return webElement.isEnabled();
  }

  @Override
  public String getText() {
    return webElement.getText();
  }

  @Override
  public List<WebElement> findElements(By by) {
    return webElement.findElements(by);
  }

  @Override
  public WebElement findElement(By by) {
    return webElement.findElement(by);
  }

  @Override
  public boolean isDisplayed() {
    try{
      return webElement.isDisplayed();
    }
    catch (NoSuchElementException|TimeoutException e){
      return false;
    }
  }

  @Override
  public Point getLocation() {
    return null;
  }

  @Override
  public Dimension getSize() {
    return null;
  }

  @Override
  public Rectangle getRect() {
    return null;
  }

  @Override
  public String getCssValue(String s) {
    return null;
  }

  @Override
  public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
    return null;
  }
}
