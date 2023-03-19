package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement checkoutButton = $ (byId ("checkout"));
    public SelenideElement inputFieldFirstName = $ (byId("first-name"));
    public  SelenideElement inputFieldLastName = $ (byId("last-name"));
    public SelenideElement inputFieldZipcode = $ (byId("postal-code"));
    public  SelenideElement continueButton = $ (byId("continue"));
    public  SelenideElement finishButton = $ (byId("finish"));
    public SelenideElement statusTextOfPurchase = $ (byClassName("complete-header"));


}
