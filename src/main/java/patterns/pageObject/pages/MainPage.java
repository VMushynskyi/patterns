package patterns.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.pageObject.BasePage;

import java.util.ArrayList;

import static patterns.factory.DriverFactory.getDriver;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Users')]")
    private Button userLink;

    @FindBy(xpath = "(//a[contains(text(),'Add New')])[6]")
    private Button addNewButton;

    public void clickAddNewButton(){
        addNewButton.click();
    }

    public void clickUserLinkButton() {
//        try {
//            Thread.sleep(15000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
//        getDriver().switchTo().window(tabs2.get(1));
//        getDriver().findElement(By.xpath("(*//a[contains(text(),'Register')])[1]")).click()
//        ;
        userLink.click();
    }
}
