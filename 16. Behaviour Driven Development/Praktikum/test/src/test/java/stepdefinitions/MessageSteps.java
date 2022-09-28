package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Message;

public class MessageSteps {

    @Steps
    Message message;

    @Given("I am on the home page")
    public void onTheHomePage() {
        message.onTheHomePage();
    }

    @When("I clik Message button")
    public void clickMessageButton() {
        message.clickMessageButton();
    }

    @And("I am on the Message page")
    public void onTheMessagePage() {
        message.onTheMessagePage();
    }

    @Then("I am success write and send message")
    public void succesWriteAndSendMessage() {
        message.succesWriteAndSendMessage();
    }
}

