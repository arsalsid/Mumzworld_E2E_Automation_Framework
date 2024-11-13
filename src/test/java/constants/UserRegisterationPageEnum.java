package constants;

public enum UserRegisterationPageEnum {

    CLICK_ON_CREATE_ACCOUNT("//a[@title='Create Account']"),
    ENTER_FIRST_NAME("//a[@title='Create Account']"),
    ENTER_LAST_NAME("//a[@title='Create Account']"),
    ENTER_EMAIL("//a[@title='Create Account']"),
    ENTER_PASSWORD("//a[@title='Create Account']"),
    CLICK_ON_CREATE_ACC_BTN("//button[@id='register_btn']"),


    ;

    public String desc;

    UserRegisterationPageEnum(String description) {
        this.desc = description;
    }

    public String getLocator() {
        return desc;
    }
}


