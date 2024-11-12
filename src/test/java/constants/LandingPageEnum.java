package constants;

public enum LandingPageEnum {

    ENTER_SEARCHED_PRODUCT ("//input[@type='search']"),
    CLICK_ON_SEARCHED_BTN ("//button[@id='search_btn']"),


    ;

    public String desc;
    LandingPageEnum(String description) {
        this.desc = description;
    }

    public  String getLocator() {
        return desc;
    }
}

