package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import constants.ProductDetailsPageEnum;
import utils.Utilities;

public class ProductDetailsPage extends DriverFactory {


    public void AddToCartProduct () throws Exception {

        //Validate Add to Cart Page and Click on Add to Cart Button
        String getExpectedResult = PropertyReader.getInstance().readProperty("expectedProductName");
        Utilities.validateText(ProductDetailsPageEnum.VALIDATE_PRODUCT_NAME_OF_ITEM.getLocator(),getExpectedResult);
        Utilities.waitForElementToBeClickable(ProductDetailsPageEnum.CLICK_ADD_TO_CART_BTN.getLocator());
        Utilities.toBeClickOnButton(ProductDetailsPageEnum.CLICK_ADD_TO_CART_BTN.getLocator());

        //Validate Item added in Cart and Click on View Cart Button
        Utilities.waitForElementToBeClickable(ProductDetailsPageEnum.CLICK_ON_VIEW_CART_BTN.getLocator());
        String getExpectedCartItem = PropertyReader.getInstance().readProperty("expectedItemAddedInCart");
        Utilities.validateText(ProductDetailsPageEnum.VALIDATE_ITEM_ADDED_TO_CART.getLocator(),getExpectedCartItem);
        Utilities.toBeClickOnButton(ProductDetailsPageEnum.CLICK_ON_VIEW_CART_BTN.getLocator());


    }
}
