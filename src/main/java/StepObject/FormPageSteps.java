package StepObject;

import PageObject.FormsPage;

public class FormPageSteps extends FormsPage {
    public FormsPage ClickForm() {
        Forms.click();
        return this;
    }

    public FormsPage ClickPracticeForm() {
        PracticeForms.click();
        return this;
    }

    public FormPageSteps FillFirstName (String FirstNameValue){
        FirstName.sendKeys(FirstNameValue);
        return this;
    }

    public FormsPage FillLastName (String LastNameValue) {
        LastName.sendKeys(LastNameValue);
        return this;
    }

    public FormsPage ChooseGender(){
        Gender.click();
        return this;
    }

    public FormsPage FillPhoneNumber(String PhoneNumberValue) {
        PhoneNumber.sendKeys(PhoneNumberValue);
        return this;
    }

    public FormsPage ClickSubmit() {
        Submitt.click();
        return this;
    }

}
