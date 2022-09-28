package starter;

import net.thucydides.core.annotations.Step;

public class Login {

    @Step("I am on the login page")
    public void onTheLoginPage() {
        System.out.println("I am on the login page");
    }

    @Step("I enter my username and password correctly")
    public void enterUsernameAndPassword() {
        System.out.println("I enter my username and password correctly");
    }

    @Step("I clik login button")
    public void clickLoginButton() {
        System.out.println("i click login button");
    }

    @Step("I am on the home page")
    public void onTheHomePage() {
        System.out.println("I am on the home page");
    }

}
