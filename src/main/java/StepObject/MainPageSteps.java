package StepObject;
import PageObject.MainPage;
import io.qameta.allure.Step;


public class MainPageSteps extends MainPage {
    @Step
    public MainPageSteps ClickForm() {
        Forms.click();
        return this;
    }
}
