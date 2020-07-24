package patterns.strategy;

import patterns.pageObject.pages.ShippingPaymentPage;

public class CardStrategy implements PayingStrategy {

    private ShippingPaymentPage shippingPaymentPage;

    public CardStrategy (){
        shippingPaymentPage = new ShippingPaymentPage();
    }

    @Override
    public void pay() {
        shippingPaymentPage.clickAddNewCardButton();
        shippingPaymentPage.setCardNumberInput(System.getProperty("cardNumber"));
        shippingPaymentPage.setCardNameInput(System.getProperty("cardName"));
        shippingPaymentPage.setDayInDropDown(System.getProperty("cardDay"));
        shippingPaymentPage.setYearInDropDown(System.getProperty("cardYear"));
        shippingPaymentPage.clickAddYourCardButton();
    }

}
