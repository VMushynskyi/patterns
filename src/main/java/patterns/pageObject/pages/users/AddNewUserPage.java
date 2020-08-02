package patterns.pageObject.pages.users;

import org.openqa.selenium.support.FindBy;
import patterns.builder.RegisterBuilder;
import patterns.decorator.elements.Button;
import patterns.decorator.elements.PageElement;
import patterns.decorator.elements.TextInput;
import patterns.pageObject.BasePage;

public class AddNewUserPage extends BasePage {
  @FindBy(id = "user_login")
  private TextInput userNameInput;

  @FindBy(id = "first_name")
  private TextInput firstNameInput;

  @FindBy(id = "last_name")
  private TextInput lastNameInput;

  @FindBy(id = "email")
  private TextInput emailInput;

  @FindBy(id = "url")
  private TextInput websiteInput;

  @FindBy(id = "role")
  private PageElement roleDropDown;

  @FindBy(id = "createusersub")
  private Button addNewUserButton;

  public void createNewUserPage(RegisterBuilder registerBuilder){
    setUserFields(registerBuilder);
    clickAddNewUserButton();
  }

  private void clickAddNewUserButton() {
    addNewUserButton.click();
  }

  private void setUserFields(RegisterBuilder registerBuilder) {
    setUserNameInput(registerBuilder.getUserName());
    setFirstNameInput(registerBuilder.getFirstName());
    setLastNameInput(registerBuilder.getLastName());
    setEmailInput(registerBuilder.getEmail());
    setWebSite(registerBuilder.getWebSite());
    setRole(registerBuilder.getRole());
  }

  private void setWebSite(String url) {
    websiteInput.sendKeys(url);
  }

  private void setRole(String role) {
    roleDropDown.sendKeys(role);
  }

  private void setLastNameInput(String fullName) {
    lastNameInput.sendKeys(fullName);
  }

  private void setFirstNameInput(String name) {
//    try {
//      Thread.sleep(5000);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    userNameInput.sendKeys(name);
  }

  private void setEmailInput(String email) {
    emailInput.sendKeys(email);
  }

  private void setUserNameInput(String name){
    userNameInput.sendKeys(name);
  }
}
