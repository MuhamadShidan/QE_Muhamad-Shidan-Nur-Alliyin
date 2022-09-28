package starter;

import net.thucydides.core.annotations.Step;

public class Message {

    @Step("I am on the home page")
    public void onTheHomePage() {
        System.out.println("I am on the home page");
    }

    @Step("I clik Message button")
    public void clickMessageButton() {
        System.out.println("I clik Message button");
    }

    @Step("I am on the Message page")
    public void onTheMessagePage() {
        System.out.println("I am on the Message page");
    }

    @Step("I am success write and send message")
    public void succesWriteAndSendMessage() {
        System.out.println("I am success write and send message");
    }

}

