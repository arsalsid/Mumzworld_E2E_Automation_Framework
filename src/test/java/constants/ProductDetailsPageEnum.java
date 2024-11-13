package constants;

public enum ProductDetailsPageEnum {

    VALIDATE_PRODUCT_NAME_OF_ITEM("//h2[text()='Little Angel - Baby Swing Chair - Grey']"),
    VALIDATE_ITEM_ADDED_TO_CART("//h3[text()='Item added to cart']"),
    CLICK_ADD_TO_CART_BTN("//button[@title='Add to Cart' and text()= 'Add to Cart']"),
    CLICK_ON_VIEW_CART_BTN("//a[@title='View Cart']"),


    ;

    public String desc;

    ProductDetailsPageEnum(String description) {
        this.desc = description;
    }

    public  String getLocator() {
        return desc;
    }
}

