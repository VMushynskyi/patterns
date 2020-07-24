package patterns.strategy;

import patterns.pageObject.pages.ShippingPaymentPage;

public class GiftCardStrategy implements PayingStrategy {

    private ShippingPaymentPage shippingPaymentPage;

    public GiftCardStrategy (){
        shippingPaymentPage = new ShippingPaymentPage();
    }

    @Override
    public void pay() {
        shippingPaymentPage.setGiftsCode(System.getProperty("giftCode"));
        shippingPaymentPage.clickApplyButton();
    }
}
