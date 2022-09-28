package starter;

import net.thucydides.core.annotations.Step;

public class Work {

    @Step("I am on the home page")
    public void onTheHomePage() {
        System.out.println("I am on the home page");
    }

    @Step("I clik Work button")
    public void clickWorkButton() {
        System.out.println("I clik Work button");
    }

    @Step("I am on the Work page")
    public void onTheWorkPage() {
        System.out.println("I am on the Work page");
    }

    @Step("I am success see and click some Work")
    public void succesSeeAndClickSomeWork() {
        System.out.println("I am success see and click some Work");
    }

}