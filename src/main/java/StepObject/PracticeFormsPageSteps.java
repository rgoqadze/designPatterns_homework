package StepObject;

import PageObject.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormsPageSteps {
    WebDriver driver;
    public PracticeFormsPageSteps ClickPracticeForm() {
        PracticeFormPage field= PageFactory.initElements(driver, PracticeFormPage.class);
        field.PracticeForms.click();
        return this;
    }
}
