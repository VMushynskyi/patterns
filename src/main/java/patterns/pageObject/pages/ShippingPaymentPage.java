package patterns.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.decorator.elements.PageElement;
import patterns.decorator.elements.TextInput;
import patterns.pageObject.BasePage;

import static patterns.factory.DriverFactory.getDriver;

public class ShippingPaymentPage extends BasePage {

    @FindBy(xpath = "//span[contsins(text(),'Add a new card')]")
    private Button addANewCard;

    @FindBy(id = "pp-7XLG3t-14")
    private TextInput cardNumberInput;

    @FindBy(id = "pp-pp-7XLG3t-16-14")
    private TextInput cardNameInput;

    @FindBy(id = "pp-7XLG3t-20")
    private PageElement dateDropdown;

    @FindBy(id = "pp-7XLG3t-21")
    private PageElement monthDropdown;

    @FindBy(xpath = "//span[.='Add your card']/ancestor::span//input")
    private Button addYourCardButton;

    @FindBy(id = "pp-XamLaC-75")
    private TextInput giftsCodes;

    @FindBy(xpath = "//span[.='Apply']/ancestor::span//input")
    private Button addApplyButton;

    public void clickAddNewCardButton(){
        addANewCard.click();
    }

    public void setCardNumberInput(String numberCard){
        cardNumberInput.sendKeys(numberCard);
    }

    public void setCardNameInput(String name){
        cardNameInput.sendKeys(name);
    }

    public void setDayInDropDown(String day){
        dateDropdown.click();
        getDriver().findElement(By.xpath("//div[@class='a-popover-inner']//a[.='"+day+"']")).click();
    }

    public void setYearInDropDown(String year){
        monthDropdown.click();
        getDriver().findElement(By.xpath("//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a[.='"+year+"']")).click();
    }

    public void clickAddYourCardButton(){
        addYourCardButton.click();
    }

    public void setGiftsCode(String code){
        giftsCodes.sendKeys(code);
    }

    public void clickApplyButton(){
        addApplyButton.click();
    }
}
