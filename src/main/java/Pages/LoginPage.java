package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement userNameInputFiled = $ (byId("user-name"));
    public SelenideElement passwordInputFiled = $ (byId("password"));
    public SelenideElement loginButton = $ (byId("login-button"));
    public SelenideElement errorMessageElement =  $(byAttribute("data-test","error"));




}
