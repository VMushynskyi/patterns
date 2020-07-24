package patterns.pageObject.pages;

import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.pageObject.BasePage;

public class MainPage extends BasePage {

    @FindBy(xpath = "//a[contains(@id,'nav-link-accountList')]")
    private Button myAccountButton;

    public void clickMyAccountButton(){
        myAccountButton.click();
    }
}
