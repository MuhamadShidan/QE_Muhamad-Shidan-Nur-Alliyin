package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Logout;

public class LogoutSteps {

    @Steps
    Logout logout;

    @Given("I am want to the logout account")
    public void wantToLogoutAccount() {
        logout.wantToLogoutAccount();
    }

    @When("I clik I button")
    public void clickIButton() {
        logout.clickIButton();
    }

    @And("I clik logout button")
    public void clickLogoutButton() {
        logout.clickLogoutButton();
    }

    @Then("I am on the register page")
    public void onTheRegisterPage() {
        logout.onTheRegisterPage();
    }
}

