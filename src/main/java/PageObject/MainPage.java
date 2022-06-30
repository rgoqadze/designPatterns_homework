package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement
            Forms = $(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
}
