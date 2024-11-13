package pages;

import baseTest.PropertyReader;
import constants.UserRegisterationPageEnum;
import utils.Utilities;

import java.io.IOException;

public class UserRegisterationPage {

    public void verifyTitleOfPage(String expectedValue) {
        Utilities.AssertTitle(expectedValue);
    }
    public void registerNewUser() throws IOException {
        Utilities.clickOnButton(UserRegisterationPageEnum.CLICK_ON_CREATE_ACCOUNT.getLocator());

        String firstName = PropertyReader.getInstance().readProperty("firstName");
        Utilities.enterText(UserRegisterationPageEnum.ENTER_FIRST_NAME.getLocator(), firstName);

        String lastName = PropertyReader.getInstance().readProperty("lastName");
        Utilities.enterText(UserRegisterationPageEnum.ENTER_LAST_NAME.getLocator(), lastName);

        String email = PropertyReader.getInstance().readProperty("email");
        Utilities.enterText(UserRegisterationPageEnum.ENTER_EMAIL.getLocator(), email);

        String password = PropertyReader.getInstance().readProperty("password");
        Utilities.enterText(UserRegisterationPageEnum.ENTER_PASSWORD.getLocator(), password);

        Utilities.clickOnButton(UserRegisterationPageEnum.CLICK_ON_CREATE_ACC_BTN.getLocator());
    }
}