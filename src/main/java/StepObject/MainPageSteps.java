package StepObject;

import PageObject.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPageSteps {
    WebDriver driver;
    public MainPageSteps ClickForm() {
        MainPage field= PageFactory.initElements(driver, MainPage.class);
        field.Forms.click();
        return this;
    }
}
