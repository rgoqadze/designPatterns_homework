package StepObject;

import PageObject.PracticeFormPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormsPageSteps extends PracticeFormPage {
    @Step("Go To Practice Form Page")
    public PracticeFormsPageSteps ClickPracticeForm() {
        PracticeForms.click();
        return this;
    }
}
