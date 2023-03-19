package Steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class CartSteps extends BaseSteps{
    @Then("^I continue checkout purchase$")
    public void iContinueCheckoutPurchase() {
        cartPage.checkoutButton.click();
    }

    @Then("^I enter with first name \"([^\"]*)\", last name \"([^\"]*)\"and zipcode \"([^\"]*)\"$")
    public void iEnterWithFirstNameLastNameAndZipcode(String firstNameValue, String lastNameValue, String zipcodeValue) {
        cartPage.inputFieldFirstName.setValue(firstNameValue);
        cartPage.inputFieldLastName.setValue(lastNameValue);
        cartPage.inputFieldZipcode.setValue(zipcodeValue);
    }


    @Then("^I successfully finish purchase$")
    public void iSuccessfullyFinishPurchase() {
        cartPage.continueButton.click();
        cartPage.finishButton.shouldBe(Condition.visible);
        cartPage.finishButton.click();
        cartPage.statusTextOfPurchase.shouldHave(Condition.text("Thank you for your order!"));
    }
}
