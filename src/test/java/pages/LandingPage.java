package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import constants.LandingPageEnum;
import utils.Utilities;

public class LandingPage extends DriverFactory {

    public void verifyTitleOfPage(String expectedValue) {
        Utilities.AssertTitle(expectedValue);
    }
    public void searchProduct() throws Exception {
        String product = PropertyReader.getInstance().readProperty("searchProduct");
        Utilities.enterText(LandingPageEnum.ENTER_SEARCHED_PRODUCT.getLocator(), product);
        System.out.println("Searched Product : " +product);
        Utilities.clickOnButton(LandingPageEnum.CLICK_ON_SEARCHED_BTN.getLocator());
    }

}
