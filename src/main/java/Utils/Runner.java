package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class Runner {
    @BeforeMethod
    public void Configuration() {
        Configuration.timeout = 2000;
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.reopenBrowserOnFail = true;
        ScreenShooter.captureSuccessfulTests = false;
        open("https://demoqa.com/");
    }
}
