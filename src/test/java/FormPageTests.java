import DataObject.StudentInfoData;
import PageObject.FormsPage;
import PageObject.MainPage;
import StepObject.FormPageSteps;
import StepObject.MainPageSteps;
import StepObject.PracticeFormsPageSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class FormPageTests extends Runner implements StudentInfoData {
    FormPageSteps steps = new FormPageSteps();
    MainPageSteps step = new MainPageSteps();
    PracticeFormsPageSteps Steps = new PracticeFormsPageSteps();
    FormsPage asserts = new FormsPage();

    @Test(description = "Fill Students Fomr")
    @Description("Fill Studends Form")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Student information")
    @Attachment(value="web page Screenshot",type="image/png")
    public void FillFormIputs() {
        step.ClickForm();
        Steps.ClickPracticeForm();
        steps.FillFirstName(FirstNameValue)
        .FillLastName(LastnameValue);
        steps.ChooseGender();
        steps.FillPhoneNumber(PhoneNumberValue);
        steps.ClickSubmit();
        asserts.ThanksText.shouldHave(Condition.text("Thanks for submitting the form")).isDisplayed();
        asserts.stundetNameText.shouldHave(Condition.text(FirstNameValue + " " + LastnameValue));
        asserts.phoneNumberText.shouldHave(Condition.text(PhoneNumberValue));
    }
}
