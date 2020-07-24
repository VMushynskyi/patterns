package patterns.buisnessobjects;

import patterns.pageObject.pages.LogInPage;

public class LogInBO {

    private LogInPage logInPage;

    public LogInBO(){
        logInPage = new LogInPage();
    }

    public void login(String email, String password){
        logInPage.setEmail(email);
        logInPage.clickContinueButton();
        logInPage.setPassword(password);
        logInPage.clickSignInButton();
    }

    public void signInWithEmail(String email){
        logInPage.setEmail(email);
        logInPage.clickSignInButton();
    }

}
