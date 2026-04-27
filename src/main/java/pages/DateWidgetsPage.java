package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DateWidgetsPage extends BasePage {

    private final By dialogOption =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"1. Dialog\")");

    private final By changeDateButton =
            AppiumBy.accessibilityId("change the date");

    @Step("Open Dialog screen")
    public void openDialog() {
        click(dialogOption);
    }

    @Step("Click Change Date button")
    public void clickChangeDate() {
        click(changeDateButton);
    }
}