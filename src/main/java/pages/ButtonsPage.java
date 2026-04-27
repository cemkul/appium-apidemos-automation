package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ButtonsPage extends BasePage {

    private final By normalButton =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"Normal\")");

    private final By smallButton =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"Small\")");

    @Step("Verify Normal button is visible")
    public boolean isNormalButtonVisible() {
        return isDisplayed(normalButton);
    }

    @Step("Verify Small button is visible")
    public boolean isSmallButtonVisible() {
        return isDisplayed(smallButton);
    }
}