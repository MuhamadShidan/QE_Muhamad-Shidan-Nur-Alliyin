package starter;

import net.thucydides.core.annotations.Step;

public class Logout {

    @Step("I am want to the logout account")
    public void wantToLogoutAccount() {
        System.out.println("I am want to the logout account");
    }

    @Step("I clik I button")
    public void clickIButton() {
        System.out.println("I clik I button");
    }

    @Step("I clik logout button")
    public void clickLogoutButton() {
        System.out.println("I clik logout button");
    }

    @Step("I am on the register page")
    public void onTheRegisterPage() {
        System.out.println("I am on the register page");
    }

}