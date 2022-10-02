package starter.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.ResolvableElement;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {
    private By usernameField() {
        return (By) By.id("userName-label");
    }

    private By passwordField() {
        return (By) By.id("password-label");
    }

    private By loginbutton() {
        return (By) By.id("userForm");

    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginbutton()).isDisplayed();
    }

    @Step
    public void inputUserName(String username) {
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickloginButton() {
        $(loginbutton()).click();
    }


}
