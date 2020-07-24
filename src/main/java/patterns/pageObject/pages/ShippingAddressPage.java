package patterns.pageObject.pages;

import org.openqa.selenium.support.FindBy;
import patterns.builder.SignUpBuilder;
import patterns.decorator.elements.Button;
import patterns.decorator.elements.PageElement;
import patterns.decorator.elements.TextInput;

public class ShippingAddressPage {

    @FindBy(id = "enterAddressFullName")
    private TextInput fullNameInput;

    @FindBy(id = "enterAddressAddressLine1")
    private TextInput firstAddressInput;

    @FindBy(id = "enterAddressAddressLine2")
    private TextInput secondAddressInput;

    @FindBy(id = "enterAddressCity")
    private TextInput cityAddressInput;

    @FindBy(id = "enterAddressCountryCode")
    private PageElement countryDropdown;

    @FindBy(id = "enterAddressStateOrRegion")
    private TextInput regionInput;

    @FindBy(id = "enterAddressPostalCode")
    private TextInput zipCodeInput;

    @FindBy(id = "enterAddressPhoneNumber")
    private TextInput phoneNumberInput;

    @FindBy(xpath = "//span//input[@value='Continue']")
    private Button continueButton;


    public void createNewUserPage(SignUpBuilder signUpBuilder){
        setSignUpFields(signUpBuilder);
        clickContinueButton();
    }

    private void clickContinueButton() {
        continueButton.click();
    }

    private void setSignUpFields(SignUpBuilder signUpBuilder) {
        setFullName(signUpBuilder.getFullName());
        setFirstAddress(signUpBuilder.getFirstAddress());
        setSecondAddress(signUpBuilder.getSecondAddress());
        setCity(signUpBuilder.getCity());
        setRegion(signUpBuilder.getRegion());
        setZipCode(signUpBuilder.getZipCode());
        setCountry(signUpBuilder.getCountry());
        setPhoneNumber(signUpBuilder.getPhoneNumber());
    }

    private void setPhoneNumber(String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
    }

    private void setCountry(String country) {
        countryDropdown.sendKeys(country);
    }

    private void setZipCode(String zipCode) {
        zipCodeInput.sendKeys(zipCode);
    }

    private void setRegion(String region) {
        regionInput.sendKeys(region);
    }

    private void setCity(String city) {
        cityAddressInput.sendKeys(city);
    }

    private void setSecondAddress(String secondAddress) {
        secondAddressInput.sendKeys(secondAddress);
    }

    private void setFirstAddress(String firstAddress) {
        firstAddressInput.sendKeys(firstAddress);
    }

    private void setFullName(String fullName) {
        fullNameInput.sendKeys(fullName);
    }


}
