package patterns.pageObject.pages;

import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.decorator.elements.TextInput;
import patterns.pageObject.BasePage;

public class LogInPage extends BasePage {
    @FindBy(xpath = "//input[contains(@id,'ap_email')]")
    private TextInput emailInput;

    @FindBy(xpath = "//input[contains(@id,'ap_password')]")
    private TextInput passwordInput;

    @FindBy(xpath = "//input[contains(@id,'continue')]")
    private Button continueButton;

    @FindBy(xpath = "//input[contains(@id,'signInSubmit')]")
    private Button signInButton;

    public void setEmail(String email){
        emailInput.sendKeys(email);
    }

    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }

    public  void clickContinueButton(){
        continueButton.click();
    }

    public void clickSignInButton(){
        signInButton.click();
    }
}
