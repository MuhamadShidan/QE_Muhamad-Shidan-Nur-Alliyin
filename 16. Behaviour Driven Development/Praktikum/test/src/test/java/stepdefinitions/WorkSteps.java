package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Work;

public class WorkSteps {

    @Steps
    Work work;

    @Given("I am on the home page")
    public void onTheHomePage() {
        work.onTheHomePage();
    }

    @When("I clik Work button")
    public void clickWorkButton() {
        work.clickWorkButton();
    }

    @And("I am on the Work page")
    public void onTheWorkPage() {
        work.onTheWorkPage();
    }

    @Then("I am success see and click some Work")
    public void succesSeeAndClickSomeWork() {
        work.succesSeeAndClickSomeWork();
    }
}

