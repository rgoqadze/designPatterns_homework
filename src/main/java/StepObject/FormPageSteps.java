package StepObject;

import PageObject.FormsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FormPageSteps extends FormsPage  {
    @Step("Fill Firstname Input{0}")
    public FormPageSteps FillFirstName (String FirstNameValue){
        FirstName.sendKeys(FirstNameValue);
        return this;
    }
    @Step("Fill Lastname Input{1}")
    public FormsPage FillLastName (String LastNameValue) {
        LastName.sendKeys(LastNameValue);
        return this;
    }
    @Step("Choose Gender - Male")
    public FormsPage ChooseGender(){
        Gender.click();
        return this;
    }
    @Step("Fill Phonenumber input{2}")
    public FormsPage FillPhoneNumber(String PhoneNumberValue) {
        PhoneNumber.sendKeys(PhoneNumberValue);
        return this;
    }
    @Step("Click SubmiT Button")
    public FormsPage ClickSubmit() {
        Submitt.click();
        return this;
    }
}
