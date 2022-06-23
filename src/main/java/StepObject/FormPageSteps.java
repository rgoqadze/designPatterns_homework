package StepObject;

import PageObject.FormsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FormPageSteps  {
     WebDriver driver;


    public FormPageSteps FillFirstName (String FirstNameValue){
        FormsPage field= PageFactory.initElements(driver, FormsPage.class);
        field.FirstName.sendKeys(FirstNameValue);
        return this;
    }

    public FormPageSteps FillLastName (String LastNameValue) {
        FormsPage field= PageFactory.initElements(driver, FormsPage.class);
        field.LastName.sendKeys(LastNameValue);
        return this;
    }

    public FormPageSteps ChooseGender(){
        FormsPage field= PageFactory.initElements(driver, FormsPage.class);
        field.Gender.click();
        return this;
    }

    public FormPageSteps FillPhoneNumber(String PhoneNumberValue) {
        FormsPage field= PageFactory.initElements(driver, FormsPage.class);
        field.PhoneNumber.sendKeys(PhoneNumberValue);
        return this;
    }

    public FormPageSteps ClickSubmit() {
        FormsPage field= PageFactory.initElements(driver, FormsPage.class);
        field.Submit.click();
        return this;
    }

}
