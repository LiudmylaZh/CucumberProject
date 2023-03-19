package Steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class InventorySteps extends BaseSteps{



    @Then("^I anm open sidebar and press Reset App State button$")
    public void iAnmOpenSidebarAndPressResetAppStateButton() {
        inventoryPage.burgerMenu.click();
        sidebarPage.resetAppStateButton.click();

    }

    @When("^I add first product to the cart$")
    public void iAddFirstProductToTheCart() {
        inventoryPage.addToCartFirstProduct.shouldBe(Condition.enabled, Duration.ofSeconds(5));
        inventoryPage.addToCartFirstProduct.click();
    }

    @Then("^cart icon with value \"([^\"]*)\" is displayed$")
    public void cartIconWithValueIsDisplayed(String amountOfProducts) {
        inventoryPage.indicatorOfAddedProductsToTheCart.shouldHave(Condition.text(amountOfProducts));
        inventoryPage.indicatorOfAddedProductsToTheCart.shouldBe(Condition.visible);


    }


    @Then("^Added products successfully deleted$")
    public void addedProductsSuccessfullyDeleted() {
        inventoryPage.removeFirstProduct.click();
    }

    @Then("^The cart is empty$")
    public void theCartIsEmpty() {
        inventoryPage.indicatorOfEmptyCart.shouldBe(Condition.empty);

    }

    @Then("^I open cart$")
    public void iOpenCart() {
        inventoryPage.cartIcon.click();
    }


}
