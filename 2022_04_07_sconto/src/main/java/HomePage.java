import com.codeborne.selenide.Condition;
import util.PropertiesLoader;
import org.checkerframework.checker.index.qual.UpperBoundUnknown;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class HomePage extends HeaderMenu { // мы привязали headerMenu

    /* Properties */
    public static String basicURL = PropertiesLoader.loadProperty("url");


    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");

    public void clickAcceptCookies() {
        $(acceptBtn).click();
    }
}