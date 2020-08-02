package patterns.pageObject.pages.menupages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.pageObject.BasePage;

import static patterns.factory.DriverFactory.getDriver;

public class BaseEditingPage extends BasePage {

    @FindBy(id = "mceu_27-button")
    private Button boldButton;

    @FindBy(id = "mceu_28-button")
    private Button italicButton;

    public void clickBoldButton(){
        boldButton.click();
    }

    public void clickItalicButton(){
        italicButton.click();
    }

    public void selectDesiredText(String text){
        Actions action = new Actions(getDriver());
        action.moveToElement(getDriver().findElement(By.xpath(String.format("//p[contains(text(),'%1$s')] | //h1[contains(text(),'%1$s')] | //h2[contains(text(),'%1$s')]",text))))
                .doubleClick().perform();
    }
}
