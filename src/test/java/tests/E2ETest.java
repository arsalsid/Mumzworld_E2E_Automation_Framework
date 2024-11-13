package tests;

import baseTest.DriverFactory;
import org.testng.annotations.Test;
import pages.*;
import utils.Utilities;
import java.lang.reflect.Method;
import static utils.extentReports.ExtentTestManager.startTest;


public class E2ETest extends DriverFactory {

    LandingPage landingPage = new LandingPage();
    ProductListingPage productListingPage = new ProductListingPage();
    ProductDetailsPage productDetails = new ProductDetailsPage();

    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    UserRegisterationPage userRegister = new UserRegisterationPage();

    //Landing Page
    @Test(description = "Verify Title of landingPage", priority = 1)
    public void verifyTitleOfLandingPage(Method method) throws Exception {
        startTest(method.getName(), "Verify Title of landingPage");
        landingPage.verifyTitleOfPage("#1 Mother, Child & Baby Shop in the UAE - Mumzworld");
        Utilities.takeScreenshot(driver,"LandingPage");
    }

    @Test(description = "User Enter the product item in a search bar", priority = 2)
    public void enterSearchItemOnLandingPage(Method method) throws Exception {
        startTest(method.getName(), "Enter Search Item on LandingPage");
        landingPage.searchProduct();
        Utilities.takeScreenshot(driver,"LandingPage");
    }
    //Product Listing Page
    @Test(description = "Verify Title of Product Listing Page", priority = 3)
    public void verifyTitleOfProductPage(Method method) throws Exception {
        startTest(method.getName(), "Verify Title of ProductPage");
        productListingPage.verifyTitleOfProductPage("Little Angel - Baby Swing Chair - Grey - English Search");
        Utilities.takeScreenshot(driver,"Product Listing Page");
    }
    @Test(description = "Select Products of Product Listing Page", priority = 4)
    public void selectProductsOfProductListingPage(Method method) throws Exception {
        startTest(method.getName(), "Select Products of ProductListingPage");
        productListingPage.selectProductItem();
        Utilities.takeScreenshot(driver,"ProductListingPage");
    }

    @Test(description = "Add to Cart Product Details Page", priority = 5)
    public void addToCartOnProductDetailsPage(Method method) throws Exception {
        startTest(method.getName(), "Add to Cart ProductDetailsPage");
        productDetails.AddToCartProduct();
        Utilities.takeScreenshot(driver,"ProductDetailsPage");
    }

    @Test(description = "Verify Title of Shopping Cart Page", priority = 6)
    public void verifyTitleOfShoppingCartPage(Method method) throws Exception {
        startTest(method.getName(), "Verify Title of Shopping Cart Page");
        shoppingCart.verifyTitleOfPage("Cart - English");
        Utilities.takeScreenshot(driver,"Shopping Cart Page");
    }
    @Test(description = "Check Out Of Shopping Cart Product", priority = 7)
    public void shoppingCart(Method method) throws Exception {
        startTest(method.getName(), "Check Out Of Shopping Cart");
        shoppingCart.checkOut();
        Utilities.takeScreenshot(driver,"Shopping Cart Page");
    }

    @Test(description = "Verify Title of Register User Page", priority = 6)
    public void verifyTitleOfRegisterUserPage(Method method) throws Exception {
        startTest(method.getName(), "Verify Title of Register User Page");
        userRegister.verifyTitleOfPage("Create account - English");
        Utilities.takeScreenshot(driver,"Register User Page");
    }
    @Test(description = "New User Registeration", priority = 7)
    public void userRegisteration(Method method) throws Exception {
        startTest(method.getName(), "Verify New user Registeration");
        userRegister.registerNewUser();
        Utilities.takeScreenshot(driver,"Registeration  Page");
    }



}
