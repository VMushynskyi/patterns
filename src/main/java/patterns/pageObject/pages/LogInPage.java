package patterns.pageObject.pages;

import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.decorator.elements.TextInput;
import patterns.pageObject.BasePage;

public class LogInPage extends BasePage {
    @FindBy(id = "user_login")
    private TextInput emailInput;

    @FindBy(id = "user_pass")
    private TextInput passwordInput;

    @FindBy(xpath = "//input[contains(@id,'continue')]")
    private Button continueButton;

    @FindBy(id = "wp-submit")
    private Button logIn;

    public void setEmail(String email){
        emailInput.sendKeys(email);
    }

    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }

    public  void clickContinueButton(){
        continueButton.click();
    }

    public void clickLogInButton(){
        logIn.click();
    }
}
