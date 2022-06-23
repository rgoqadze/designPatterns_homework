package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FormsPage {
    WebDriver driver;

    @FindBy(id = "firstName")
    public SelenideElement FirstName;
    @FindBy(id = "lastName")
    public SelenideElement LastName;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    public SelenideElement Gender;
    @FindBy(id = "userNumber")
    public SelenideElement PhoneNumber;
    @FindBy(id = "submit")
    public SelenideElement Submit;
    @FindBy(id = "example-modal-sizes-title-lg")
    public SelenideElement ThanksText;
    public SelenideElement
        stundetNameText = $(byTagName("tbody")).$(byTagName("tr"), 0).$(By.tagName("td"),1),
        phoneNumberText = $(byTagName("tbody")).$(byTagName("tr"), 3).$(By.tagName("td"),1);

    public FormsPage(){
        this.driver =driver;
    }
}
