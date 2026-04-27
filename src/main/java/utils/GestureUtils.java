package utils;

import base.DriverFactory;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class GestureUtils {

    @Step("Scroll down until text is visible: {text}")
    public static void scrollDownUntilTextVisible(String text) {
        DriverFactory.getDriver().findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))" +
                                ".setAsVerticalList()" +
                                ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"
                )
        );
    }

    @Step("Scroll down until text is visible and click: {text}")
    public static void scrollDownToTextAndClick(String text) {
        scrollDownUntilTextVisible(text);

        By targetElement = AppiumBy.androidUIAutomator(
                "new UiSelector().text(\"" + text + "\")"
        );

        WaitUtils.waitForClickable(targetElement).click();
    }
}