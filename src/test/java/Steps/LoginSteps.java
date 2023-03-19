package Steps;

import Pages.LoginPage;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;


public class LoginSteps extends BaseSteps {
    @Given("^I open login page$")
    public void iOpenLoginPage() {

        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
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
    @Then("^I am stay on the login page$")
    public void iAmStayOnTheLoginPage() {
        loginPage.errorMessageElement.shouldBe(visible);
        String timeUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(timeUrl.equals("https://www.saucedemo.com/"));

    }

    @Then("^The error massage with text \"([^\"]*)\" is displayed\\.$")
            public void theErrorMessageShouldHasText (String errorMessageText){
            loginPage.errorMessageElement.shouldHave(partialText(errorMessageText));
    }

    @Then("^I open sidebar$")
    public void iOpenSidebar() {

    }

    @When("^I login successfully with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginSuccessfullyWithUsernameAndPassword(String userNameValue, String passwordValue)  {
        loginPage.userNameInputFiled.setValue(userNameValue);
        loginPage.passwordInputFiled.setValue(passwordValue);
        loginPage.loginButton.click();
        inventoryPage.inventoryList.shouldBe(visible, Duration.ofSeconds(10));
    }

    @Then("^I am open sidebar and press logout button$")
    public void iAmOpenSidebarAndPressLogoutButton() {
        inventoryPage.burgerMenu.click();
        sidebarPage.logoutButton.click();
    }

    @Then("^I success logout$")
    public void iSuccessLogout() {
        loginPage.loginButton.shouldBe(visible);
    }



}
