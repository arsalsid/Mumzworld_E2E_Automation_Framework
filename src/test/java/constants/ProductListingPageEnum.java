package constants;

public enum ProductListingPageEnum {

    CLICK_ON_ITEM("//a[text()='Little Angel - Baby Swing Chair - Grey']"),
    VALIDATE_PRICE_OF_ITEM("//span[@class='Price_integer__3ngZQ' and text()='38']"),
    ;

    public String desc;

    ProductListingPageEnum(String description) {
        this.desc = description;
    }

    public  String getLocator() {
        return desc;
    }
}

