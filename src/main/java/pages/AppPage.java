package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class AppPage extends BasePage {

    private final By alertDialogsOption =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"Alert Dialogs\")");

    @Step("Open Alert Dialogs screen")
    public void openAlertDialogs() {
        click(alertDialogsOption);
    }
}