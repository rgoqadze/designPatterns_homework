import DataObject.StudentInfoData;
import PageObject.FormsPage;
import PageObject.MainPage;
import StepObject.FormPageSteps;
import StepObject.MainPageSteps;
import StepObject.PracticeFormsPageSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class FormPageTests extends Runner implements StudentInfoData {
    FormPageSteps steps = new FormPageSteps();
    MainPageSteps step = new MainPageSteps();
    PracticeFormsPageSteps Steps = new PracticeFormsPageSteps();
    FormsPage asserts = new FormsPage();

    @Test
    public void FillFormIputs() {
        step.ClickForm();
        Steps.ClickPracticeForm();
        steps.FillFirstName(FirstNameValue);
        steps.FillLastName(LastnameValue);
        steps.ChooseGender();
        steps.FillPhoneNumber(PhoneNumberValue);
        steps.ClickSubmit();
        asserts.ThanksText.shouldHave(Condition.text("Thanks for submitting the form")).isDisplayed();
        asserts.stundetNameText.shouldHave(Condition.text(FirstNameValue + " " + LastnameValue));
        asserts.phoneNumberText.shouldHave(Condition.text(PhoneNumberValue));
    }
}
