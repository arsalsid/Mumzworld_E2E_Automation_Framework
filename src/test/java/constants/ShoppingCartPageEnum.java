package constants;

public enum ShoppingCartPageEnum {

    VALIDATE_SHOPPING_CART ("//h1[text()='Cart']"),
    INCREASE_QTY_BTN("//button[@id='increase_button']"),
    DECREASE_QTY_BTN("//button[@id='decrease_button']"),
    CLICK_ON_PROCEED_TO_CHECKOUT_BTN("//button[text()='Proceed to Checkout']"),



    ;

    public String desc;
    ShoppingCartPageEnum(String description) {
        this.desc = description;
    }

    public  String getLocator() {
        return desc;
    }
}

