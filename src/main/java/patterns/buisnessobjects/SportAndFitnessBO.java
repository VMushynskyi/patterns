package patterns.buisnessobjects;

import patterns.pageObject.pages.RightOrderPage;
import patterns.pageObject.pages.SportAndFitnessPage;

public class SportAndFitnessBO {

    private SportAndFitnessPage sportAndFitnessPage;
    private RightOrderPage rightOrderPage;

    public SportAndFitnessBO(){
        sportAndFitnessPage = new SportAndFitnessPage();
        rightOrderPage = new RightOrderPage();
    }

    public void orderedFirstProduct(){
        sportAndFitnessPage.selectsFirstProduct();
        rightOrderPage.clickBuyNow();
    }
}
