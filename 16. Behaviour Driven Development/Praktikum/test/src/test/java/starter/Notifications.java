package starter;

import net.thucydides.core.annotations.Step;

public class Notifications {

    @Step("I am on the home page")
    public void onTheHomePage() {
        System.out.println("I am on the home page");
    }

    @Step("I clik notifications button")
    public void clickNotificationsButton() {
        System.out.println("I clik notifications button");
    }

    @Step("I am on the notifications page")
    public void onTheNotificationsPage() {
        System.out.println("I am on the notifications page");
    }

    @Step("I am success see and click some notifications")
    public void succesSeeAndClickSomeNotifications() {
        System.out.println("I am success see and click some notifications");
    }

}