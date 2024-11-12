package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import constants.ProductListingPageEnum;
import utils.Utilities;

import java.io.IOException;

public class ProductListingPage extends DriverFactory {

    public void verifyTitleOfProductPage(String expectedValue) {
        Utilities.AssertTitle(expectedValue);
    }

    public void selectProductItem() throws IOException {
        String item = PropertyReader.getInstance().readProperty("selectProduct");
        String getExpectedResult = PropertyReader.getInstance().readProperty("expectedProductPrice");
        Utilities.validateText(ProductListingPageEnum.VALIDATE_PRICE_OF_ITEM.getLocator(), getExpectedResult);
        System.out.println("Product Item Name: " +item);
        Utilities.toBeClickOnButton(ProductListingPageEnum.CLICK_ON_ITEM.getLocator());
    }
}
