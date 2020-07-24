package patterns.buisnessobjects;

import patterns.pageObject.pages.MainPage;

public class MainBO {

    private MainPage mainPage;

    public  MainBO(){
        mainPage = new MainPage();
    }

    public void startLogin(){
        mainPage.clickMyAccountButton();
    }
}
