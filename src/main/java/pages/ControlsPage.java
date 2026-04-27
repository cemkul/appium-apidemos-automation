package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ControlsPage extends BasePage {

    private final By darkThemeOption = AppiumBy.accessibilityId("2. Dark Theme");
    private final By lightThemeOption =
            AppiumBy.accessibilityId("1. Light Theme");
    @Step("Open 1. Dark Theme screen")
    public void openDarkTheme() {
        click(darkThemeOption);
    }
    @Step("Open 1. Light Theme screen")
    public void openLightTheme() {
        click(lightThemeOption);
    }
}