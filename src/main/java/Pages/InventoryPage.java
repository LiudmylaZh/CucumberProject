package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {
    public SelenideElement inventoryList = $ (byClassName ("inventory_list"));
    public SelenideElement burgerMenu = $ (byId("react-burger-menu-btn"));
    public SelenideElement addToCartFirstProduct = $ (byId("add-to-cart-sauce-labs-backpack"));
    public SelenideElement indicatorOfAddedProductsToTheCart = $ (byClassName("shopping_cart_link"));

    public SelenideElement removeFirstProduct = $ (byTextCaseInsensitive("Remove"));
    public SelenideElement indicatorOfEmptyCart = $ (byClassName("shopping_cart_badge"));
    public SelenideElement cartIcon = $ (byId("shopping_cart_container"));

}
