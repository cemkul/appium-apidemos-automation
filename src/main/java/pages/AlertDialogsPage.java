package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class AlertDialogsPage extends BasePage {

    private final By okCancelDialog =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"OK Cancel dialog with a message\")");

    private final By okButton =
            AppiumBy.id("android:id/button1");

    @Step("Open OK Cancel dialog")
    public void openOkCancelDialog() {
        click(okCancelDialog);
    }

    @Step("Click OK button on dialog")
    public void clickOk() {
        click(okButton);
    }
}