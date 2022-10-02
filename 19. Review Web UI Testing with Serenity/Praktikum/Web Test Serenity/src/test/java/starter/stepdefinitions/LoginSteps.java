package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage LoginPage;

    @Given("I am on the login page")
    public void onTheLoginPage() {

    }
    @When("I input valid username")
    public void inputValidUsername() {

    }
    @And("I input valid password")
    public void inputValidPassword() {

    }
    @And("I click login button")
    public void clickLoginButton() {

    }
    @Then("I am on the home page")
    public void onTheHomePage() {

    }
}
