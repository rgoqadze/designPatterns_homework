package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FormsPage {

    public SelenideElement
        FirstName = $(byId("firstName")),
        LastName = $(byId("lastName")),
        Gender = $(byAttribute("for", "gender-radio-1")),
        PhoneNumber = $(byId("userNumber")),
        Submitt = $(byId("submit")),
        ThanksText = $(byId("example-modal-sizes-title-lg")),
        stundetNameText = $(byTagName("tbody")).$(byTagName("tr"), 0).$(By.tagName("td"),1),
        phoneNumberText = $(byTagName("tbody")).$(byTagName("tr"), 3).$(By.tagName("td"),1);
}
