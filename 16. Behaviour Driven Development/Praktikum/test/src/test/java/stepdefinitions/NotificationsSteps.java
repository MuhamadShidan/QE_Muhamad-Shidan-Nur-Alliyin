package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Notifications;

public class NotificationsSteps {

    @Steps
    Notifications notifications;

    @Given("I am on the home page")
    public void onTheHomePage() {
        notifications.onTheHomePage();
    }

    @When("I clik notifications button")
    public void clickNotificationsButton() {
        notifications.clickNotificationsButton();
    }

    @And("I am on the notifications page")
    public void onTheNotificationsPage() {
        notifications.onTheNotificationsPage();
    }

    @Then("I am success see and click some notifications")
    public void succesSeeAndClickSomeNotifications() {
        notifications.succesSeeAndClickSomeNotifications();
    }
}

