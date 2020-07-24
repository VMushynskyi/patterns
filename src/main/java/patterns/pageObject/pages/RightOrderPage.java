package patterns.pageObject.pages;

import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.pageObject.BasePage;

public class RightOrderPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Buy Now')]/ancestor::span")
    private Button buyNowButton;

    public void clickBuyNow(){
        buyNowButton.click();
    }
}
