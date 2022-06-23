package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"item-0\"]")
    public SelenideElement PracticeForms;

    public PracticeFormPage (WebDriver driver){
        this.driver = driver;
    }
}


