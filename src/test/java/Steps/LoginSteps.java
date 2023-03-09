package Steps;

import Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;


public class LoginSteps extends BaseSteps {
    @Given("^I open login page$")
    public void iOpenLoginPage() {
        open("https://www.saucedemo.com/");
    }

    @When("^I enter \"([^\"]*)\" to username input field$")
    public void iEnterToUsernameInputField(String userNameValue)  {
        loginPage.userNameInputFiled.shouldBe(visible,Duration.ofSeconds(10));
        loginPage.userNameInputFiled.setValue(userNameValue);


    }

    @And("^I enter \"([^\"]*)\" to password input field$")
    public void iEnterToPasswordInputField(String password) {
        loginPage.passwordInputFiled.setValue(password);

    }

    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        loginPage.loginButton.shouldBe(enabled, Duration.ofSeconds(10));
        loginPage.loginButton.click();
    }



}
