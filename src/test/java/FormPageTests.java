import DataObject.StudentInfoData;
import PageObject.FormsPage;
import StepObject.FormPageSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class FormPageTests extends Runner implements StudentInfoData {

    @Test
    public void FillFormIputs() {
        FormPageSteps steps = new FormPageSteps();
        FormsPage asserts = new FormsPage();
        steps.ClickForm();
        steps.ClickPracticeForm();
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
