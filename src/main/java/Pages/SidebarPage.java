package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class SidebarPage {
    public SelenideElement logoutButton = $ (byId("logout_sidebar_link"));
    public SelenideElement resetAppStateButton = $ (byId("reset_sidebar_link"));
}
