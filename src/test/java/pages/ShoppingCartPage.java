package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import constants.ShoppingCartPageEnum;
import utils.Utilities;

import java.io.IOException;

public class ShoppingCartPage extends DriverFactory{

    public void verifyTitleOfPage(String expectedValue) {
        Utilities.AssertTitle(expectedValue);
    }

    public void checkOut () throws IOException {

        String subTotalPrice = PropertyReader.getInstance().readProperty("expectedShoppingCart");
        Utilities.validateProduct(ShoppingCartPageEnum.VALIDATE_SHOPPING_CART.getLocator(),subTotalPrice);
        Utilities.waitForElementToBeClickable(ShoppingCartPageEnum.INCREASE_QTY_BTN.getLocator());
        Utilities.incrementQuantity(ShoppingCartPageEnum.INCREASE_QTY_BTN.getLocator());
        Utilities.toBeClickOnButton(ShoppingCartPageEnum.CLICK_ON_PROCEED_TO_CHECKOUT_BTN.getLocator());
    }


}
