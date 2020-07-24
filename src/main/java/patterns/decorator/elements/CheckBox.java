package patterns.decorator.elements;

import org.openqa.selenium.WebElement;

public class CheckBox extends PageElement {

  public CheckBox(WebElement webElement) {
    super(webElement);
  }

  public void setChecked(boolean val){
    if (val != isChecked()){
      webElement.click();
    }
  }

  private boolean isChecked() {
    return webElement.isSelected();
  }
}
